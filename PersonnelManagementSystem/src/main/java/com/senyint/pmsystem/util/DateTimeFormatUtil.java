package com.senyint.pmsystem.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatUtil {

	/**
	 * 
	 * @Title: dateStr4_2_2ToDate
	 * @Description: yyyy-MM-dd 转换为 Date 类型
	 * @param dateStr
	 * @return
	 * @throws ParseException
	 * @throws 
	 * @author	Cai ShiJun       
	 * @date 2017年10月13日 下午2:03:31
	 */
	public static Date dateStr4_2_2ToDate(String dateStr) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.parse(dateStr);
	}
}
