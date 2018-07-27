package com.senyint.pmsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
* @ClassName: EmpDeptTurned 
* @Description: 部门调转信息表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:08:59 
*
 */
@Entity
@Table(name = "P_EMP_DEPT_TURNED")
@SequenceGenerator(name="SEQ_EMP_DEPT_TURNED",sequenceName="SEQ_EMP_DEPT_TURNED")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class EmpDeptTurned {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMP_DEPT_TURNED")	//写明使用哪个序列生成器
	@Column(name="DTURN_ID")
	private String dturnId;	//部门调转号（主键）
	
	@Column(name="EMP_ID")
	private String empId;	//员工号
	
	@Column(name="DTURN_BEFORE_DEPT_CODE")
	private String dturnBeforeDeptCode;	//调转前的部门编号
	
	@Column(name="DTURN_BEFORE_DEPT_NAME")
	private String dturnBeforeDeptName;	//调转前的部门名称
	
	@Column(name="DTURN_AFTER_DEPT_CODE")
	private String dturnAfterDeptCode;	//调转后的部门编号
	
	@Column(name="DTURN_AFTER_DEPT_NAME")
	private String dturnAfterDeptName;	//调转后的部门名称
	
	@Column(name="DTURN_DATE")
	private Date dturnDate;	//调转时间
	
	@Column(name="DTURN_TYPE_CODE")
	private String dturnTypeCode;	//调转类型编号
	
	@Column(name="DTURN_TYPE_NAME")
	private String dturnTypeName;	//调转类型名称
	
	@Column(name="DTURN_CAUSE")
	private String dturnCause;	//调转原因
	
	@Column(name="DTURN_REMARKS")
	private String dturnRemarks;	//备注

	public EmpDeptTurned() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDeptTurned(String dturnId, String empId, String dturnBeforeDeptCode, String dturnBeforeDeptName,
			String dturnAfterDeptCode, String dturnAfterDeptName, Date dturnDate, String dturnTypeCode,
			String dturnTypeName, String dturnCause, String dturnRemarks) {
		super();
		this.dturnId = dturnId;
		this.empId = empId;
		this.dturnBeforeDeptCode = dturnBeforeDeptCode;
		this.dturnBeforeDeptName = dturnBeforeDeptName;
		this.dturnAfterDeptCode = dturnAfterDeptCode;
		this.dturnAfterDeptName = dturnAfterDeptName;
		this.dturnDate = dturnDate;
		this.dturnTypeCode = dturnTypeCode;
		this.dturnTypeName = dturnTypeName;
		this.dturnCause = dturnCause;
		this.dturnRemarks = dturnRemarks;
	}

	public String getDturnId() {
		return dturnId;
	}

	public void setDturnId(String dturnId) {
		this.dturnId = dturnId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getDturnBeforeDeptCode() {
		return dturnBeforeDeptCode;
	}

	public void setDturnBeforeDeptCode(String dturnBeforeDeptCode) {
		this.dturnBeforeDeptCode = dturnBeforeDeptCode;
	}

	public String getDturnBeforeDeptName() {
		return dturnBeforeDeptName;
	}

	public void setDturnBeforeDeptName(String dturnBeforeDeptName) {
		this.dturnBeforeDeptName = dturnBeforeDeptName;
	}

	public String getDturnAfterDeptCode() {
		return dturnAfterDeptCode;
	}

	public void setDturnAfterDeptCode(String dturnAfterDeptCode) {
		this.dturnAfterDeptCode = dturnAfterDeptCode;
	}

	public String getDturnAfterDeptName() {
		return dturnAfterDeptName;
	}

	public void setDturnAfterDeptName(String dturnAfterDeptName) {
		this.dturnAfterDeptName = dturnAfterDeptName;
	}

	public Date getDturnDate() {
		return dturnDate;
	}

	public void setDturnDate(Date dturnDate) {
		this.dturnDate = dturnDate;
	}

	public String getDturnTypeCode() {
		return dturnTypeCode;
	}

	public void setDturnTypeCode(String dturnTypeCode) {
		this.dturnTypeCode = dturnTypeCode;
	}

	public String getDturnTypeName() {
		return dturnTypeName;
	}

	public void setDturnTypeName(String dturnTypeName) {
		this.dturnTypeName = dturnTypeName;
	}

	public String getDturnCause() {
		return dturnCause;
	}

	public void setDturnCause(String dturnCause) {
		this.dturnCause = dturnCause;
	}

	public String getDturnRemarks() {
		return dturnRemarks;
	}

	public void setDturnRemarks(String dturnRemarks) {
		this.dturnRemarks = dturnRemarks;
	}

	@Override
	public String toString() {
		return "EmpDeptTurned [dturnId=" + dturnId + ", empId=" + empId + ", dturnBeforeDeptCode=" + dturnBeforeDeptCode
				+ ", dturnBeforeDeptName=" + dturnBeforeDeptName + ", dturnAfterDeptCode=" + dturnAfterDeptCode
				+ ", dturnAfterDeptName=" + dturnAfterDeptName + ", dturnDate=" + dturnDate + ", dturnTypeCode="
				+ dturnTypeCode + ", dturnTypeName=" + dturnTypeName + ", dturnCause=" + dturnCause + ", dturnRemarks="
				+ dturnRemarks + "]";
	}

}
