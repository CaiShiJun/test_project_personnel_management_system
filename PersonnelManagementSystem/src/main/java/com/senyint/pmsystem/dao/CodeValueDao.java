package com.senyint.pmsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senyint.pmsystem.entity.CodeValue;

/**
 * 
* @ClassName: CodeValue 
* @Description: 代码-名称数据访问dao接口
* @author Cai ShiJun 
* @date 2017年10月16日 下午6:37:13 
*
 */
public interface CodeValueDao extends JpaRepository<CodeValue,String> {
	
	/**
	 * 
	* @Title: findByCsId 
	* @Description: 根据csId查询代码-名称
	* @param csId
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年10月16日 下午6:44:34
	 */
	List<CodeValue> findByCsId(String csId);
	
	/**
	 * 
	* @Title: findByCsIdAndCode 
	* @Description: 根据csId 和 code 查询代码-名称
	* @param csId
	* @param code
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年10月16日 下午6:59:17
	 */
	List<CodeValue> findByCsIdAndCode(String csId,String code);
}
