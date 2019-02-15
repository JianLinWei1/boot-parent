package com.jian.grpcImpl;

import com.ljzn.grpc.personinfo.PersonInfoAuthServiceGrpc;
import com.ljzn.grpc.personinfo.PersoninfoRequest;
import com.ljzn.grpc.personinfo.PersoninfoResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * 测试ＧＰＲＣ接口
 * @ClassName:  ClientTestGrpc   
 * @Description:TODO   
 * @author: JianLinWei
 * @email: jianlinwei_dream@163.com
 * @date:   2019年1月26日 下午4:25:58   
 *
 */
public class ClientTestGrpc {

	private static  ManagedChannel channel; 
    private static  PersonInfoAuthServiceGrpc.PersonInfoAuthServiceBlockingStub blockingstub;    
    
    public static   void   test(){
    	channel  = ManagedChannelBuilder.forAddress("localhost", 50051)
 			   .usePlaintext()
 			                           .build();
 	   blockingstub = PersonInfoAuthServiceGrpc.newBlockingStub(channel);
 	   PersoninfoRequest request  = PersoninfoRequest.newBuilder().setDeviceSeril("1").build();
 	   PersoninfoResponse  response = blockingstub.getPersonInfo(request);
 	   System.out.println(response.getMessage());
    }
  public static void main(String[] args) {
	test();
  } 
}
