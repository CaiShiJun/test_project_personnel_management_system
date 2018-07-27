package com.senyint.pmsystem.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.senyint.pmsystem.entity.SySUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @ClassName: LoginController
 * @Description: 处理用户登陆的 Controller 类
 * @author Cai ShiJun
 * @date 2017年9月13日 上午9:03:37
 *
 */
@Api("文章操作相关接口")
@Controller
@RequestMapping(value = "/login")
public class LoginController {

	/**
	 * @Title: login
	 * @Description: 路径为 /login/login 返回到login视图
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年7月26日 下午8:35:35
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ApiOperation(value = "路径为 /login/login 返回到login视图", notes = "", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView login() {

		ModelAndView mv = new ModelAndView("/html/login/login");

		return mv;
	}

	/**
	 * 
	 * @Title: loginUser
	 * @Description: 用户输入用户名密码后，点击登陆。进入该方法，处理过滤后跳转到主页。
	 * @return
	 * @throws 
	 * @author Cai ShiJun
	 * @see 登录提交地址 和 applicationontext-shiro.xml 配置的 login url 一致。 (配置文件方式的说法)  
	 * @date 2017年9月13日 上午8:59:23
	 */
	@RequestMapping(value = "/loginUser",method=RequestMethod.POST)
	@ApiOperation(value = "用户输入用户名密码后，点击登陆。进入该方法，处理过滤后跳转到主页。", notes = "", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView loginUser(@ApiParam @RequestParam String username,@ApiParam @RequestParam String password, HttpServletRequest request, Map<String, Object> map, HttpSession session) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		//1、使用Shiro框架 收集实体/凭据信息 
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		
		//2、收集了实体/凭据信息之后，我们可以通过SecurityUtils工具类，获取当前的用户
		Subject subject = SecurityUtils.getSubject();
		
		try{
			//然后通过调用Subject的login方法提交认证。
			subject.login(token);
			
			//Subject是应用中用户的一个特定安全的缩影,类似于User。
			SySUser sySUser = (SySUser) subject.getPrincipal();
			
			//将用户信息存储到HttpSession的属性中，属性名为user
			session.setAttribute("username", sySUser.getUserName());
		}catch(Exception exception){
			String msg = "";
			if (exception != null) {
				if (UnknownAccountException.class.getName().equals(exception)) {
					System.out.println("UnknownAccountException -- > 账号不存在：");
					msg = "UnknownAccountException -- > 账号不存在：";
				} else if (IncorrectCredentialsException.class.getName().equals(exception)) {
					System.out.println("IncorrectCredentialsException -- > 密码不正确：");
					msg = "IncorrectCredentialsException -- > 密码不正确：";
				} else if ("kaptchaValidateFailed".equals(exception)) {
					System.out.println("kaptchaValidateFailed -- > 验证码错误");
					msg = "kaptchaValidateFailed -- > 验证码错误";
				} else {
					msg = "else >> " + exception;
					System.out.println("else -- >" + exception);
				}
				mv.setViewName("redirect:/login/login");
				map.put("shiroLoginFailureMessage", msg);
				return mv;
			}
		}
		
		// 此方法不处理登录成功,由shiro进行处理.
		mv.setViewName("redirect:/login/home");
		return mv;
		
		
		/*String username = request.getParameter("username");
		
		System.out.println("loginUser");

		// 登录失败从request中获取shiro处理的异常信息。
		// shiroLoginFailure:就是shiro异常类的全类名.
		String exception = (String) request.getAttribute("shiroLoginFailure");

		System.out.println("exception=" + exception);
		
		ModelAndView mv = new ModelAndView();
		
		String msg = "";
		if (exception != null) {
			if (UnknownAccountException.class.getName().equals(exception)) {
				System.out.println("UnknownAccountException -- > 账号不存在：");
				msg = "UnknownAccountException -- > 账号不存在：";
			} else if (IncorrectCredentialsException.class.getName().equals(exception)) {
				System.out.println("IncorrectCredentialsException -- > 密码不正确：");
				msg = "IncorrectCredentialsException -- > 密码不正确：";
			} else if ("kaptchaValidateFailed".equals(exception)) {
				System.out.println("kaptchaValidateFailed -- > 验证码错误");
				msg = "kaptchaValidateFailed -- > 验证码错误";
			} else {
				msg = "else >> " + exception;
				System.out.println("else -- >" + exception);
			}
			mv.setViewName("redirect:/login/login");
			return mv;
		}
		map.put("shiroLoginFailureMessage", msg);

		// 此方法不处理登录成功,由shiro进行处理.
		mv.setViewName("redirect:/login/home");
		return mv;*/
	}

	/**
	 * 
	 * @Title: goToHomePage
	 * @Description: 跳转到系统主页
	 * @return
	 * @throws @author
	 *             Cai ShiJun
	 * @date 2017年9月15日 下午5:40:02
	 */
	@RequestMapping(value = "/home")
	public ModelAndView goToHomePage() {

		ModelAndView mv = new ModelAndView("/html/home/home");

		return mv;
	}
	
	/**
	 * 
	* @Title: loginOut 
	* @Description: 用户退出
	* @param session
	* @return 
	* @throws 
	* @author Cai ShiJun 
	* @date 2017年7月26日 下午8:36:34
	 */
	@RequestMapping("/loginOut")
    public ModelAndView loginOut(HttpSession session) {
       
		Subject subject = SecurityUtils.getSubject();
        
		//登出操作可以通过调用subject.logout()来删除你的登录信息
		subject.logout();
        
		ModelAndView mv = new ModelAndView();
        
		//设置返回视图名为/login
		mv.setViewName("redirect:/login/login");
        
		//返回到登陆login页面
        return mv;
    }
}
