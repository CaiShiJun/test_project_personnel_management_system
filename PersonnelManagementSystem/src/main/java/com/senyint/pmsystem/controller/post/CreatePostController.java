package com.senyint.pmsystem.controller.post;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
* @ClassName: CreatePostController 
* @Description: 增加岗位
* @author Cai ShiJun 
* @date 2017年11月13日 下午12:04:05 
*
 */
@RestController
@RequestMapping(value = "/PostManagement")
public class CreatePostController {
	
	@RequestMapping(value = "/CreatePost")
	public ModelAndView goToCreatePostPage(){
		
		ModelAndView mv = new ModelAndView("/html/PostManagement/CreatePost");

		return mv;
	}
	
	
	
	
}
