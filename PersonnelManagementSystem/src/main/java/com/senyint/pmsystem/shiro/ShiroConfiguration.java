package com.senyint.pmsystem.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @ClassName: ShiroConfiguration
 * @Description: Shiro 配置 Apache Shiro 核心通过 Filter 来实现，就好像SpringMvc
 *               通过DispachServlet 来主控制一样。 既然是使用 Filter
 *               一般也就能猜到，是通过URL规则来进行过滤和权限校验，所以我们需要定义一系列关于URL的规则和访问权限。
 * @author Cai ShiJun
 * @date 2017年9月13日 上午8:59:09
 *
 */
@Configuration
public class ShiroConfiguration {

	/**
	 * 凭证匹配器 （由于我们的密码校验交给 Shiro 的 SimpleAuthenticationInfo 进行处理了 所以我们需要修改下
	 * doGetAuthenticationInfo 中的代码; ）
	 * 
	 * @return
	 */
	/*@Bean
	public HashedCredentialsMatcher hashedCredentialsMatcher() {
		HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();

		hashedCredentialsMatcher.setHashAlgorithmName("md5");// 散列算法:这里使用MD5算法;
		hashedCredentialsMatcher.setHashIterations(2);// 散列的次数，比如散列两次，相当于md5(md5(""));

		return hashedCredentialsMatcher;
	}*/
	
	/**
	 * 身份认证realm; (这个需要自己写，账号密码校验；权限等)
	 * 
	 * @return
	 */
	@Bean
	public LoginShiroAuthRealm loginShiroAuthRealm() {
		LoginShiroAuthRealm loginShiroAuthRealm = new LoginShiroAuthRealm();

		//loginShiroAuthRealm.setCredentialsMatcher(hashedCredentialsMatcher());

		return loginShiroAuthRealm;
	}
	
	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

		securityManager.setRealm(loginShiroAuthRealm());

		return securityManager;
	}
	
	/**
	 * 开启 shiro aop注解 支持. 使用代理方式;所以需要开启代码支持;
	 * 
	 * @param securityManager
	 * @return
	 */
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
		return authorizationAttributeSourceAdvisor;
	}

	/**
	 * ShiroFilterFactoryBean 处理拦截资源文件问题。
	 * 注意：单独一个ShiroFilterFactoryBean配置是会报错的，因为在
	 * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager。
	 * 
	 * Filter Chain定义说明 1、一个URL可以配置多个Filter，使用逗号分隔。 2、当设置多个过滤器时，全部验证通过，才视为通过。
	 * 3、部分过滤器可指定参数，如perms，roles。
	 * 
	 */
	@Bean
	public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {

		System.out.println("ShiroConfiguration.shirFilter()");

		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

		// 必须设置 SecurityManager
		shiroFilterFactoryBean.setSecurityManager(securityManager);

		// 拦截器
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();

		/**
		 * // 配置退出过滤器,其中的具体的退出代码 Shiro 已经替我们实现了
		 * filterChainDefinitionMap.put("/logout", "logout");
		 * 
		 * // <!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了; // <!--
		 * authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
		 * filterChainDefinitionMap.put("/**", "authc");
		 * 
		 * // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
		 * shiroFilterFactoryBean.setLoginUrl("/login");
		 * 
		 * // 登录成功后要跳转的链接 shiroFilterFactoryBean.setSuccessUrl("/index");
		 * 
		 * // 未授权界面; shiroFilterFactoryBean.setUnauthorizedUrl("/403");
		 */

		filterChainDefinitionMap.put("/login/login", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/login/loginUser", "anon"); // 表示可以匿名访问
		//filterChainDefinitionMap.put("/login/home", "authc"); // 表示可以匿名访问

		// static
		filterChainDefinitionMap.put("/js/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/css/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/img/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/video/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/fonts/**", "anon"); // 表示可以匿名访问

		// templates
		filterChainDefinitionMap.put("/fld/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/ftl/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/thymeleaf-component/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/swagger/**", "anon"); // 表示可以匿名访问
		filterChainDefinitionMap.put("/v2/api-docs", "anon"); // 表示可以匿名访问

		// all
		filterChainDefinitionMap.put("/**", "authc"); // 表示需要认证才可以访问

		// 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
		//shiroFilterFactoryBean.setLoginUrl("/login/loginUser");
		shiroFilterFactoryBean.setLoginUrl("/login/login");

		// 登录成功后要跳转的链接
		shiroFilterFactoryBean.setSuccessUrl("/login/home");

		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		
		return shiroFilterFactoryBean;
	}
	

}
