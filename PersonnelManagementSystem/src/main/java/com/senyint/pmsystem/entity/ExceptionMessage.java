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
* @ClassName: ExceptionMessage 
* @Description: 异常信息捕捉表
* @author Cai ShiJun 
* @date 2017年9月30日 下午4:56:13 
*
 */
@Entity
@Table(name = "EXCEPTION_MESSAGE")
@SequenceGenerator(name="SEQ_EXCEPTION_MESSAGE",sequenceName="SEQ_EXCEPTION_MESSAGE")	//name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class ExceptionMessage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_EXCEPTION_MESSAGE")	//写明使用哪个序列生成器
	@Column(name = "EXCEP_ID")
	private Integer excepId;		//异常信息捕捉表主键id
	
	@Column(name = "EXCEP_MESSAGE")
	private String excepMessage;		//异常信息字段
	
	@Column(name = "EXCEP_TIME")
	private Date excepTime;		//异常发生时间
	
	public ExceptionMessage(){
		
	}

	public ExceptionMessage(Integer excepId, String excepMessage, Date excepTime) {
		super();
		this.excepId = excepId;
		this.excepMessage = excepMessage;
		this.excepTime = excepTime;
	}

	public Integer getExcepId() {
		return excepId;
	}

	public void setExcepId(Integer excepId) {
		this.excepId = excepId;
	}

	public String getExcepMessage() {
		return excepMessage;
	}

	public void setExcepMessage(String excepMessage) {
		this.excepMessage = excepMessage;
	}

	public Date getExcepTime() {
		return excepTime;
	}

	public void setExcepTime(Date excepTime) {
		this.excepTime = excepTime;
	}

	@Override
	public String toString() {
		return "ExceptionMessage [excepId=" + excepId + ", excepMessage=" + excepMessage + ", excepTime=" + excepTime
				+ "]";
	}
	
	
	
	
	
}
