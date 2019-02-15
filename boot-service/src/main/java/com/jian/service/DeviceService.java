package com.jian.service;

import com.jian.entity.LjDevice;

public interface DeviceService {

	 LjDevice  getDeviceBySeril(String deviceseril);
	 
	 int   addDevice(LjDevice ljDevice);
	 
	 int  upDevice(LjDevice ljDevice);
}
