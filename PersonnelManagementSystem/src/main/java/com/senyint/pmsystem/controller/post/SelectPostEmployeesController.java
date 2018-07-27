package com.senyint.pmsystem.controller.post;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
* @ClassName: SelectPostEmployeesController 
* @Description: 查询岗位下员工
* @author Cai ShiJun 
* @date 2017年11月13日 下午12:06:03 
*
 */
@RestController
@RequestMapping(value = "/PostManagement")
public class SelectPostEmployeesController {
	
	@RequestMapping(value = "/SelectPostEmployees")
	public ModelAndView goToSelectPostEmployeesPage(){
		
		ModelAndView mv = new ModelAndView("/html/PostManagement/SelectPostEmployees");

		return mv;
	}
	
}
