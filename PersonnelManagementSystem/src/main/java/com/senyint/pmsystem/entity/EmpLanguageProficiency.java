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
* @ClassName: EmpLanguageProficiency 
* @Description: 员工外语能力表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:09:35 
*
 */
@Entity
@Table(name = "P_EMP_LANGUAGE_PROFICIENCY")
@SequenceGenerator(name="SEQ_EMP_LANGUAGE_PROFICIENCY",sequenceName="SEQ_EMP_LANGUAGE_PROFICIENCY")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class EmpLanguageProficiency {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMP_LANGUAGE_PROFICIENCY")	//写明使用哪个序列生成器
	@Column(name = "LANGPRO_ID")
	private String langproId;	//员工外语能力信息编号（主键）

	@Column(name = "EMP_ID")
	private String empId;	//员工号

	@Column(name = "LANGPRO_LANGUAGES_CODE")
	private String langproLanguagesCode;	//外国语种编码

	@Column(name = "LANGPRO_LANGUAGES_NAME")
	private String langproLanguagesName;	//外国语种名称

	@Column(name = "LANGPRO_PROFIC_DEGREE_CODE")
	private String langproProficDegreeCode;	//外国语种熟练程度编码

	@Column(name = "LANGPRO_PROFIC_DEGREE_NAME")
	private String langproProficDegreeName;	//外国语种熟练程度名称

	public EmpLanguageProficiency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpLanguageProficiency(String langproId, String empId, String langproLanguagesCode,
			String langproLanguagesName, String langproProficDegreeCode, String langproProficDegreeName) {
		super();
		this.langproId = langproId;
		this.empId = empId;
		this.langproLanguagesCode = langproLanguagesCode;
		this.langproLanguagesName = langproLanguagesName;
		this.langproProficDegreeCode = langproProficDegreeCode;
		this.langproProficDegreeName = langproProficDegreeName;
	}

	public String getLangproId() {
		return langproId;
	}

	public void setLangproId(String langproId) {
		this.langproId = langproId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getLangproLanguagesCode() {
		return langproLanguagesCode;
	}

	public void setLangproLanguagesCode(String langproLanguagesCode) {
		this.langproLanguagesCode = langproLanguagesCode;
	}

	public String getLangproLanguagesName() {
		return langproLanguagesName;
	}

	public void setLangproLanguagesName(String langproLanguagesName) {
		this.langproLanguagesName = langproLanguagesName;
	}

	public String getLangproProficDegreeCode() {
		return langproProficDegreeCode;
	}

	public void setLangproProficDegreeCode(String langproProficDegreeCode) {
		this.langproProficDegreeCode = langproProficDegreeCode;
	}

	public String getLangproProficDegreeName() {
		return langproProficDegreeName;
	}

	public void setLangproProficDegreeName(String langproProficDegreeName) {
		this.langproProficDegreeName = langproProficDegreeName;
	}

	@Override
	public String toString() {
		return "EmpLanguageProficiency [langproId=" + langproId + ", empId=" + empId + ", langproLanguagesCode="
				+ langproLanguagesCode + ", langproLanguagesName=" + langproLanguagesName + ", langproProficDegreeCode="
				+ langproProficDegreeCode + ", langproProficDegreeName=" + langproProficDegreeName + "]";
	}

}
