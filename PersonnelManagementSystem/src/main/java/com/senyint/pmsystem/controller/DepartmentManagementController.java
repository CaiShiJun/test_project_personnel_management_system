package com.senyint.pmsystem.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.senyint.pmsystem.bean.ajax.GridParam;
import com.senyint.pmsystem.bean.ajax.GridResult;
import com.senyint.pmsystem.dao.CodeValueDao;
import com.senyint.pmsystem.entity.CodeValue;
import com.senyint.pmsystem.entity.Department;
import com.senyint.pmsystem.service.DepartmentManagementService;

/**
 * 
 * @ClassName: DepartmentManagementController
 * @Description: 部门管理控制器
 * @author Cai ShiJun
 * @date 2017年10月4日 上午9:31:41
 *
 */
@RestController
@RequestMapping(value = "/DepartmentManagement")
public class DepartmentManagementController {

	@Autowired
	private DepartmentManagementService departmentManagementService;

	@Autowired
	private CodeValueDao codeValueDao;

	/**
	 * 
	 * @Title: goToCreateDepartmentPage
	 * @Description: 跳转到新建部门页面
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月4日 下午5:51:51
	 */
	@RequestMapping(value = "/CreateDepartment")
	public ModelAndView goToCreateDepartmentPage() {

		ModelAndView mv = new ModelAndView("/html/DepartmentManagement/CreateDepartment");

		return mv;
	}

	/**
	 * 
	 * @Title: createDepartmentSubmit
	 * @Description: 处理新建部门提交的请求
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月4日 下午5:52:05
	 */
	@RequestMapping(value = "/CreateDepartment/submit")
	@Transactional(propagation = Propagation.REQUIRED) // 如果有事务,那么加入事务,没有的话新建一个(不写的情况下)
	public ModelAndView createDepartmentSubmit(Department department, HttpServletRequest request, HttpServletResponse response) {

		System.out.println("public String createDepartmentSubmit(Department department,HttpServletRequest request){");

		ModelAndView mv = new ModelAndView("/html/DepartmentManagement/CreateDepartment");

		try {

			// 根据部门类型代码查询获取部门类型名称
			List<CodeValue> deptTypeCodeValueList = codeValueDao.findByCsIdAndCode("001", department.getDeptTypeCode());
			department.setDeptTypeName(deptTypeCodeValueList.get(0).getName());

			// 根据上级部门编号
			Department deptSupdept = departmentManagementService.findByDeptId(department.getDeptSupdeptId());
			department.setDeptSupdeptName(deptSupdept.getDeptName());

			System.out.println(department);

			departmentManagementService.save(department);

			mv.addObject("createDepartmentSaveResult", "success");

		} catch (Exception e) {

			mv.addObject("createDepartmentSaveResult", "fail");

		}

		return mv;
	}

	/**
	 * 
	 * @Title: initDepartmentTree
	 * @Description: 加载部门树,返回所有部门Department对象
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月9日 下午7:38:14
	 */
	@RequestMapping(value = "/CreateDepartment/initDepartmentTree")
	public List<Department> initDepartmentTree() {
		return departmentManagementService.getAllDepartment();
	}

	/**
	 * 
	 * @Title: initDeptTypeOption
	 * @Description: 加载部门类型多选框,返回所有部门类型代码名称CodeValue对象
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月16日 下午6:46:52
	 */
	@RequestMapping(value = "/CreateDepartment/initDeptTypeOption")
	public List<CodeValue> initDeptTypeOption() {
		return codeValueDao.findByCsId("001");
	}

	/**
	 * 
	 * @Title: goToUpdateDepartmentPage
	 * @Description: 跳转到修改部门页面
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月17日 下午6:24:21
	 */
	@RequestMapping(value = "/UpdateDepartment")
	public ModelAndView goToUpdateDepartmentPage() {

		ModelAndView mv = new ModelAndView("/html/DepartmentManagement/UpdateDepartment");

		return mv;
	}

	/**
	 * 
	 * @Title: goToSelectDepartmentPage
	 * @Description: 跳转到查询部门页面
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月17日 下午6:27:31
	 */
	@RequestMapping(value = "/SelectDepartment")
	public ModelAndView goToSelectDepartmentPage() {

		ModelAndView mv = new ModelAndView("/html/DepartmentManagement/SelectDepartment");

		return mv;
	}

	/**
	 * 
	 * @Title: goToDeleteDepartmentPage
	 * @Description: 跳转到删除部门页面
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月17日 下午6:35:24
	 */
	@RequestMapping(value = "/DeleteDepartment")
	public ModelAndView goToDeleteDepartmentPage() {

		ModelAndView mv = new ModelAndView("/html/DepartmentManagement/DeleteDepartment");

		return mv;
	}

	/**
	 * 
	 * @Title: goToSelectDepartmentEmployeesPage
	 * @Description: 跳转到查询部门下员工页面
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月17日 下午6:37:22
	 */
	@RequestMapping(value = "/SelectDepartmentEmployees")
	public ModelAndView goToSelectDepartmentEmployeesPage() {

		ModelAndView mv = new ModelAndView("/html/DepartmentManagement/SelectDepartmentEmployees");

		return mv;
	}

	/**
	 * 
	 * @Title: initSelectDepartmentGrid
	 * @Description: 加载部门信息表,返回所有部门Department对象
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年10月18日 下午1:13:17
	 */
	@RequestMapping(value = "/SelectDepartment/initSelectDepartmentGrid")
	public GridResult initSelectDepartmentGrid(GridParam gridParam, Department department, HttpServletRequest request, HttpServletResponse response) {

		String page = request.getParameter("page"); // 当前页数,注意这是jqgrid自身的参数
		System.out.println("当前页数:" + page);

		String rows = request.getParameter("rows"); // 每页显示行数，,注意这是jqgrid自身的参数
		System.out.println("每页显示行数:" + rows);

		String startRow = request.getParameter("startRow"); // 开始行数
		System.out.println("开始行数:" + startRow);

		String endRow = request.getParameter("endRow"); // 结束行数
		System.out.println("结束行数:" + endRow);

		String sidx = request.getParameter("sidx"); // 排序列名
		System.out.println("排序列名:" + sidx);

		String sord = request.getParameter("sord"); // 排序方式
		System.out.println("排序方式:" + sord);

		String filters = request.getParameter("filters"); // 查询数据
		System.out.println("查询数据:" + filters);

		String _search = request.getParameter("_search"); // 查询标志
		System.out.println("查询标志:" + _search);

		return departmentManagementService.getDepartmentByGridParam(gridParam, department);
	}

	@RequestMapping(value = "/UpdateDepartment/update")
	@Transactional(propagation = Propagation.REQUIRED) // 如果有事务,那么加入事务,没有的话新建一个(不写的情况下)
	public ModelAndView updateDepartmentUpdate(Department department, HttpServletRequest request, HttpServletResponse response) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		ModelAndView mv = new ModelAndView("/html/DepartmentManagement/SelectDepartment");
		try {

			department.setDeptId(request.getParameter("deptIdModel"));
			department.setDeptName(request.getParameter("deptNameModel"));
			department.setDeptTypeCode(request.getParameter("deptTypeCodeModel"));

			// 根据部门类型代码查询获取部门类型名称
			List<CodeValue> deptTypeCodeValueList = codeValueDao.findByCsIdAndCode("001", department.getDeptTypeCode());
			department.setDeptTypeName(deptTypeCodeValueList.get(0).getName());

			department.setDeptPhoneNumber(request.getParameter("deptPhoneNumberModel"));
			department.setDeptFaxNumber(request.getParameter("deptFaxNumberModel"));
			department.setDeptDescription(request.getParameter("deptDescriptionModel"));
			department.setDeptSupdeptId(request.getParameter("deptSupdeptIdModel"));

			// 根据上级部门编号
			Department deptSupdept = departmentManagementService.findByDeptId(department.getDeptSupdeptId());
			department.setDeptSupdeptName(deptSupdept.getDeptName());

			department.setDeptCreateDate(simpleDateFormat.parse(request.getParameter("deptCreateDateModel")));

			System.out.println(department + "\r" + request.getParameter("deptCreateDateModel"));
			
			departmentManagementService.save(department);

			mv.addObject("updateDepartmentUpdateResult", "success");

		} catch (Exception e) {

			mv.addObject("updateDepartmentUpdateResult", "fail");

		}
		return mv;

	}

	@RequestMapping(value = "/UpdateDepartment/select")
	@Transactional(propagation = Propagation.REQUIRED) // 如果有事务,那么加入事务,没有的话新建一个(不写的情况下)
	public Department updateDepartmentSelect(String deptId, HttpServletRequest request, HttpServletResponse response) {

		return departmentManagementService.findByDeptId(deptId);
	}

}
