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
* @ClassName: EmpDimission 
* @Description: 离职信息表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:09:14 
*
 */
@Entity
@Table(name = "P_EMP_DIMISSION")
@SequenceGenerator(name="SEQ_EMP_DIMISSION",sequenceName="SEQ_EMP_DIMISSION")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class EmpDimission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMP_DIMISSION")	//写明使用哪个序列生成器
	@Column(name = "DIM_ID")
	private String dimId;	//员工离职信息编号（主键）
	
	@Column(name = "EMP_ID")
	private String empId;	//员工号
	
	@Column(name = "DIM_TERMDATE")
	private Date dimTermdate;	//离职日期
	
	@Column(name = "DIM_LEAVE_TYPE_CODE")
	private String dimLeaveTypeCode;	//离职类型编码
	
	@Column(name = "DIM_LEAVE_TYPE_NAME")
	private String dimLeaveTypeName;	//离职类型名称
	
	@Column(name = "DIM_LEAVE_TO")
	private String dimLeaveTo;	//离职去向
	
	@Column(name = "DIM_TALENT_POOL_CODE")
	private String dimTalentPoolCode;	//是否进入人才库编码
	
	@Column(name = "DIM_TALENT_POOL_NAME")
	private String dimTalentPoolName;	//是否进入人才库名称
	
	@Column(name = "DIM_REMARKS")
	private String dimRemarks;	//备注

	public EmpDimission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDimission(String dimId, String empId, Date dimTermdate, String dimLeaveTypeCode, String dimLeaveTypeName,
			String dimLeaveTo, String dimTalentPoolCode, String dimTalentPoolName, String dimRemarks) {
		super();
		this.dimId = dimId;
		this.empId = empId;
		this.dimTermdate = dimTermdate;
		this.dimLeaveTypeCode = dimLeaveTypeCode;
		this.dimLeaveTypeName = dimLeaveTypeName;
		this.dimLeaveTo = dimLeaveTo;
		this.dimTalentPoolCode = dimTalentPoolCode;
		this.dimTalentPoolName = dimTalentPoolName;
		this.dimRemarks = dimRemarks;
	}

	public String getDimId() {
		return dimId;
	}

	public void setDimId(String dimId) {
		this.dimId = dimId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getDimTermdate() {
		return dimTermdate;
	}

	public void setDimTermdate(Date dimTermdate) {
		this.dimTermdate = dimTermdate;
	}

	public String getDimLeaveTypeCode() {
		return dimLeaveTypeCode;
	}

	public void setDimLeaveTypeCode(String dimLeaveTypeCode) {
		this.dimLeaveTypeCode = dimLeaveTypeCode;
	}

	public String getDimLeaveTypeName() {
		return dimLeaveTypeName;
	}

	public void setDimLeaveTypeName(String dimLeaveTypeName) {
		this.dimLeaveTypeName = dimLeaveTypeName;
	}

	public String getDimLeaveTo() {
		return dimLeaveTo;
	}

	public void setDimLeaveTo(String dimLeaveTo) {
		this.dimLeaveTo = dimLeaveTo;
	}

	public String getDimTalentPoolCode() {
		return dimTalentPoolCode;
	}

	public void setDimTalentPoolCode(String dimTalentPoolCode) {
		this.dimTalentPoolCode = dimTalentPoolCode;
	}

	public String getDimTalentPoolName() {
		return dimTalentPoolName;
	}

	public void setDimTalentPoolName(String dimTalentPoolName) {
		this.dimTalentPoolName = dimTalentPoolName;
	}

	public String getDimRemarks() {
		return dimRemarks;
	}

	public void setDimRemarks(String dimRemarks) {
		this.dimRemarks = dimRemarks;
	}

	@Override
	public String toString() {
		return "EmpDimission [dimId=" + dimId + ", empId=" + empId + ", dimTermdate=" + dimTermdate
				+ ", dimLeaveTypeCode=" + dimLeaveTypeCode + ", dimLeaveTypeName=" + dimLeaveTypeName + ", dimLeaveTo="
				+ dimLeaveTo + ", dimTalentPoolCode=" + dimTalentPoolCode + ", dimTalentPoolName=" + dimTalentPoolName
				+ ", dimRemarks=" + dimRemarks + "]";
	}

}
