package com.senyint.pmsystem.swaggerUI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/swagger")
public class swaggerUIController {
	
	/**
	 * 
	* @Title: goToSwaggerUIIndexPage 
	* @Description: 访问地址：http://localhost:9090/PersonnelManagementSystem/swagger/index
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年11月14日 下午7:16:31
	 */
	@RequestMapping(value = "/index")
	public ModelAndView goToSwaggerUIIndexPage(){
		
		ModelAndView mv = new ModelAndView("/swagger/index");

		return mv;
	}
}
