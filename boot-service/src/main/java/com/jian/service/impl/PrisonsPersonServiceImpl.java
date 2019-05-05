package com.jian.service.impl;


import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jian.dao.LjDeviceMapper;
import com.jian.dao.LsPersonMapper;
import com.jian.dao.LsRecordMapper;
import com.jian.entity.LjDevice;
import com.jian.entity.LjDeviceExample;
import com.jian.entity.LsPerson;
import com.jian.entity.LsPersonExample;
import com.jian.entity.LsPersonExample.Criteria;
import com.jian.entity.LsRecord;
import com.jian.entity.LsRecordExample;
import com.jian.service.PrisonsPersonService;
import com.jian.util.ActionUtil;
import com.jian.util.DateUtil;
import com.jian.util.FaceUtil;
import com.jian.util.FileUtil;
import com.jian.util.HeartBeatUtil;
import com.jian.util.ResultUtil;

@Service
public class PrisonsPersonServiceImpl implements PrisonsPersonService {
	private  Logger  logger  =  LoggerFactory.getLogger("监所人员实现类"+PrisonsPersonServiceImpl.class);
	
	@Resource
	private LsPersonMapper lsPersonMapper;
	@Resource
	private LsRecordMapper  lsRecordMapper;
	@Resource 
	private LjDeviceMapper ljDeviceMapper;

	@Override
	public ResultUtil insertPrisonsPerson(List<LsPerson> list) {
		ResultUtil resultUtil = new ResultUtil();
		String face_msg = null;
		int  count = 0;
		for (LsPerson lp : list) {
			try {
				if(StringUtils.isNotEmpty(lp.getCardid())
						&&lsPersonMapper.selectByPrimaryKey(lp.getCardid()) != null){
					
					return  updatePrisonsPerson(list);
					/*face_msg ="已存在";
					lp.setPhoto("");
					resultUtil.setData(JSON.toJSON(lp).toString());
					break;*/
				}
					
				byte[] bs = FileUtil.Base642Byte(lp.getPhoto());
				if (bs != null)
					face_msg = FaceUtil.DetectFace(bs);
				if(StringUtils.isNotEmpty(face_msg)){
					resultUtil.setData(JSON.toJSON(lp).toString());
					break;
				}
				lp.setPhoto(FileUtil.addPicture2Midkirs(bs, lp.getCardid(),"upload/images/"));
				lp.setPhotofeatrue(FaceUtil.getFeature(bs));
				lp.setAction(ActionUtil.insert.getCode());
				lp.setVersion(System.currentTimeMillis());
				if(StringUtils.isEmpty(lp.getPhoto())){
					resultUtil.setData(lp);
					face_msg = "500,存入图片异常";
					break;
				}
					
				count +=lsPersonMapper.insert(lp);

			} catch (IllegalArgumentException e) {
				face_msg = "base64解码错误";
				System.out.println(lp.getPhoto().replaceAll("[\\s*\t\n\r]", ""));
				logger.error(e.getMessage(), e);
				resultUtil.setData(JSON.toJSON(lp).toString());
				break;
			}catch(Exception e){
				e.printStackTrace();
				face_msg = "创建失败";
				lp.setPhotofeatrue(null);
			   resultUtil.setData(JSON.toJSON(lp).toString());
			   break;
			}
		}
		if (StringUtils.isNotEmpty(face_msg)) {
			resultUtil.setCode(-1);
			resultUtil.setMsg(face_msg);
		}else{
			resultUtil.setCode(0);
			resultUtil.setCount(count);
			resultUtil.setMsg("创建成功");
		}
		return resultUtil;
	}

	@Override
	public ResultUtil updatePrisonsPerson(List<LsPerson> list) {
		ResultUtil resultUtil = new ResultUtil();
		String face_msg = null;
		int  count = 0;
		for (LsPerson lp : list) {
			try {
				if(StringUtils.isNotEmpty(lp.getCardid())
						&&lsPersonMapper.selectByPrimaryKey(lp.getCardid()) == null){
					face_msg ="不存在";
					lp.setPhoto("");
					resultUtil.setData(JSON.toJSON(lp).toString());
					break;
				}
					
				byte[] bs = FileUtil.Base642Byte(lp.getPhoto());
				if (bs != null)
					face_msg = FaceUtil.DetectFace(bs);
				if(StringUtils.isNotEmpty(face_msg)){
					resultUtil.setData(JSON.toJSON(lp).toString());
					break;
				}
				lp.setPhoto(FileUtil.addPicture2Midkirs(bs, lp.getCardid() ,"upload/images/"));
				lp.setPhotofeatrue(FaceUtil.getFeature(bs));
				lp.setAction(ActionUtil.update.getCode());
				lp.setVersion(System.currentTimeMillis());
				if(StringUtils.isEmpty(lp.getPhoto())){
					resultUtil.setData(lp);
					face_msg = "500,存入图片异常";
					break;
				}
					
				count +=lsPersonMapper.updateByPrimaryKeyWithBLOBs(lp);

			} catch (IllegalArgumentException e) {
				face_msg = "base64解码错误";
				resultUtil.setData(JSON.toJSON(lp).toString());
				break;
			}catch(Exception e){
				face_msg = "更新失败";
				lp.setPhotofeatrue(null);
			   resultUtil.setData(JSON.toJSON(lp).toString());
			   break;
			}
		}
		if (StringUtils.isNotEmpty(face_msg)) {
			resultUtil.setCode(-1);
			resultUtil.setMsg(face_msg);
		}else{
			resultUtil.setCode(0);
			resultUtil.setCount(count);
			resultUtil.setMsg("更新成功");
		}
		return resultUtil;
	}

	@Override
	public ResultUtil deletePrisonsPerson(List<LsPerson> list) {
      ResultUtil  resultUtil  = new ResultUtil();
      String msg = null;
      int count =0 ;
      for(LsPerson  lp : list){
    	  if(StringUtils.isNotEmpty(lp.getCardid())
					&& lsPersonMapper.selectByPrimaryKey(lp.getCardid()) == null){
    		  msg ="不存在";
				lp.setPhoto("");
				resultUtil.setData(JSON.toJSON(lp).toString());
				break;
    	  }
    	  
    	  lp.setAction(ActionUtil.delete.getCode());
    	  lp.setVersion(System.currentTimeMillis());
    	  count+= lsPersonMapper.updateByPrimaryKeySelective(lp);
      }
      
      if (StringUtils.isNotEmpty(msg)) {
			resultUtil.setCode(-1);
			resultUtil.setMsg(msg);
		}else{
			resultUtil.setCode(0);
			resultUtil.setCount(count);
			resultUtil.setMsg("删除成功");
		}
		return resultUtil;
	}

	@Override
	public ResultUtil queryPrisonsPerson(int page, int limit) {
		if(page != 0 && limit !=0)
		PageHelper.startPage(page, limit);
		LsPersonExample  example  = new LsPersonExample();
		example.setOrderByClause("version DESC");
		Criteria criteria  = example.createCriteria();
		criteria.andActionNotEqualTo(ActionUtil.delete.getCode());
		List<LsPerson>  lsPersons = lsPersonMapper.selectByExampleWithBLOBs(example);
		for(LsPerson lp  :  lsPersons){
			try {
				lp.setPhoto(FileUtil.img_base64_head(FileUtil.getPicture2Byte(lp.getPhoto() ,"upload/images/")));
			} catch (IOException e) {
				logger.error("从文件读图片：ERROR" +e.getMessage());
			}
			lp.setAction(null);
			lp.setDatetime(DateUtil.Long2DateStr(lp.getVersion(),"yyyy-MM-dd HH:mm:ss"));
			lp.setVersion(null);
		}
		PageInfo<LsPerson>  info  = new PageInfo<>(lsPersons);
		ResultUtil  resultUtil = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount((int)info.getTotal());
		resultUtil.setData(info.getList());
		resultUtil.setMsg("查询OK");
		return resultUtil;
	}

	@Override
	public ResultUtil queryPrisonRecords(int page, int limit) {
		ResultUtil  resultUtil = new ResultUtil();
		
		if(page != 0 && limit !=0)
			PageHelper.startPage(page, limit);
		LsRecordExample  example = new LsRecordExample();
		example.setOrderByClause("verify_time  DESC");
		List<LsRecord>   lsRecords   =lsRecordMapper.selectByExample(example);
		for(LsRecord lr : lsRecords){
			lr.setVerifytime(DateUtil.Date2yMdHms(lr.getVerifyTime()));
			lr.setVerifyTime(null);
			try {
				lr.setVerifyPhoto(FileUtil.img_base64_head(FileUtil.getPicture2Byte(lr.getVerifyPhoto() ,"upload/record/")));
		} catch (IOException e) {
			logger.error("从文件读图片：ERROR" +e.getMessage());
			lr.setVerifyPhoto("失去照片");
		}
		}
		PageInfo<LsRecord>  info  = new PageInfo<>(lsRecords);
		
		resultUtil.setCode(0);
		resultUtil.setCount((int)info.getTotal());
		resultUtil.setData(info.getList());
		resultUtil.setMsg("查询OK");
		
		return resultUtil;
	}

	@Override
	public ResultUtil queryPrisonDevices() {
		LjDeviceExample  example  = new LjDeviceExample();
		List<LjDevice> ljDevices  = ljDeviceMapper.selectByExample(example);
		for(LjDevice ld : ljDevices){
			ld.setDeviceType(null);
			ld.setMerchantId(null);
			ld.setTcpIp(null);
			ld.setTcpPort(null);
			if(HeartBeatUtil.getDeivceState(ld.getDeviceSeril()))
				ld.setState("on");
			else
				ld.setState("off");
		}
	
		ResultUtil resultUtil  = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount(ljDevices.size());
		resultUtil.setData(ljDevices);
		resultUtil.setMsg("查询Ok");
		return resultUtil;
	}

	@Override
	public List<LsPerson> getLsPersonsByVersion(long  version) {
		LsPersonExample  example  = new LsPersonExample();
		Criteria  criteria  =  example.createCriteria();
		example.setOrderByClause("version  ASC");
		criteria.andVersionGreaterThan(version);
		
		return lsPersonMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public ResultUtil addLsRecord(List<LsRecord>  lsRecords) {
		int i = 0 ;
		for(LsRecord record : lsRecords){
			i = lsRecordMapper.insertSelective(record);
		}
		if(i == 1)
			return  ResultUtil.ok();
		return ResultUtil.error();
	}

	@Override
	public ResultUtil openCamrea(String deviceSeril, int time, String cardid) {
		return null;
		
	/* LjDevice device =	ljDeviceMapper.selectByPrimaryKey(deviceSeril);
	 LsPerson  lsPerson = lsPersonMapper.selectByPrimaryKey(cardid);
	 
	 ResultUtil resultUtil  =  VerifyGrpc.verify(device, lsPerson, time);
	 if(resultUtil.getCode() == 0)
		 lsRecordMapper.insert((LsRecord)resultUtil.getData());
	 */
		
		
	}

	@Override
	public LjDevice getLjDeviceByKey(String deviceSeril) {
		
		return ljDeviceMapper.selectByPrimaryKey(deviceSeril);
	}

	@Override
	public LsPerson getLsPersonByKey(String cardid) {
		
		return lsPersonMapper.selectByPrimaryKey(cardid);
	}

	@Override
	public List<LsPerson> getLsPersonsByVersionAndType(long version, int type) {
		LsPersonExample  example  = new LsPersonExample();
		Criteria  criteria  =  example.createCriteria();
		example.setOrderByClause("version  ASC");
		criteria.andVersionGreaterThan(version);
		criteria.andPersontypeEqualTo(type);
		
		return lsPersonMapper.selectByExampleWithBLOBs(example);
	}

}
