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
* @ClassName: Employee 
* @Description: 员工表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:09:52 
*
 */
@Entity
@Table(name = "P_EMPLOYEE")
@SequenceGenerator(name="SEQ_EMPLOYEE",sequenceName="SEQ_EMPLOYEE")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMPLOYEE")	//写明使用哪个序列生成器
	@Column(name = "EMP_ID")
	private String empId;	//"员工号（主键）	用来标识员工的唯一的代码

	@Column(name = "EMP_NAME")
	private String empName;	//"姓名	员工的姓名	是"

	@Column(name = "EMP_SEX_CODE")
	private String empSexCode;	//"性别编码

	@Column(name = "EMP_SEX_NAME")
	private String empSexName;	//"性别名称

	@Column(name = "EMP_BIRTHDAY")
	private Date empBirthday;	//"出生日期	员工的出生日期	是"

	@Column(name = "EMP_CARD_ID")
	private String empCardId;	//"身份证号	员工的身份证号	是"

	@Column(name = "EMP_DEPT_CODE")
	private String empDeptCode;	//"部门编号	员工所在的部门"

	@Column(name = "EMP_DEPT_NAME")
	private String empDeptName;	//"部门名称	员工所在的部门"

	@Column(name = "EMP_POST_CODE")
	private String empPostCode;	//"岗位编号	员工所在的岗位"

	@Column(name = "EMP_POST_NAME")
	private String empPostName;	//"岗位名称	员工所在的岗位"

	@Column(name = "EMP_ENTRY_DATE")
	private Date empEntryDate;	//"入职日期	员工的入职日期"

	@Column(name = "EMP_JOINJOB_DATE")
	private Date empJoinjobDate;	//"参加工作日期	员工参加工作日期"

	@Column(name = "EMP_MINING_PRODUCTIVITY_CODE")
	private String empMiningProductivityCode;	//用工形式编号

	@Column(name = "EMP_MINING_PRODUCTIVITY_NAME")
	private String empMiningProductivityName;	//用工形式名称

	@Column(name = "EMP_PERSON_SOURCE_CODE")
	private String empPersonSourceCode;	//人员来源编号

	@Column(name = "EMP_PERSON_SOURCE_NAME")
	private String empPersonSourceName;	//人员来源名称

	@Column(name = "EMP_POLITICS_STATUS_CODE")
	private String empPoliticsStatusCode;	//政治面貌编号

	@Column(name = "EMP_POLITICS_STATUS_NAME")
	private String empPoliticsStatusName;	//政治面貌名称

	@Column(name = "EMP_NATION_CODE")
	private String empNationCode;	//民族编号

	@Column(name = "EMP_NATION_NAME")
	private String empNationName;	//民族名称

	@Column(name = "EMP_NATIVE_PLACE")
	private String empNativePlace;	//籍贯

	@Column(name = "EMP_PHONE")
	private String empPhone;	//联系电话

	@Column(name = "EMP_EMAIL")
	private String empEmail;	//电子邮件

	@Column(name = "EMP_HEIGHT")
	private Double empHeight;	//身高

	@Column(name = "EMP_BLOOD_TYPE_CODE")
	private String empBloodTypeCode;	//血型编号

	@Column(name = "EMP_BLOOD_TYPE_NAME")
	private String empBloodTypeName;	//血型名称

	@Column(name = "EMP_MARITAL_STATUS_CODE")
	private String empMaritalStatusCode;	//婚姻状况编号

	@Column(name = "EMP_MARITAL_STATUS_NAME")
	private String empMaritalStatusName;	//婚姻状况名称

	@Column(name = "EMP_BIRTH_PLACE")
	private String empBirthPlace;	//出生地

	@Column(name = "EMP_REGISTERED_PLACE")
	private String empRegisteredPlace;	//户口所在地

	@Column(name = "EMP_MAX_DEGREE_CODE")
	private String empMaxDegreeCode;	//最高学历编号

	@Column(name = "EMP_MAX_DEGREE_NAME")
	private String empMaxDegreeName;	//最高学历名称

	@Column(name = "EMP_MAX_EDUCATION_CODE")
	private String empMaxEducationCode;	//最高学位编号

	@Column(name = "EMP_MAX_EDUCATION_NAME")
	private String empMaxEducationName;	//最高学位名称

	@Column(name = "EMP_SCHOOLTAG")
	private String empSchooltag;	//毕业院校

	@Column(name = "EMP_MAJOR")
	private String empMajor;	//所学专业

	@Column(name = "EMP_GRADUATION_DATE")
	private Date empGraduationDate;	//毕业日期

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String empName, String empSexCode, String empSexName, Date empBirthday,
			String empCardId, String empDeptCode, String empDeptName, String empPostCode, String empPostName,
			Date empEntryDate, Date empJoinjobDate, String empMiningProductivityCode, String empMiningProductivityName,
			String empPersonSourceCode, String empPersonSourceName, String empPoliticsStatusCode,
			String empPoliticsStatusName, String empNationCode, String empNationName, String empNativePlace,
			String empPhone, String empEmail, Double empHeight, String empBloodTypeCode, String empBloodTypeName,
			String empMaritalStatusCode, String empMaritalStatusName, String empBirthPlace, String empRegisteredPlace,
			String empMaxDegreeCode, String empMaxDegreeName, String empMaxEducationCode, String empMaxEducationName,
			String empSchooltag, String empMajor, Date empGraduationDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSexCode = empSexCode;
		this.empSexName = empSexName;
		this.empBirthday = empBirthday;
		this.empCardId = empCardId;
		this.empDeptCode = empDeptCode;
		this.empDeptName = empDeptName;
		this.empPostCode = empPostCode;
		this.empPostName = empPostName;
		this.empEntryDate = empEntryDate;
		this.empJoinjobDate = empJoinjobDate;
		this.empMiningProductivityCode = empMiningProductivityCode;
		this.empMiningProductivityName = empMiningProductivityName;
		this.empPersonSourceCode = empPersonSourceCode;
		this.empPersonSourceName = empPersonSourceName;
		this.empPoliticsStatusCode = empPoliticsStatusCode;
		this.empPoliticsStatusName = empPoliticsStatusName;
		this.empNationCode = empNationCode;
		this.empNationName = empNationName;
		this.empNativePlace = empNativePlace;
		this.empPhone = empPhone;
		this.empEmail = empEmail;
		this.empHeight = empHeight;
		this.empBloodTypeCode = empBloodTypeCode;
		this.empBloodTypeName = empBloodTypeName;
		this.empMaritalStatusCode = empMaritalStatusCode;
		this.empMaritalStatusName = empMaritalStatusName;
		this.empBirthPlace = empBirthPlace;
		this.empRegisteredPlace = empRegisteredPlace;
		this.empMaxDegreeCode = empMaxDegreeCode;
		this.empMaxDegreeName = empMaxDegreeName;
		this.empMaxEducationCode = empMaxEducationCode;
		this.empMaxEducationName = empMaxEducationName;
		this.empSchooltag = empSchooltag;
		this.empMajor = empMajor;
		this.empGraduationDate = empGraduationDate;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSexCode() {
		return empSexCode;
	}

	public void setEmpSexCode(String empSexCode) {
		this.empSexCode = empSexCode;
	}

	public String getEmpSexName() {
		return empSexName;
	}

	public void setEmpSexName(String empSexName) {
		this.empSexName = empSexName;
	}

	public Date getEmpBirthday() {
		return empBirthday;
	}

	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}

	public String getEmpCardId() {
		return empCardId;
	}

	public void setEmpCardId(String empCardId) {
		this.empCardId = empCardId;
	}

	public String getEmpDeptCode() {
		return empDeptCode;
	}

	public void setEmpDeptCode(String empDeptCode) {
		this.empDeptCode = empDeptCode;
	}

	public String getEmpDeptName() {
		return empDeptName;
	}

	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}

	public String getEmpPostCode() {
		return empPostCode;
	}

	public void setEmpPostCode(String empPostCode) {
		this.empPostCode = empPostCode;
	}

	public String getEmpPostName() {
		return empPostName;
	}

	public void setEmpPostName(String empPostName) {
		this.empPostName = empPostName;
	}

	public Date getEmpEntryDate() {
		return empEntryDate;
	}

	public void setEmpEntryDate(Date empEntryDate) {
		this.empEntryDate = empEntryDate;
	}

	public Date getEmpJoinjobDate() {
		return empJoinjobDate;
	}

	public void setEmpJoinjobDate(Date empJoinjobDate) {
		this.empJoinjobDate = empJoinjobDate;
	}

	public String getEmpMiningProductivityCode() {
		return empMiningProductivityCode;
	}

	public void setEmpMiningProductivityCode(String empMiningProductivityCode) {
		this.empMiningProductivityCode = empMiningProductivityCode;
	}

	public String getEmpMiningProductivityName() {
		return empMiningProductivityName;
	}

	public void setEmpMiningProductivityName(String empMiningProductivityName) {
		this.empMiningProductivityName = empMiningProductivityName;
	}

	public String getEmpPersonSourceCode() {
		return empPersonSourceCode;
	}

	public void setEmpPersonSourceCode(String empPersonSourceCode) {
		this.empPersonSourceCode = empPersonSourceCode;
	}

	public String getEmpPersonSourceName() {
		return empPersonSourceName;
	}

	public void setEmpPersonSourceName(String empPersonSourceName) {
		this.empPersonSourceName = empPersonSourceName;
	}

	public String getEmpPoliticsStatusCode() {
		return empPoliticsStatusCode;
	}

	public void setEmpPoliticsStatusCode(String empPoliticsStatusCode) {
		this.empPoliticsStatusCode = empPoliticsStatusCode;
	}

	public String getEmpPoliticsStatusName() {
		return empPoliticsStatusName;
	}

	public void setEmpPoliticsStatusName(String empPoliticsStatusName) {
		this.empPoliticsStatusName = empPoliticsStatusName;
	}

	public String getEmpNationCode() {
		return empNationCode;
	}

	public void setEmpNationCode(String empNationCode) {
		this.empNationCode = empNationCode;
	}

	public String getEmpNationName() {
		return empNationName;
	}

	public void setEmpNationName(String empNationName) {
		this.empNationName = empNationName;
	}

	public String getEmpNativePlace() {
		return empNativePlace;
	}

	public void setEmpNativePlace(String empNativePlace) {
		this.empNativePlace = empNativePlace;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Double getEmpHeight() {
		return empHeight;
	}

	public void setEmpHeight(Double empHeight) {
		this.empHeight = empHeight;
	}

	public String getEmpBloodTypeCode() {
		return empBloodTypeCode;
	}

	public void setEmpBloodTypeCode(String empBloodTypeCode) {
		this.empBloodTypeCode = empBloodTypeCode;
	}

	public String getEmpBloodTypeName() {
		return empBloodTypeName;
	}

	public void setEmpBloodTypeName(String empBloodTypeName) {
		this.empBloodTypeName = empBloodTypeName;
	}

	public String getEmpMaritalStatusCode() {
		return empMaritalStatusCode;
	}

	public void setEmpMaritalStatusCode(String empMaritalStatusCode) {
		this.empMaritalStatusCode = empMaritalStatusCode;
	}

	public String getEmpMaritalStatusName() {
		return empMaritalStatusName;
	}

	public void setEmpMaritalStatusName(String empMaritalStatusName) {
		this.empMaritalStatusName = empMaritalStatusName;
	}

	public String getEmpBirthPlace() {
		return empBirthPlace;
	}

	public void setEmpBirthPlace(String empBirthPlace) {
		this.empBirthPlace = empBirthPlace;
	}

	public String getEmpRegisteredPlace() {
		return empRegisteredPlace;
	}

	public void setEmpRegisteredPlace(String empRegisteredPlace) {
		this.empRegisteredPlace = empRegisteredPlace;
	}

	public String getEmpMaxDegreeCode() {
		return empMaxDegreeCode;
	}

	public void setEmpMaxDegreeCode(String empMaxDegreeCode) {
		this.empMaxDegreeCode = empMaxDegreeCode;
	}

	public String getEmpMaxDegreeName() {
		return empMaxDegreeName;
	}

	public void setEmpMaxDegreeName(String empMaxDegreeName) {
		this.empMaxDegreeName = empMaxDegreeName;
	}

	public String getEmpMaxEducationCode() {
		return empMaxEducationCode;
	}

	public void setEmpMaxEducationCode(String empMaxEducationCode) {
		this.empMaxEducationCode = empMaxEducationCode;
	}

	public String getEmpMaxEducationName() {
		return empMaxEducationName;
	}

	public void setEmpMaxEducationName(String empMaxEducationName) {
		this.empMaxEducationName = empMaxEducationName;
	}

	public String getEmpSchooltag() {
		return empSchooltag;
	}

	public void setEmpSchooltag(String empSchooltag) {
		this.empSchooltag = empSchooltag;
	}

	public String getEmpMajor() {
		return empMajor;
	}

	public void setEmpMajor(String empMajor) {
		this.empMajor = empMajor;
	}

	public Date getEmpGraduationDate() {
		return empGraduationDate;
	}

	public void setEmpGraduationDate(Date empGraduationDate) {
		this.empGraduationDate = empGraduationDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSexCode=" + empSexCode + ", empSexName="
				+ empSexName + ", empBirthday=" + empBirthday + ", empCardId=" + empCardId + ", empDeptCode="
				+ empDeptCode + ", empDeptName=" + empDeptName + ", empPostCode=" + empPostCode + ", empPostName="
				+ empPostName + ", empEntryDate=" + empEntryDate + ", empJoinjobDate=" + empJoinjobDate
				+ ", empMiningProductivityCode=" + empMiningProductivityCode + ", empMiningProductivityName="
				+ empMiningProductivityName + ", empPersonSourceCode=" + empPersonSourceCode + ", empPersonSourceName="
				+ empPersonSourceName + ", empPoliticsStatusCode=" + empPoliticsStatusCode + ", empPoliticsStatusName="
				+ empPoliticsStatusName + ", empNationCode=" + empNationCode + ", empNationName=" + empNationName
				+ ", empNativePlace=" + empNativePlace + ", empPhone=" + empPhone + ", empEmail=" + empEmail
				+ ", empHeight=" + empHeight + ", empBloodTypeCode=" + empBloodTypeCode + ", empBloodTypeName="
				+ empBloodTypeName + ", empMaritalStatusCode=" + empMaritalStatusCode + ", empMaritalStatusName="
				+ empMaritalStatusName + ", empBirthPlace=" + empBirthPlace + ", empRegisteredPlace="
				+ empRegisteredPlace + ", empMaxDegreeCode=" + empMaxDegreeCode + ", empMaxDegreeName="
				+ empMaxDegreeName + ", empMaxEducationCode=" + empMaxEducationCode + ", empMaxEducationName="
				+ empMaxEducationName + ", empSchooltag=" + empSchooltag + ", empMajor=" + empMajor
				+ ", empGraduationDate=" + empGraduationDate + "]";
	}

}
