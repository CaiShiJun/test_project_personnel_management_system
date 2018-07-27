package com.senyint.pmsystem.service;

import java.util.List;

import com.senyint.pmsystem.bean.ajax.GridParam;
import com.senyint.pmsystem.bean.ajax.GridResult;
import com.senyint.pmsystem.entity.Department;

public interface DepartmentManagementService{
	
	/**
	 * 
	* @Title: getAllDepartment 
	* @Description: 获取并返回所有部门
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年10月9日 下午7:41:05
	 */
	public List<Department> getAllDepartment();
	
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
	
	/**
	 * 
	* @Title: save 
	* @Description: 存储Department对象集合到数据库
	* @param deptList
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年10月16日 下午7:26:24
	 */
	public List<Department> save(List<Department> deptList);
	
	/**
	 * 
	* @Title: save 
	* @Description: 存储Department对象到数据库
	* @param department
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年10月16日 下午7:27:48
	 */
	public Department save(Department department);
	
	/**
	 * 
	* @Title: getDepartmentByGridParam 
	* @Description: 根据GridParam查询满足条件的部门数据
	* @param gridParam
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年11月1日 上午9:16:08
	 */
	public GridResult getDepartmentByGridParam(GridParam gridParam,Department department);
}
