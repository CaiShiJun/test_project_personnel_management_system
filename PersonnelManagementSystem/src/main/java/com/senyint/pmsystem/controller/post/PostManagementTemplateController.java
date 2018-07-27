package com.senyint.pmsystem.controller.post;


import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@RestController
@RequestMapping(value = "/PostManagement")
public class PostManagementTemplateController {
	
	@Autowired  
	Configuration configuration; //freeMarker configuration  
	
	@RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map) throws IOException, TemplateException{
		
       map.put("hello","from TemplateController.helloFtl");
       
       Template t = configuration.getTemplate("/ftl/helloFtl.ftl"); // freeMarker template  
       String content = FreeMarkerTemplateUtils.processTemplateIntoString(t,map);  
       
       return content;
    }
	
	
}
