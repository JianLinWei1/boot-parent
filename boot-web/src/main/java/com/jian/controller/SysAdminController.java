package com.jian.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 系统管理
 * @ClassName:  SysAdminController   
 * @Description:TODO   
 * @author: JianLinWei
 * @email: jianlinwei_dream@163.com
 * @date:   2019年1月18日 下午4:10:29   
 *
 */

import com.jian.entity.SysAdmin;
import com.jian.service.SysAdminService;
import com.jian.util.ResultUtil;
@RestController
@RequestMapping("/sys")
public class SysAdminController {
	@Autowired
	SysAdminService  sas;
	
	
	
	@PostMapping("/login")
	public  ResultUtil  login( @RequestBody SysAdmin admin){
		if(StringUtils.isEmpty(admin.getUserName()) || StringUtils.isEmpty(admin.getPassword()))
			return new ResultUtil(-1, "用户名/密码不能为空");
		return  sas.login(admin);
	}
	
	
	@PostMapping("/getUserInfo")
	public  ResultUtil  getUserInfo(){
		return ResultUtil.ok();
	}

	@GetMapping("/logout")
	public ResultUtil logout(){
		SecurityUtils.getSubject().logout();
		return ResultUtil.ok();
	}
}
