package com.senyint.pmsystem.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import com.senyint.pmsystem.bean.ajax.GridParam;
import com.senyint.pmsystem.bean.ajax.GridResult;
import com.senyint.pmsystem.dao.DepartmentDao;
import com.senyint.pmsystem.entity.Department;
import com.senyint.pmsystem.service.DepartmentManagementService;

/**
 * 
 * @ClassName: DepartmentManagementServiceImp
 * @Description: 部门管理Service实现类
 * @author Cai ShiJun
 * @date 2017年10月4日 上午9:40:59
 *
 */
@Service
public class DepartmentManagementServiceImp implements DepartmentManagementService {

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public List<Department> getAllDepartment() {

		return departmentDao.findAll();
	}

	@Override
	public Department findByDeptId(String deptId) {

		return departmentDao.findByDeptId(deptId);
	}

	@Override
	public List<Department> save(List<Department> deptList) {

		return departmentDao.save(deptList);
	}

	@Override
	public Department save(Department department) {

		return departmentDao.save(department);
	}

	@Override
	public GridResult getDepartmentByGridParam(GridParam gridParam,Department department) {

		// Pageable是接口，PageRequest是接口实现
		// PageRequest的对象构造函数有多个，page是页数，初始值是0;size是查询结果的条数;后两个参数参考Sort对象的构造方法
		Sort.Direction sortDirection = null;
		if(gridParam.getSord() == null){
			sortDirection = Sort.Direction.ASC;
		} else if (gridParam.getSord().equals("desc")) {
			sortDirection = Sort.Direction.DESC;
		} else if (gridParam.getSord().equals("asc")) {
			sortDirection = Sort.Direction.ASC;
		}
		
		String pageableSidx = "deptTypeCode";
		if(gridParam.getSidx() != null){
			pageableSidx = gridParam.getSidx();
		}
		
		// 因为Pageable的int page是从0起算的，而前端页面传回来的页码是从1起算的，所以在这里gridParam.getPage()-1。
		Pageable pageable = new PageRequest(gridParam.getPage() - 1, gridParam.getRows(), sortDirection, pageableSidx);

		// Page<Department> page = departmentDao.findAll(pageable);

		Page<Department> page = departmentDao.findAll(new Specification<Department>() {

			@Override
			public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Path<String> deptNamePath = root.get("deptName"); // 部门名称
				Path<String> deptTypeCodePath = root.get("deptTypeCode"); // 类型代码
				Path<String> deptSupdeptNamePath = root.get("deptSupdeptName"); // 上级部门名称
				
				List<Predicate> predicateList = new ArrayList<Predicate>();
				
				Predicate predicate = query.getRestriction();
				if(department.getDeptName()!=null){
					predicateList.add(cb.like(deptNamePath, "%"+department.getDeptName()+"%"));
				}
				if(department.getDeptTypeCode()!=null&&!department.getDeptTypeCode().equals("0")){
					predicateList.add(cb.equal(deptTypeCodePath, department.getDeptTypeCode()));
				}
				if(department.getDeptSupdeptName()!=null){
					predicateList.add(cb.like(deptSupdeptNamePath, "%"+department.getDeptSupdeptName()+"%"));
				}
				
				Predicate[] predicates = new Predicate[predicateList.size()]; 
				predicates = predicateList.toArray(predicates);
				
				query.where(cb.and(predicates));
				
				return null;
			}
		}, pageable);

		// 因为Page的page.getNumber()是从0起算，而要返回给前端页面的页面需要从1起算，所以这里page.getNumber()+1
		GridResult gridResult = new GridResult(page.getNumber() + 1, gridParam.getRows(), page.getTotalElements(), page.getContent());
		gridResult.setTotal(gridResult.getTotal());
		System.out.println(gridResult);
		System.out.println(department);
		return gridResult;
	}

}
