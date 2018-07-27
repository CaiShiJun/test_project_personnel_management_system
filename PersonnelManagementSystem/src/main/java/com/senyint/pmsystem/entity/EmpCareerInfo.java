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
* @ClassName: EmpCareerInfo 
* @Description: 员工职业生涯信息表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:08:36 
*
 */
@Entity
@Table(name = "P_EMP_CAREER_INFO")
@SequenceGenerator(name="SEQ_EMP_CAREER_INFO",sequenceName="SEQ_EMP_CAREER_INFO")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class EmpCareerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMP_CAREER_INFO")	//写明使用哪个序列生成器
	@Column(name = "CAREER_ID")
	private String careerId;	//员工职业生涯信息编号（主键）

	@Column(name = "EMP_ID")
	private String empId;	//员工号

	@Column(name = "CAREER_START_DATE")
	private Date careerStartDate;	//"起始年月	某一阶段从事工作或学习的起始年月"

	@Column(name = "CAREER_END_DATE")
	private Date careerEndDate;		//"截止年月	该阶段从事工作或学习的截止年月"

	@Column(name = "CAREER_COM_NAME")
	private String careerComName;	//"所在单位名称	该阶段从事工作或学习的单位名称"

	@Column(name = "CAREER_JOB_CONTENT")
	private String careerJobContent;	//"从事工作内容	该阶段从事工作或学习的内容"

	@Column(name = "CAREER_POSITION")
	private String careerPosition;	//担任职务

	@Column(name = "CAREER_MONTHLY_PAY")
	private Double careerMonthlyPay;	//月薪

	@Column(name = "CAREER_ANNUAL_SALARY")
	private Double careerAnnualSalary;	//年薪

	@Column(name = "CAREER_CERTIFIER_NAME")
	private String careerCertifierName;	//证明人姓名

	@Column(name = "CAREER_CERTIFIER_DUTY")
	private String careerCertifierDuty;	//证明人职务

	@Column(name = "CAREER_CERTIFIER_PHONE_NUMBER")
	private String careerCertifierPhoneNumber;	//证明人电话

	@Column(name = "CAREER_CERTIFIER_REMARKS")
	private String careerCertifierRemarks;	//备注

	public EmpCareerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpCareerInfo(String careerId, String empId, Date careerStartDate, Date careerEndDate, String careerComName,
			String careerJobContent, String careerPosition, Double careerMonthlyPay, Double careerAnnualSalary,
			String careerCertifierName, String careerCertifierDuty, String careerCertifierPhoneNumber,
			String careerCertifierRemarks) {
		super();
		this.careerId = careerId;
		this.empId = empId;
		this.careerStartDate = careerStartDate;
		this.careerEndDate = careerEndDate;
		this.careerComName = careerComName;
		this.careerJobContent = careerJobContent;
		this.careerPosition = careerPosition;
		this.careerMonthlyPay = careerMonthlyPay;
		this.careerAnnualSalary = careerAnnualSalary;
		this.careerCertifierName = careerCertifierName;
		this.careerCertifierDuty = careerCertifierDuty;
		this.careerCertifierPhoneNumber = careerCertifierPhoneNumber;
		this.careerCertifierRemarks = careerCertifierRemarks;
	}

	public String getCareerId() {
		return careerId;
	}

	public void setCareerId(String careerId) {
		this.careerId = careerId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getCareerStartDate() {
		return careerStartDate;
	}

	public void setCareerStartDate(Date careerStartDate) {
		this.careerStartDate = careerStartDate;
	}

	public Date getCareerEndDate() {
		return careerEndDate;
	}

	public void setCareerEndDate(Date careerEndDate) {
		this.careerEndDate = careerEndDate;
	}

	public String getCareerComName() {
		return careerComName;
	}

	public void setCareerComName(String careerComName) {
		this.careerComName = careerComName;
	}

	public String getCareerJobContent() {
		return careerJobContent;
	}

	public void setCareerJobContent(String careerJobContent) {
		this.careerJobContent = careerJobContent;
	}

	public String getCareerPosition() {
		return careerPosition;
	}

	public void setCareerPosition(String careerPosition) {
		this.careerPosition = careerPosition;
	}

	public Double getCareerMonthlyPay() {
		return careerMonthlyPay;
	}

	public void setCareerMonthlyPay(Double careerMonthlyPay) {
		this.careerMonthlyPay = careerMonthlyPay;
	}

	public Double getCareerAnnualSalary() {
		return careerAnnualSalary;
	}

	public void setCareerAnnualSalary(Double careerAnnualSalary) {
		this.careerAnnualSalary = careerAnnualSalary;
	}

	public String getCareerCertifierName() {
		return careerCertifierName;
	}

	public void setCareerCertifierName(String careerCertifierName) {
		this.careerCertifierName = careerCertifierName;
	}

	public String getCareerCertifierDuty() {
		return careerCertifierDuty;
	}

	public void setCareerCertifierDuty(String careerCertifierDuty) {
		this.careerCertifierDuty = careerCertifierDuty;
	}

	public String getCareerCertifierPhoneNumber() {
		return careerCertifierPhoneNumber;
	}

	public void setCareerCertifierPhoneNumber(String careerCertifierPhoneNumber) {
		this.careerCertifierPhoneNumber = careerCertifierPhoneNumber;
	}

	public String getCareerCertifierRemarks() {
		return careerCertifierRemarks;
	}

	public void setCareerCertifierRemarks(String careerCertifierRemarks) {
		this.careerCertifierRemarks = careerCertifierRemarks;
	}

	@Override
	public String toString() {
		return "EmpCareerInfo [careerId=" + careerId + ", empId=" + empId + ", careerStartDate=" + careerStartDate
				+ ", careerEndDate=" + careerEndDate + ", careerComName=" + careerComName + ", careerJobContent="
				+ careerJobContent + ", careerPosition=" + careerPosition + ", careerMonthlyPay=" + careerMonthlyPay
				+ ", careerAnnualSalary=" + careerAnnualSalary + ", careerCertifierName=" + careerCertifierName
				+ ", careerCertifierDuty=" + careerCertifierDuty + ", careerCertifierPhoneNumber="
				+ careerCertifierPhoneNumber + ", careerCertifierRemarks=" + careerCertifierRemarks + "]";
	}

}
