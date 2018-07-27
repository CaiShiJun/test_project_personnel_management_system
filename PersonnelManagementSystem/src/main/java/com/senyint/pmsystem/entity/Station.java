package com.senyint.pmsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
* @ClassName: Station 
* @Description: 员工岗位表
* @author Cai ShiJun 
* @date 2017年9月13日 上午9:11:19 
*
 */
@Entity
@Table(name = "P_STATION")
//@SequenceGenerator(name="SEQ_STATION",sequenceName="SEQ_STATION")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class Station {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_STATION")	//写明使用哪个序列生成器
	@GeneratedValue(generator="system-uuid")  
	@GenericGenerator(name="system-uuid", strategy = "uuid") 
	@Column(name = "STAT_ID")
	private String statId; // 岗位编号（主键）

	@Column(name = "STAT_NAME")
	private String statName; // 岗位名称

	@Column(name = "STAT_TYPE_CODE")
	private String statTypeCode; // 岗位类型代码

	@Column(name = "STAT_TYPE_NAME")
	private String statTypeName; // 岗位类型名称

	@Column(name = "STAT_SIZE")
	private Integer statSize; // 岗位编制，岗位上最多可配置多少员工

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Station(String statId, String statName, String statTypeCode, String statTypeName, Integer statSize) {
		super();
		this.statId = statId;
		this.statName = statName;
		this.statTypeCode = statTypeCode;
		this.statTypeName = statTypeName;
		this.statSize = statSize;
	}

	public String getStatId() {
		return statId;
	}

	public void setStatId(String statId) {
		this.statId = statId;
	}

	public String getStatName() {
		return statName;
	}

	public void setStatName(String statName) {
		this.statName = statName;
	}

	public String getStatTypeCode() {
		return statTypeCode;
	}

	public void setStatTypeCode(String statTypeCode) {
		this.statTypeCode = statTypeCode;
	}

	public String getStatTypeName() {
		return statTypeName;
	}

	public void setStatTypeName(String statTypeName) {
		this.statTypeName = statTypeName;
	}

	public Integer getStatSize() {
		return statSize;
	}

	public void setStatSize(Integer statSize) {
		this.statSize = statSize;
	}

	@Override
	public String toString() {
		return "Station [statId=" + statId + ", statName=" + statName + ", statTypeCode=" + statTypeCode
				+ ", statTypeName=" + statTypeName + ", statSize=" + statSize + "]";
	}

}
