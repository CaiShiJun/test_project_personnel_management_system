package com.senyint.pmsystem.controller.post;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
* @ClassName: UpdatePostController 
* @Description: 修改岗位
* @author Cai ShiJun 
* @date 2017年11月13日 下午12:06:17 
*
 */
@RestController
@RequestMapping(value = "/PostManagement")
public class UpdatePostController {
	
	@RequestMapping(value = "/UpdatePost")
	public ModelAndView goToUpdatePostPage(){
		
		ModelAndView mv = new ModelAndView("/html/PostManagement/UpdatePost");

		return mv;
	}

}
