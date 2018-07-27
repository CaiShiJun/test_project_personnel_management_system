package com.senyint.pmsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
* @ClassName: Department 
* @Description: 员工部门表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:04:23 
*
 */
@Entity
@Table(name = "P_DEPARTMENT")
/*@SequenceGenerator(name="SEQ_DEPARTMENT",sequenceName="SEQ_DEPARTMENT")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字*/
public class Department {
	
	@Id
	@GeneratedValue(generator="system-uuid")  
	@GenericGenerator(name="system-uuid", strategy = "uuid") 
	@Column(name="DEPT_ID")
	private String deptId;	//部门编号（主键）
	
	@Column(name="DEPT_NAME")
	private String deptName;	//部门名称
	
	@Column(name="DEPT_TYPE_CODE")
	private String deptTypeCode;	//类型代码
	
	@Column(name="DEPT_TYPE_NAME")
	private String deptTypeName;	//类型名称
	
	@Column(name="DEPT_PHONE_NUMBER")
	private String deptPhoneNumber;	//电话
	
	@Column(name="DEPT_FAX_NUMBER")
	private String deptFaxNumber;	//传真
	
	@Column(name="DEPT_DESCRIPTION")
	private String deptDescription;	//描述
	
	@Column(name="DEPT_SUPDEPT_ID")
	private String deptSupdeptId;	//上级部门编号
	
	@Column(name="DEPT_SUPDEPT_NAME")
	private String deptSupdeptName;	//上级部门名称
	
	@Column(name="DEPT_CREATE_DATE")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date deptCreateDate;	//成立日期

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String deptId, String deptName, String deptTypeCode, String deptTypeName, String deptPhoneNumber,
			String deptFaxNumber, String deptDescription, String deptSupdeptId, String deptSupdeptName,
			Date deptCreateDate) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptTypeCode = deptTypeCode;
		this.deptTypeName = deptTypeName;
		this.deptPhoneNumber = deptPhoneNumber;
		this.deptFaxNumber = deptFaxNumber;
		this.deptDescription = deptDescription;
		this.deptSupdeptId = deptSupdeptId;
		this.deptSupdeptName = deptSupdeptName;
		this.deptCreateDate = deptCreateDate;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptTypeCode() {
		return deptTypeCode;
	}

	public void setDeptTypeCode(String deptTypeCode) {
		this.deptTypeCode = deptTypeCode;
	}

	public String getDeptTypeName() {
		return deptTypeName;
	}

	public void setDeptTypeName(String deptTypeName) {
		this.deptTypeName = deptTypeName;
	}

	public String getDeptPhoneNumber() {
		return deptPhoneNumber;
	}

	public void setDeptPhoneNumber(String deptPhoneNumber) {
		this.deptPhoneNumber = deptPhoneNumber;
	}

	public String getDeptFaxNumber() {
		return deptFaxNumber;
	}

	public void setDeptFaxNumber(String deptFaxNumber) {
		this.deptFaxNumber = deptFaxNumber;
	}

	public String getDeptDescription() {
		return deptDescription;
	}

	public void setDeptDescription(String deptDescription) {
		this.deptDescription = deptDescription;
	}

	public String getDeptSupdeptId() {
		return deptSupdeptId;
	}

	public void setDeptSupdeptId(String deptSupdeptId) {
		this.deptSupdeptId = deptSupdeptId;
	}

	public String getDeptSupdeptName() {
		return deptSupdeptName;
	}

	public void setDeptSupdeptName(String deptSupdeptName) {
		this.deptSupdeptName = deptSupdeptName;
	}

	public Date getDeptCreateDate() {
		return deptCreateDate;
	}

	public void setDeptCreateDate(Date deptCreateDate) {
		this.deptCreateDate = deptCreateDate;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptTypeCode=" + deptTypeCode
				+ ", deptTypeName=" + deptTypeName + ", deptPhoneNumber=" + deptPhoneNumber + ", deptFaxNumber="
				+ deptFaxNumber + ", deptDescription=" + deptDescription + ", deptSupdeptId=" + deptSupdeptId
				+ ", deptSupdeptName=" + deptSupdeptName + ", deptCreateDate=" + deptCreateDate + "]";
	}

}
