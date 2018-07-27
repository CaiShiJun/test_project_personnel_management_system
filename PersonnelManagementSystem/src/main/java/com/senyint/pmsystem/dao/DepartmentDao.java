package com.senyint.pmsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.senyint.pmsystem.entity.Department;

public interface DepartmentDao extends JpaRepository<Department,String>,JpaSpecificationExecutor<Department>{
	
	/**
	 * 
	* @Title: findByDeptId 
	* @Description: 根据部门编号查询部门
	* @param deptId
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年10月16日 下午7:13:40
	 */
	public Department findByDeptId(String deptId);
}
