package com.jian;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.jian.util.FaceUtil;
import com.jian.util.HeartBeatUtil;


@SpringBootApplication(scanBasePackages = {"com.jian"} )
@EnableAsync
@MapperScan("com.jian.dao")
public class Application {
  public static void main(String[] args) {
	  FaceUtil.createHandle();
	 HeartBeatUtil.handleConcurrentMap();
	SpringApplication.run(Application.class);
	 
}
  
  
  
  
  
}
