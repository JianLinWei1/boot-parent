package com.jian.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jian.dao.LjDeviceMapper;
import com.jian.entity.LjDevice;
import com.jian.service.DeviceService;
/**
 * 
 * @ClassName:  DeviceServiceImpl   
 * @Description:TODO   
 * @author: JianLinWei
 * @email: jianlinwei_dream@163.com
 * @date:   2019年1月10日 下午4:59:11   
 *
 */
@Service
public class DeviceServiceImpl  implements DeviceService{
	@Resource
	LjDeviceMapper  ljDeviceMapper;

	@Override
	public LjDevice getDeviceBySeril(String deviceseril) {
		
		return ljDeviceMapper.selectByPrimaryKey(deviceseril);
	}

	@Override
	public int addDevice(LjDevice ljDevice) {
		
		return ljDeviceMapper.insertSelective(ljDevice);
	}

	@Override
	public int upDevice(LjDevice ljDevice) {
		
		return ljDeviceMapper.updateByPrimaryKeySelective(ljDevice);
	}

}
