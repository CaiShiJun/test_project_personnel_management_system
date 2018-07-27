package com.senyint.pmsystem.controller.post;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.senyint.pmsystem.bean.ajax.GridParam;
import com.senyint.pmsystem.bean.ajax.GridResult;
import com.senyint.pmsystem.entity.Station;
import com.senyint.pmsystem.service.PostManagementService;

/**
 * 
* @ClassName: SelectPostController 
* @Description: 查询岗位
* @author Cai ShiJun 
* @date 2017年11月13日 下午12:05:45 
*
 */
@RestController
@RequestMapping(value = "/PostManagement")
public class SelectPostController {
	
	@Autowired
	private PostManagementService postManagementService;
	
	@RequestMapping(value = "/SelectPost")
	public ModelAndView goToSelectPostPage(){
		
		ModelAndView mv = new ModelAndView("/html/PostManagement/SelectPost");

		return mv;
	}
	
	@RequestMapping(value = "/initSelectPostGrid")
	public GridResult initSelectPostGrid(GridParam gridParam, Station station, HttpServletRequest request, HttpServletResponse response) {
		
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
		
		System.out.println(gridParam);

		return postManagementService.getPostByGridParam(gridParam, station);
	}
	
	
	
	
	
	
}
