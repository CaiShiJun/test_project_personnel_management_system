package com.senyint.pmsystem.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.senyint.pmsystem.entity.SySUser;
import com.senyint.pmsystem.service.SySUserService;

/**
 * 
 * @ClassName: LoginShiroAuthRealm
 * @Description: 自定义登陆Shiro 的 Realm实现类;身份校验核心类。
 * @author Cai ShiJun
 * @date 2017年9月14日 下午7:52:10
 *
 */
public class LoginShiroAuthRealm extends AuthorizingRealm {

	@Autowired
	private SySUserService sySUserService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		授权的方法是在碰到<shiro:hasPermission>标签的时候调用的,它会去检测shiro框架中的权限(这里的permissions)是否包含有该标签的name值,
//		如果有,里面的内容显示,如果没有,里面的内容不予显示(这就完成了对于权限的认证.)
//		  User user=(User) principal.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
//	        List<String> permissions=new ArrayList<>();
//	        Set<Role> roles = user.getRoles();
//	        if(roles.size()>0) {
//	            for(Role role : roles) {
//	                Set<Module> modules = role.getModules();
//	                if(modules.size()>0) {
//	                    for(Module module : modules) {
//	                        permissions.add(module.getMname());
//	                    }
//	                }
//	            }
//	        }
//	        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
//	        info.addStringPermissions(permissions);//将权限放入shiro中.
//	        return info;
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		//获取基于用户名和密码的令牌 
		//实际上这个authcToken是从LoginController里面loginUser()方法中subject.login(token);传过来的 
		UsernamePasswordToken token = (UsernamePasswordToken) arg0;
				
		//获取用户名
		String userName = token.getUsername();
				
		//根据用户名从数据库中查询用户信息
		SySUser sySUser = sySUserService.findByUserName(userName);
				
		//如果根据用户名能查询到对应的用户
		if(sySUser != null){
					
			//放入shiro.调用CredentialsMatcher检验密码
			//此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息 
			return new SimpleAuthenticationInfo(sySUser,sySUser.getUserPassword(),this.getClass().getName());
				
		}else{
			//如果根据用户名查询不到对应的用户，直接返回null;
			//没有返回登录用户名对应的SimpleAuthenticationInfo对象时, 
			// 就会在LoginController中抛出UnknownAccountException异常 
			return null;
		}
				
	}


}
