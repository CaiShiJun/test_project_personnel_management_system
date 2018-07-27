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
* @ClassName: EmpSocialRelations 
* @Description: 员工家庭成员及社会关系信息表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:10:23 
*
 */
@Entity
@Table(name = "P_EMP_SOCIAL_RELATIONS")
@SequenceGenerator(name="SEQ_EMP_SOCIAL_RELATIONS",sequenceName="SEQ_EMP_SOCIAL_RELATIONS")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class EmpSocialRelations {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EMP_SOCIAL_RELATIONS")	//写明使用哪个序列生成器
	@Column(name = "SORELA_ID")
	private String sorelaId; // 员工家庭成员及社会关系信息编号（主键）

	@Column(name = "EMP_ID")
	private String empId; // 员工号

	@Column(name = "SORELA_RELATIONSHIP_CODE")
	private String sorelaRelationshipCode; // 与本人关系编码

	@Column(name = "SORELA_RELATIONSHIP_NAME")
	private String sorelaRelationshipName; // 与本人关系名称

	@Column(name = "SORELA_LINKMAN_NAME")
	private String sorelaLinkmanName; // "姓名 员工亲属的姓名"

	@Column(name = "SORELA_LINKMAN_COM")
	private String sorelaLinkmanCom; // "所在单位 员工该亲属所在的单位"

	@Column(name = "SORELA_LINKMAN_POSITION")
	private String sorelaLinkmanPosition; // 职位该亲属所在的职位

	@Column(name = "SORELA_LINKMAN_PHNUM")
	private String sorelaLinkmanPhnum; // "联系电话 员工该亲属的联系电话"

	public EmpSocialRelations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpSocialRelations(String sorelaId, String empId, String sorelaRelationshipCode,
			String sorelaRelationshipName, String sorelaLinkmanName, String sorelaLinkmanCom,
			String sorelaLinkmanPosition, String sorelaLinkmanPhnum) {
		super();
		this.sorelaId = sorelaId;
		this.empId = empId;
		this.sorelaRelationshipCode = sorelaRelationshipCode;
		this.sorelaRelationshipName = sorelaRelationshipName;
		this.sorelaLinkmanName = sorelaLinkmanName;
		this.sorelaLinkmanCom = sorelaLinkmanCom;
		this.sorelaLinkmanPosition = sorelaLinkmanPosition;
		this.sorelaLinkmanPhnum = sorelaLinkmanPhnum;
	}

	public String getSorelaId() {
		return sorelaId;
	}

	public void setSorelaId(String sorelaId) {
		this.sorelaId = sorelaId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSorelaRelationshipCode() {
		return sorelaRelationshipCode;
	}

	public void setSorelaRelationshipCode(String sorelaRelationshipCode) {
		this.sorelaRelationshipCode = sorelaRelationshipCode;
	}

	public String getSorelaRelationshipName() {
		return sorelaRelationshipName;
	}

	public void setSorelaRelationshipName(String sorelaRelationshipName) {
		this.sorelaRelationshipName = sorelaRelationshipName;
	}

	public String getSorelaLinkmanName() {
		return sorelaLinkmanName;
	}

	public void setSorelaLinkmanName(String sorelaLinkmanName) {
		this.sorelaLinkmanName = sorelaLinkmanName;
	}

	public String getSorelaLinkmanCom() {
		return sorelaLinkmanCom;
	}

	public void setSorelaLinkmanCom(String sorelaLinkmanCom) {
		this.sorelaLinkmanCom = sorelaLinkmanCom;
	}

	public String getSorelaLinkmanPosition() {
		return sorelaLinkmanPosition;
	}

	public void setSorelaLinkmanPosition(String sorelaLinkmanPosition) {
		this.sorelaLinkmanPosition = sorelaLinkmanPosition;
	}

	public String getSorelaLinkmanPhnum() {
		return sorelaLinkmanPhnum;
	}

	public void setSorelaLinkmanPhnum(String sorelaLinkmanPhnum) {
		this.sorelaLinkmanPhnum = sorelaLinkmanPhnum;
	}

	@Override
	public String toString() {
		return "EmpSocialRelations [sorelaId=" + sorelaId + ", empId=" + empId + ", sorelaRelationshipCode="
				+ sorelaRelationshipCode + ", sorelaRelationshipName=" + sorelaRelationshipName + ", sorelaLinkmanName="
				+ sorelaLinkmanName + ", sorelaLinkmanCom=" + sorelaLinkmanCom + ", sorelaLinkmanPosition="
				+ sorelaLinkmanPosition + ", sorelaLinkmanPhnum=" + sorelaLinkmanPhnum + "]";
	}

}
