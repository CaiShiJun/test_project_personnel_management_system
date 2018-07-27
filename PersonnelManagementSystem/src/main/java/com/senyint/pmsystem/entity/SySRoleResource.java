package com.senyint.pmsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @ClassName: SysRoleResource
 * @Description: 系统角色-权限
 * @author Cai ShiJun
 * @date 2017年9月13日 下午8:03:21
 *
 */
@Entity
@Table(name = "P_SYSROLE_RESOURCE")
@SequenceGenerator(name = "SEQ_SYSROLE_RESOURCE", sequenceName = "SEQ_SYSROLE_RESOURCE") // name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class SySRoleResource {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SYSROLE_RESOURCE") // 写明使用哪个序列生成器
	@Column(name = "SYSROLE_RESOU_ID")
	private String sysroleResouId; // 系统角色-权限关系表id(主键)

	@Column(name = "ROLE_ID")
	private String roleId; // 系统角色主键id

	@Column(name = "RESOURCE_ID")
	private String resourceId; // 系统资源权限id(主键)

	public SySRoleResource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SySRoleResource(String sysroleResouId, String roleId, String resourceId) {
		super();
		this.sysroleResouId = sysroleResouId;
		this.roleId = roleId;
		this.resourceId = resourceId;
	}

	public String getSysroleResouId() {
		return sysroleResouId;
	}

	public void setSysroleResouId(String sysroleResouId) {
		this.sysroleResouId = sysroleResouId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	@Override
	public String toString() {
		return "SysRoleResource [sysroleResouId=" + sysroleResouId + ", roleId=" + roleId + ", resourceId=" + resourceId
				+ "]";
	}

}
