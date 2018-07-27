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
 * @ClassName: SysUserRole
 * @Description: 系统用户-角色关系
 * @author Cai ShiJun
 * @date 2017年9月13日 下午8:03:26
 *
 */
@Entity
@Table(name = "P_SYSUSER_ROLE")
@SequenceGenerator(name = "SEQ_SYSUSER_ROLE", sequenceName = "SEQ_SYSUSER_ROLE") // name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class SySUserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SYSUSER_ROLE") // 写明使用哪个序列生成器
	@Column(name = "SYSUSER_ROLE_ID")
	private String sysuserRoleId; // 系统用户-角色关系表id(主键)

	@Column(name = "USER_ID")
	private String userId; // 系统用户主键id

	@Column(name = "ROLE_ID")
	private String roleId; // 系统角色主键id

	public SySUserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SySUserRole(String sysuserRoleId, String userId, String roleId) {
		super();
		this.sysuserRoleId = sysuserRoleId;
		this.userId = userId;
		this.roleId = roleId;
	}

	public String getSysuserRoleId() {
		return sysuserRoleId;
	}

	public void setSysuserRoleId(String sysuserRoleId) {
		this.sysuserRoleId = sysuserRoleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "SysUserRole [sysuserRoleId=" + sysuserRoleId + ", userId=" + userId + ", roleId=" + roleId + "]";
	}

}
