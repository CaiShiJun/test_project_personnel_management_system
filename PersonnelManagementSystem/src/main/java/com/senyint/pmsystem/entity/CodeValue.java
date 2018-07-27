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
* @ClassName: CodeValue 
* @Description: 编码名称参数表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:04:05 
*
 */
@Entity
@Table(name = "CODE_VALUE")
@SequenceGenerator(name="SEQ_CODE_VALUE",sequenceName="SEQ_CODE_VALUE")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class CodeValue {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_CODE_VALUE")	//写明使用哪个序列生成器
	@Column(name = "cvId")
	private String cvId; // code_value的编号id（主键）

	@Column(name = "csId")
	private String csId; // 区分一类 代码-名称 数据。

	@Column(name = "CODE")
	private String code; // 代码

	@Column(name = "NAME")
	private String name; // 名称

	public CodeValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CodeValue(String cvId, String csId, String code, String name) {
		super();
		this.cvId = cvId;
		this.csId = csId;
		this.code = code;
		this.name = name;
	}

	public String getcvId() {
		return cvId;
	}

	public void setcvId(String cvId) {
		this.cvId = cvId;
	}

	public String getcsId() {
		return csId;
	}

	public void setcsId(String csId) {
		this.csId = csId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CodeValue [cvId=" + cvId + ", csId=" + csId + ", code=" + code + ", name=" + name + "]";
	}

}
