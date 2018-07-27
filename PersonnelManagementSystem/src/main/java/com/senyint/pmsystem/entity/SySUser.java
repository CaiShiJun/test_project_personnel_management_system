package com.senyint.pmsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @ClassName: SySUser
 * @Description: 系统用户
 * @author Cai ShiJun
 * @date 2017年9月13日 下午6:09:10
 *
 */
@Entity
@Table(name = "P_SYSUSER")
@SequenceGenerator(name = "SEQ_SYSUSER", sequenceName = "SEQ_SYSUSER") // name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class SySUser {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SYSUSER") // 写明使用哪个序列生成器
	@Column(name = "USER_ID")
	private String userId; // 系统用户id(主键)

	@Column(name = "USER_NAME")
	private String userName; // 用户名

	@Column(name = "USER_PASSWORD")
	private String userPassword; // 用户密码

	@ManyToMany(fetch = FetchType.LAZY) // 立即从数据库中进行加载数据;
	/*
	 * 多对多中，joinColumns写的都是本表在中间表的外键名称， inverseJoinColumns写的是另一个表在中间表的外键名称。
	 */
	@JoinTable(name = "P_SYSUSER_ROLE", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID") })
	private List<SySRole> roleList;

	public SySUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SySUser(String userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<SySRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<SySRole> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "SySUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}

}
