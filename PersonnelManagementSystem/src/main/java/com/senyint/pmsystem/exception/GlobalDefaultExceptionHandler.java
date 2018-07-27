package com.senyint.pmsystem.exception;

import java.util.Date;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.senyint.pmsystem.dao.ExceptionMessageDao;
import com.senyint.pmsystem.entity.ExceptionMessage;

/**
 * 
* @ClassName: GlobalDefaultExceptionHandler 
* @Description: 全局异常处理类
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:12:56 
*
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@Autowired
	private ExceptionMessageDao exceptionMessageDao;
	
	Scanner scan = new Scanner(System.in);
	/**
	 * 异常处理方法
	 * 目前只简单打印异常信息，后续要加入具体处理过程！
	 * @param req
	 * @param e
	 */
	@ExceptionHandler(value = Exception.class)
	public void defaultErrorHandler(HttpServletRequest req, Exception e) {
		// If the exception is annotated with @ResponseStatus rethrow it and let
		// the framework handle it - like the OrderNotFoundException example
		// at the start of this post.
		// AnnotationUtils is a Spring Framework utility class.
		// if (AnnotationUtils.findAnnotation(e.getClass(),
		// ResponseStatus.class) != null)
		// throw e;
		
		// Otherwise setup and send the user to a default error-view.
		// ModelAndView mav = new ModelAndView();
		// mav.addObject("exception", e);
		// mav.addObject("url", req.getRequestURL());
		// mav.setViewName(DEFAULT_ERROR_VIEW);
		// return mav;

		
		// 打印异常信息：
		e.printStackTrace();
		System.err.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
		
		//将异常信息存储到异常信息捕捉表Exception_Message中
		ExceptionMessage exceptionMessage = new ExceptionMessage();
		exceptionMessage.setExcepMessage(e.toString());
		exceptionMessage.setExcepTime(new Date());
		exceptionMessageDao.save(exceptionMessage);
		
		//打印异常信息后线程停止。
		System.out.println("GlobalDefaultExceptionHandler defaultErrorHandler（）：打印异常信息后本线程停止。随意输入字符到控制台后继续");
		//随便读一行控制台输入的字符串。
		scan.next();

		/*
		 * 返回json数据或者String数据： 那么需要在方法上加上注解：@ResponseBody 添加return即可。
		 */

		/*
		 * 返回视图： 定义一个ModelAndView即可， 然后return;
		 * 定义视图文件(比如：error.html,error.ftl,error.jsp);
		 *
		 */
	}

}
