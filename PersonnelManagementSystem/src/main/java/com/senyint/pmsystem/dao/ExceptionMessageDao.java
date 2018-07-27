package com.senyint.pmsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senyint.pmsystem.entity.ExceptionMessage;

/**
 * 
* @ClassName: ExceptionMessageDao 
* @Description: 异常信息捕捉表Exception_Message的的数据库访问接口
* @author Cai ShiJun 
* @date 2017年9月30日 下午5:07:44 
*
 */
public interface ExceptionMessageDao extends JpaRepository<ExceptionMessage,String>{

	
	
}
