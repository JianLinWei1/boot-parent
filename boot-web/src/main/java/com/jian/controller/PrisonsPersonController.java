package com.jian.controller;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jian.entity.LjDevice;
import com.jian.entity.LsPerson;
import com.jian.entity.LsRecord;
import com.jian.grpcImpl.VerifyGrpc;
import com.jian.service.PrisonsPersonService;
import com.jian.util.ActionUtil;
import com.jian.util.RecordUploadUtil;
import com.jian.util.ResultUtil;

import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api("监所人员")
public class PrisonsPersonController {
	@Autowired
	PrisonsPersonService  pps;
	
	@Autowired
	VerifyGrpc   verifyGrpc;
	@Autowired
	RecordUploadUtil util;
	
	@ApiOperation(value = "人员信息"  , notes = "")
	@RequestMapping(value = "/prisonstaff/{str}" , method = RequestMethod.POST)
	public   ResultUtil  insertPerson(@RequestBody List<LsPerson> lsPerson , @PathVariable String str){
		if(StringUtils.equals(str, ActionUtil.insert.getValue()))
			return pps.insertPrisonsPerson(lsPerson);
		if(StringUtils.equals(str, ActionUtil.update.getValue()))
			return pps.updatePrisonsPerson(lsPerson);
		if(StringUtils.equals(str, ActionUtil.delete.getValue()))
			return pps.deletePrisonsPerson(lsPerson);
		return ResultUtil.error();
	}
	
	
	@ApiOperation(value="查询人员信息")
	@RequestMapping(value="/prisonstaff/query" , method = RequestMethod.GET)
	public ResultUtil queryPerson(  int page  ,int limit){
		return pps.queryPrisonsPerson(page, limit);
	}
	
	@ApiOperation(value="查询记录")
	@RequestMapping(value="/prisonrecord/query" , method = RequestMethod.GET)
	public ResultUtil queryRecord(int page , int limit){
		return pps.queryPrisonRecords(page, limit);
		
	}
	
	@ApiOperation(value="设备查询接口")
	@RequestMapping(value="/prisondevice/query" , method = RequestMethod.GET)
	public ResultUtil queryDevice(){
		return pps.queryPrisonDevices();
		
	}
	
	@ApiOperation(value="打开摄像头")
	@RequestMapping(value="/prisoncamrea/open" ,method = RequestMethod.POST)
	public ResultUtil openCamrea(@RequestBody String  jsonstr){
		JSONObject json   = new JSONObject(jsonstr);
		int time = json.getInt("time");
		LjDevice  device  = pps.getLjDeviceByKey(json.getString("deviceSeril"));
		LsPerson lsPerson  = pps.getLsPersonByKey(json.getString("cardid"));
		if(lsPerson == null || device == null)
			return ResultUtil.error("人员或设备不存在");
		
		 verifyGrpc.verify(device, lsPerson, time ,pps,util);
		/*List<LsRecord>  records  = new ArrayList<>();
		records.add((LsRecord)resultUtil.getData());
		if(records.size()>0 && records.get(0) != null)
			pps.addLsRecord(records);*/
		
		return  ResultUtil.ok("请求成功"); 
	}
	
	@ApiOperation(value="关闭摄像头")
	@RequestMapping(value="/prisoncamrea/close" ,method = RequestMethod.POST)
	public ResultUtil closeCamrea(@RequestBody String deviceseril){
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount(0);
		resultUtil.setData(" ");
		resultUtil.setMsg("ok");
		return resultUtil;
	}

}
