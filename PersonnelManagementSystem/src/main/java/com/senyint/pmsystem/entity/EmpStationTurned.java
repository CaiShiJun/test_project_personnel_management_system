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
* @ClassName: EmpStationTurned 
* @Description: 部门调转信息表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:11:07 
*
 */
@Entity
@Table(name = "P_EMP_STATION_TURNED")
@SequenceGenerator(name="SEQ_EMP_STATION_TURNED",sequenceName="SEQ_EMP_STATION_TURNED")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class EmpStationTurned {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMP_STATION_TURNED")	//写明使用哪个序列生成器
	@Column(name = "STURN_ID")
	private String sturnId; // 员工调转岗位编号id（主键）

	@Column(name = "EMP_ID")
	private String empId; // 员工号

	@Column(name = "STURN_BEFORE_STATION_CODE")
	private String sturnBeforeStationCode; // 调转前的岗位编号

	@Column(name = "STURN_BEFORE_STATION_NAME")
	private String sturnBeforeStationName; // 调转前的岗位名称

	@Column(name = "STURN_AFTER_STATION_CODE")
	private String sturnAfterStationCode; // 调转后的岗位编号

	@Column(name = "STURN_AFTER_STATION_NAME")
	private String sturnAfterStationName; // 调转后的岗位名称

	@Column(name = "STURN_DATE")
	private Date sturnDate; // 调转时间

	@Column(name = "STURN_TYPE_CODE")
	private String sturnTypeCode; // 调转类型编号

	@Column(name = "STURN_TYPE_NAME")
	private String sturnTypeName; // 调转类型名称

	@Column(name = "STURN_CAUSE")
	private String sturnCause; // 调转原因

	@Column(name = "STURN_REMARKS")
	private String sturnRemarks; // 备注

	public EmpStationTurned() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpStationTurned(String sturnId, String empId, String sturnBeforeStationCode, String sturnBeforeStationName,
			String sturnAfterStationCode, String sturnAfterStationName, Date sturnDate, String sturnTypeCode,
			String sturnTypeName, String sturnCause, String sturnRemarks) {
		super();
		this.sturnId = sturnId;
		this.empId = empId;
		this.sturnBeforeStationCode = sturnBeforeStationCode;
		this.sturnBeforeStationName = sturnBeforeStationName;
		this.sturnAfterStationCode = sturnAfterStationCode;
		this.sturnAfterStationName = sturnAfterStationName;
		this.sturnDate = sturnDate;
		this.sturnTypeCode = sturnTypeCode;
		this.sturnTypeName = sturnTypeName;
		this.sturnCause = sturnCause;
		this.sturnRemarks = sturnRemarks;
	}

	public String getSturnId() {
		return sturnId;
	}

	public void setSturnId(String sturnId) {
		this.sturnId = sturnId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSturnBeforeStationCode() {
		return sturnBeforeStationCode;
	}

	public void setSturnBeforeStationCode(String sturnBeforeStationCode) {
		this.sturnBeforeStationCode = sturnBeforeStationCode;
	}

	public String getSturnBeforeStationName() {
		return sturnBeforeStationName;
	}

	public void setSturnBeforeStationName(String sturnBeforeStationName) {
		this.sturnBeforeStationName = sturnBeforeStationName;
	}

	public String getSturnAfterStationCode() {
		return sturnAfterStationCode;
	}

	public void setSturnAfterStationCode(String sturnAfterStationCode) {
		this.sturnAfterStationCode = sturnAfterStationCode;
	}

	public String getSturnAfterStationName() {
		return sturnAfterStationName;
	}

	public void setSturnAfterStationName(String sturnAfterStationName) {
		this.sturnAfterStationName = sturnAfterStationName;
	}

	public Date getSturnDate() {
		return sturnDate;
	}

	public void setSturnDate(Date sturnDate) {
		this.sturnDate = sturnDate;
	}

	public String getSturnTypeCode() {
		return sturnTypeCode;
	}

	public void setSturnTypeCode(String sturnTypeCode) {
		this.sturnTypeCode = sturnTypeCode;
	}

	public String getSturnTypeName() {
		return sturnTypeName;
	}

	public void setSturnTypeName(String sturnTypeName) {
		this.sturnTypeName = sturnTypeName;
	}

	public String getSturnCause() {
		return sturnCause;
	}

	public void setSturnCause(String sturnCause) {
		this.sturnCause = sturnCause;
	}

	public String getSturnRemarks() {
		return sturnRemarks;
	}

	public void setSturnRemarks(String sturnRemarks) {
		this.sturnRemarks = sturnRemarks;
	}

	@Override
	public String toString() {
		return "EmpStationTurned [sturnId=" + sturnId + ", empId=" + empId + ", sturnBeforeStationCode="
				+ sturnBeforeStationCode + ", sturnBeforeStationName=" + sturnBeforeStationName
				+ ", sturnAfterStationCode=" + sturnAfterStationCode + ", sturnAfterStationName="
				+ sturnAfterStationName + ", sturnDate=" + sturnDate + ", sturnTypeCode=" + sturnTypeCode
				+ ", sturnTypeName=" + sturnTypeName + ", sturnCause=" + sturnCause + ", sturnRemarks=" + sturnRemarks
				+ "]";
	}

}
