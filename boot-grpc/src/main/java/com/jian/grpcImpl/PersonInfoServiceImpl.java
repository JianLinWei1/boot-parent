package com.jian.grpcImpl;
import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.biology.entity.LjFeature;
import com.biology.face.FaceApi;
import com.biology.face.FaceApiImpl;
import com.google.common.primitives.Floats;
import com.google.protobuf.ByteString;
import com.jian.entity.LsPerson;
import com.jian.entity.LsRecord;
import com.jian.service.PrisonsPersonService;
import com.jian.util.DateUtil;
import com.jian.util.FileUtil;
import com.jian.util.HeartBeatUtil;
import com.jian.util.UuidUtil;
import com.ljzn.grpc.personinfo.PersonInfoAuthServiceGrpc.PersonInfoAuthServiceImplBase;
import com.ljzn.grpc.personinfo.PersonType;
import com.ljzn.grpc.personinfo.PersoninfoMessage.Builder;
import com.ljzn.grpc.personinfo.PersoninfoRequest;
import com.ljzn.grpc.personinfo.PersoninfoResponse;
import com.ljzn.grpc.personinfo.RecordInfo;
import com.ljzn.grpc.personinfo.UploadRecordInfoRequest;
import com.ljzn.grpc.personinfo.UploadRecordInfoResponse;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
/**
 * 监所人员信息 记录
 * @ClassName:  PersonInfoServiceImpl   
 * @Description:TODO   
 * @author: JianLinWei
 * @email: jianlinwei_dream@163.com
 * @date:   2019年1月17日 上午10:19:09   
 *
 */
@GrpcService
public class PersonInfoServiceImpl extends  PersonInfoAuthServiceImplBase {
	private  Logger  logger =  LoggerFactory.getLogger("GPRC监所人员实现类："+ PersonInfoServiceImpl.class);
	@Autowired
	PrisonsPersonService pps;
	/**
	 * 获取人员信息
	 */
	@Override
	 public void getPersonInfo(PersoninfoRequest request,StreamObserver<PersoninfoResponse> responseObserver) {
		HeartBeatUtil.setDeviceSeril(request.getDeviceSeril());
		responseObserver.onNext(getPersonInfo(request));
		responseObserver.onCompleted();
		      
	 }
	
	public PersoninfoResponse  getPersonInfo(PersoninfoRequest request){
		PersoninfoResponse.Builder   builder  =  PersoninfoResponse.newBuilder();
		try{
		/*PersoninfoMessage.Builder  mBuilder = builder.addPersonInfoBuilder();
		List<PersoninfoMessage> messages = new ArrayList<>();*/
		
		FaceApi api  = new FaceApiImpl();
		List<LsPerson>  lsPersons  =  pps.getLsPersonsByVersion(request.getVersion());
		for(LsPerson l : lsPersons){
			Builder  mBuilder = builder.addPersonInfoBuilder();
			mBuilder.setCardId(l.getCardid());
			mBuilder.setName(l.getName());
			mBuilder.setPersontype(PersonType.forNumber(l.getPersontype()));
			LjFeature ljFeature = api.ByteToFeature(l.getPhotofeatrue());
			List<Float>  floats  = Floats.asList(ljFeature.data);
			mBuilder.addAllPhotoFeature(floats);
			mBuilder.setPhotoFeatureLen(ljFeature.len);
			if(request.getNeedPhoto())
				mBuilder.setPhoto(ByteString.copyFrom(FileUtil.getPicture2Byte(l.getPhoto(), "upload/images/")));
			mBuilder.setVersion(l.getVersion());
			mBuilder.setAction(l.getAction());
			
			
			logger.info("获取人员cardid:"+mBuilder.getCardId());
		}
		System.out.println("人数："+ builder.getPersonInfoOrBuilderList().size());
		builder.setCode(1);
		builder.setMessage("ok");
		return  builder.build();
		}catch(Exception e){
			builder.setCode(-1);
			builder.setMessage("异常信息："+e.getMessage());
			logger.error(e.getMessage());
			return builder.build();
		}
	}
	
	 /**
	  * 记录上传
     */
    public void uploadRecordInfo(UploadRecordInfoRequest request,StreamObserver<UploadRecordInfoResponse> responseObserver) {
      UploadRecordInfoResponse.Builder  builder  = UploadRecordInfoResponse.newBuilder();
      try{
    	 List<RecordInfo> infos = request.getRecordInfoList();
    	 List<LsRecord>  records  = new ArrayList<>();
    	 
    	 for(RecordInfo r : infos){
    		 LsRecord lr  = new LsRecord();
    		 lr.setCardid(r.getCardId());
    		 lr.setDeviceseril(r.getDeviceSeril());
    		 lr.setName(r.getName());
    		 lr.setRecordid(UuidUtil.getUUID());
    		 lr.setVerifyPhoto(FileUtil.addPicture2Midkirs(r.getVerifyPhoto().toByteArray(), r.getCardId(), "upload/images/"));
    		 lr.setVerifyTime(DateUtil.String2Date(r.getVerifyTime(), "yyyy-MM-dd HH:mm:ss"));
    		 lr.setVerifyResult(r.getVerifyResult());
    		 lr.setVerifyScore(r.getVerifyScore());
    		 records.add(lr);
    	 }
    	  
    	 pps.addLsRecord(records);
    	 builder.setCode(1);
    	 builder.setMessage("ok");
    	 
      }catch(Exception e){
    	  e.printStackTrace();
    	  builder.setCode(-1);
    	  builder.setMessage("异常信息："+e.getMessage());
      }
      responseObserver.onNext(builder.build());
      responseObserver.onCompleted();
    	
    }

}
