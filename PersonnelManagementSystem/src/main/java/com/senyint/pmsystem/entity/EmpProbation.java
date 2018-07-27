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
* @ClassName: EmpProbation 
* @Description: 员工试用期表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:10:08 
*
 */
@Entity
@Table(name = "P_EMP_PROBATION")
@SequenceGenerator(name="SEQ_EMP_PROBATION",sequenceName="SEQ_EMP_PROBATION")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class EmpProbation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMP_PROBATION")	//写明使用哪个序列生成器
	@Column(name = "PROBA_ID")
	private String probaId;	//员工试用期编号id（主键）
	
	@Column(name = "EMP_ID")
	private String empId;	//员工号
	
	@Column(name = "PROBA_START_DATE")
	private Date probaStartDate;	//试用期开始日期
	
	@Column(name = "PROBA_END_DATE")
	private Date probaEndDate;	//试用期结束日期
	
	@Column(name = "PROBA_ASSESS_COMMENT")
	private String probaAssessComment;	//"试用期部门考核评语	用来描述试用期信息"
	
	@Column(name = "PROBA_EVALUATION_RESULT_CODE")
	private String probaEvaluationResultCode;	//考核结果编码
	
	@Column(name = "PROBA_EVALUATION_RESULT_NAME")
	private String probaEvaluationResultName;	//考核结果名称
	
	@Column(name = "PROBA_PROCESSED_DATE")
	private Date probaProcessedDate;	//处理日期
	
	@Column(name = "PROBA_REMARKS")
	private String probaRemarks;	//备注

	public EmpProbation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpProbation(String probaId, String empId, Date probaStartDate, Date probaEndDate, String probaAssessComment,
			String probaEvaluationResultCode, String probaEvaluationResultName, Date probaProcessedDate,
			String probaRemarks) {
		super();
		this.probaId = probaId;
		this.empId = empId;
		this.probaStartDate = probaStartDate;
		this.probaEndDate = probaEndDate;
		this.probaAssessComment = probaAssessComment;
		this.probaEvaluationResultCode = probaEvaluationResultCode;
		this.probaEvaluationResultName = probaEvaluationResultName;
		this.probaProcessedDate = probaProcessedDate;
		this.probaRemarks = probaRemarks;
	}

	public String getProbaId() {
		return probaId;
	}

	public void setProbaId(String probaId) {
		this.probaId = probaId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getProbaStartDate() {
		return probaStartDate;
	}

	public void setProbaStartDate(Date probaStartDate) {
		this.probaStartDate = probaStartDate;
	}

	public Date getProbaEndDate() {
		return probaEndDate;
	}

	public void setProbaEndDate(Date probaEndDate) {
		this.probaEndDate = probaEndDate;
	}

	public String getProbaAssessComment() {
		return probaAssessComment;
	}

	public void setProbaAssessComment(String probaAssessComment) {
		this.probaAssessComment = probaAssessComment;
	}

	public String getProbaEvaluationResultCode() {
		return probaEvaluationResultCode;
	}

	public void setProbaEvaluationResultCode(String probaEvaluationResultCode) {
		this.probaEvaluationResultCode = probaEvaluationResultCode;
	}

	public String getProbaEvaluationResultName() {
		return probaEvaluationResultName;
	}

	public void setProbaEvaluationResultName(String probaEvaluationResultName) {
		this.probaEvaluationResultName = probaEvaluationResultName;
	}

	public Date getProbaProcessedDate() {
		return probaProcessedDate;
	}

	public void setProbaProcessedDate(Date probaProcessedDate) {
		this.probaProcessedDate = probaProcessedDate;
	}

	public String getProbaRemarks() {
		return probaRemarks;
	}

	public void setProbaRemarks(String probaRemarks) {
		this.probaRemarks = probaRemarks;
	}

	@Override
	public String toString() {
		return "EmpProbation [probaId=" + probaId + ", empId=" + empId + ", probaStartDate=" + probaStartDate
				+ ", probaEndDate=" + probaEndDate + ", probaAssessComment=" + probaAssessComment
				+ ", probaEvaluationResultCode=" + probaEvaluationResultCode + ", probaEvaluationResultName="
				+ probaEvaluationResultName + ", probaProcessedDate=" + probaProcessedDate + ", probaRemarks="
				+ probaRemarks + "]";
	}

}
