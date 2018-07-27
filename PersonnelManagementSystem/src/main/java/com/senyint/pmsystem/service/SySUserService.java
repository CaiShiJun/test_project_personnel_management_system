package com.senyint.pmsystem.service;

import com.senyint.pmsystem.dao.SySUserDao;
import com.senyint.pmsystem.entity.SySUser;

public interface SySUserService{
	
	/**
	 * 
	* @Title: findByUserName 
	* @Description:	根据UserName去查询获取 系统用户SySUser对象
	* @param username
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年9月15日 上午8:46:28
	 */
	public SySUser findByUserName(String userName);
	
}
