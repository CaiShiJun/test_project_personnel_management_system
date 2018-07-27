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
 * @ClassName: SySResource
 * @Description: 系统资源权限
 * @author Cai ShiJun
 * @date 2017年9月13日 下午6:11:16
 *
 */
@Entity
@Table(name = "P_SYSRESOURCE")
@SequenceGenerator(name = "SEQ_SYSRESOURCE", sequenceName = "SEQ_SYSRESOURCE") // name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class SySResource {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SYSRESOURCE") // 写明使用哪个序列生成器
	@Column(name = "RESOURCE_ID")
	private String resourceId; // 系统资源权限id(主键)

	@Column(name = "RESOURCE_NAME")
	private String resourceName; // 系统资源权限名

	@ManyToMany(fetch = FetchType.LAZY) // 立即从数据库中进行加载数据;
	/*
	 * 多对多中，joinColumns写的都是本表在中间表的外键名称， inverseJoinColumns写的是另一个表在中间表的外键名称。
	 */
	@JoinTable(name = "P_SYSROLE_RESOURCE", joinColumns = { @JoinColumn(name = "RESOURCE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID") })
	private List<SySRole> roleList;

	public SySResource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SySResource(String resourceId, String resourceName) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public List<SySRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<SySRole> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "SySResource [resourceId=" + resourceId + ", resourceName=" + resourceName + "]";
	}

}
