package com.jian.grpcImpl;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.biology.entity.LjFeature;
import com.biology.face.FaceApi;
import com.biology.face.FaceApiImpl;
import com.google.common.primitives.Floats;
import com.jian.entity.LjDevice;
import com.jian.entity.LsPerson;
import com.jian.entity.LsRecord;
import com.jian.service.PrisonsPersonService;
import com.jian.util.DateUtil;
import com.jian.util.FileUtil;
import com.jian.util.HeartBeatUtil;
import com.jian.util.RecordUploadUtil;
import com.jian.util.ResultUtil;
import com.jian.util.UuidUtil;
import com.ljzn.grpc.client.VerifyRequest;
import com.ljzn.grpc.client.VerifyRequest.CriminalFeature;
import com.ljzn.grpc.client.VerifyResponse;
import com.ljzn.grpc.client.VerifyServiceGrpc;
import com.ljzn.grpc.client.VerifyServiceGrpc.VerifyServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
/***
 * 沙湾发送人员比对
 * @ClassName:  VerifyGrpc   
 * @Description:TODO   
 * @author: JianLinWei
 * @email: jianlinwei_dream@163.com
 * @date:   2019年2月21日 上午10:07:10   
 *
 */
@Component
public class VerifyGrpc {
	private  static Logger  logger =  LoggerFactory.getLogger(VerifyGrpc.class);
	
	private static  ManagedChannel  channel;
	
	private static  VerifyServiceBlockingStub blockingStub;
	
	
	
	@Async
	public  ResultUtil  verify(LjDevice device , LsPerson lsPerson , int delayTime ,PrisonsPersonService pps ,RecordUploadUtil util ){
		ResultUtil resultUtil  = new ResultUtil();
		try{
			if(!HeartBeatUtil.getDeivceState(device.getDeviceSeril()))
				return new ResultUtil(-1, "设备不在线");
			
				
		LsRecord record = new LsRecord();
		channel  =  ManagedChannelBuilder.forAddress(device.getTcpIp(), device.getTcpPort()).usePlaintext().build();
		blockingStub = VerifyServiceGrpc.newBlockingStub(channel);
		FaceApi fa = new FaceApiImpl();
		LjFeature ljFeature  = fa.ByteToFeature(lsPerson.getPhotofeatrue());
		List<Float>  floats  = Floats.asList(ljFeature.data);
		
		CriminalFeature feature  = CriminalFeature.newBuilder().setLen(ljFeature.len)
				                                               .addAllData(floats).build();
		
		VerifyRequest request  =  VerifyRequest.newBuilder().setCriminalId(lsPerson.getCardid())
				                                            .setDelayTime(delayTime)
				                                            .setFeature(feature).build();
		
		VerifyResponse response   = blockingStub.verify(request);
		
		record.setRecordid(UuidUtil.getUUID());
		record.setCardid(lsPerson.getCardid());
		record.setDeviceseril(device.getDeviceSeril());
		record.setName(lsPerson.getName());
		record.setVerifyPhoto(FileUtil.addPicture2Midkirs(response.getPhoto().toByteArray(), lsPerson.getCardid(), "upload/record/"));
		record.setVerifyScore(response.getScore());
		record.setVerifyTime(DateUtil.Long2Date(response.getVerifyTime() , "yyyy-MM-dd HH:mm:ss"));
		record.setType(0);
		if(response.getResult() == 1){
			resultUtil.setCode(0);
			resultUtil.setMsg(response.getMessage());
			record.setVerifyResult("成功");
			List<LsRecord>  records  = new ArrayList<>();
			records.add((LsRecord)resultUtil.getData());
			if(records.size()>0 && records.get(0) != null){
				pps.addLsRecord(records);
				util.upload(records.get(0));
			}
			return resultUtil;
		}else{
			resultUtil.setCode(-1);
			resultUtil.setMsg(response.getMessage());
			record.setVerifyResult("失败");
			resultUtil.setData(record);
			return resultUtil;
		}
		
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e.getMessage());
			resultUtil.setCode(-1);
			resultUtil.setMsg("ERROR:"+e.getMessage());
			return resultUtil;
		}
	}
	
	

}
