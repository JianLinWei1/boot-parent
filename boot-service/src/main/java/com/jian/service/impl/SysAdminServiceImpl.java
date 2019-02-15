package com.jian.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jian.dao.SysAdminMapper;
import com.jian.dao.SysMenusMapper;
import com.jian.dao.SysRoleMenusMapper;
import com.jian.dao.SysRolesMapper;
import com.jian.entity.SysAdmin;
import com.jian.entity.SysMenus;
import com.jian.entity.SysMenusExample;
import com.jian.entity.SysMenusExample.Criteria;
import com.jian.service.SysAdminService;
import com.jian.util.ResultUtil;
import com.jian.util.ShiroUtil;
/**
 * 
 * @ClassName:  SysAdminServiceImpl   
 * @Description:TODO   
 * @author: JianLinWei
 * @email: jianlinwei_dream@163.com
 * @date:   2019年1月10日 下午3:47:01   
 *
 */
@Service
public class SysAdminServiceImpl  implements SysAdminService{
	private  Logger  logger = LoggerFactory.getLogger(SysAdminServiceImpl.class);
     @Resource
     SysAdminMapper  sysAdminMapper;
     @Resource
     SysRoleMenusMapper sysRoleMenusMapper;
     @Resource
     SysRolesMapper   sysRolesMapper;
     @Resource
     SysMenusMapper   sysMenusMapper;
     
	@Override
	public SysAdmin getSysAdminByUsername(String username) {
		
		return sysAdminMapper.selectByPrimaryKey(username);
	}


	@Override
	public ResultUtil login(SysAdmin admin) {
		try{
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken  token = new UsernamePasswordToken(admin.getUserName() ,admin.getPassword());
			subject.login(token);
			}catch (UnknownAccountException e) {
				return ResultUtil.error("账户不存在");
			}catch (IncorrectCredentialsException e) {
				System.out.println(e.getMessage());
				return ResultUtil.error("密码错误");
			}catch (LockedAccountException e) {
				return ResultUtil.error("账号被锁定");
			}catch (AuthenticationException e) {
				return ResultUtil.error("账户验证失败");
			}catch(Exception e){
				return ResultUtil.error(e.getMessage());
			}
		
		return new ResultUtil(0, ShiroUtil.getToken());
	}


	@Override
	public ResultUtil getUserInfo() {
		SysAdmin  admin  = ShiroUtil.getSysAdmin();
	    List<Integer>  integers =	sysRoleMenusMapper.selectMenusByRoleId(admin.getRoleId());
	    SysMenusExample  example  =  new SysMenusExample();
	    Criteria  criteria  = example.createCriteria();
	    criteria.andMenuIdIn(integers);
	    List<SysMenus>  menus  = sysMenusMapper.selectByExample(example);
	    
		return ResultUtil.ok();
	}

}
