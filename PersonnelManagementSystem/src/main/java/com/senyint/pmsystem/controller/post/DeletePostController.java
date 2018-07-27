package com.senyint.pmsystem.controller.post;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
* @ClassName: DeletePostController 
* @Description: 删除岗位
* @author Cai ShiJun 
* @date 2017年11月13日 下午12:04:55 
*
 */
@RestController
@RequestMapping(value = "/PostManagement")
public class DeletePostController {
	
	@RequestMapping(value = "/DeletePost")
	public ModelAndView goToDeletePostPage(){
		
		ModelAndView mv = new ModelAndView("/html/PostManagement/DeletePost");

		return mv;
	}
	
}
