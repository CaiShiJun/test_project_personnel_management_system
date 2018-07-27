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
 * @ClassName: SySRole
 * @Description: 系统角色
 * @author Cai ShiJun
 * @date 2017年9月13日 下午6:09:32
 *
 */
@Entity
@Table(name = "P_SYSROLE")
@SequenceGenerator(name = "SEQ_SYSROLE", sequenceName = "SEQ_SYSROLE") // name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class SySRole {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SYSROLE") // 写明使用哪个序列生成器
	@Column(name = "ROLE_ID")
	private String roleId; // 系统角色id(主键)

	@Column(name = "ROLE_NAME")
	private String roleName; // 系统角色名

	@ManyToMany(fetch = FetchType.LAZY) // 立即从数据库中进行加载数据;
	/*
	 * 多对多中，joinColumns写的都是本表在中间表的外键名称， inverseJoinColumns写的是另一个表在中间表的外键名称。
	 */
	@JoinTable(name = "P_SYSUSER_ROLE", joinColumns = { @JoinColumn(name = "ROLE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "USER_ID") })
	private List<SySUser> userList;

	@ManyToMany(fetch = FetchType.LAZY) // 立即从数据库中进行加载数据;
	/*
	 * 多对多中，joinColumns写的都是本表在中间表的外键名称， inverseJoinColumns写的是另一个表在中间表的外键名称。
	 */
	@JoinTable(name = "P_SYSROLE_RESOURCE", joinColumns = { @JoinColumn(name = "ROLE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "RESOURCE_ID") })
	private List<SySResource> resourceList;

	public SySRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SySRole(String roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<SySUser> getUserList() {
		return userList;
	}

	public void setUserList(List<SySUser> userList) {
		this.userList = userList;
	}

	public List<SySResource> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<SySResource> resourceList) {
		this.resourceList = resourceList;
	}

	@Override
	public String toString() {
		return "SySRole [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

}
