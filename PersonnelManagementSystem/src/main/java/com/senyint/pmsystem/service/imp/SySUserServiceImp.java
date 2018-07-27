package com.senyint.pmsystem.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senyint.pmsystem.dao.SySUserDao;
import com.senyint.pmsystem.entity.SySUser;
import com.senyint.pmsystem.service.SySUserService;

@Service
public class SySUserServiceImp implements SySUserService{
	
	@Autowired
	private SySUserDao sySUserDao;
	
	/**
	 * 
	 */
	@Override
	public SySUser findByUserName(String userName) {

		return sySUserDao.findByUserName(userName);
	}

}
