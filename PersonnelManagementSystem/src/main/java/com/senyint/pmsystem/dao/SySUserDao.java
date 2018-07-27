package com.senyint.pmsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senyint.pmsystem.entity.SySUser;

/**
 * 
* @ClassName: SysUserDao 
* @Description: 系统用户的数据库访问接口
* @author Cai ShiJun 
* @date 2017年9月13日 下午7:41:56 
*
 */
public interface SySUserDao extends JpaRepository<SySUser,String> {
	
	/**
	 * 
	* @Title: findByUserName 
	* @Description: 根据UserName去查询获取 系统用户SySUser对象
	* @param username
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年9月15日 上午8:42:37
	 */
	public SySUser findByUserName(String userName);
	
}
