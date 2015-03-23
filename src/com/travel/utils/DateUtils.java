package com.travel.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateUtils {

	public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static final String getDate(String format) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String cdate = sdf.format(cal.getTime());
		return cdate;
	}

	public static final Date getDate(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return new Date(sdf.parse(date).getTime());
		} catch (Exception e) {
			return null;
		}
	}

	/* 返回指定年份和月份的当月的天数 */
	public static final int getDays(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);

		return calendar.getActualMaximum(Calendar.DATE);
	}

	public static String getPreDay(String format) {
		if (format.equals("")) {
			format = DEFAULT_DATETIME_PATTERN;
		}
		Date d = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(d);
	}

	public static  String getAgoSomeDay(int dayNum,String format){
		Calendar cal = Calendar.getInstance();
		int datys = cal.get(Calendar.DAY_OF_MONTH);  
		cal.set(5, datys-dayNum);
		return DateUtils.getDate(cal.getTime(),format);
	}
	
	public static final String getLoginDate(java.util.Date date, String format) {
		if (format.equals("")) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		if (date == null) {
			date = new Date(System.currentTimeMillis());
		}
		SimpleDateFormat fm = new SimpleDateFormat(format);
		return fm.format(date);
	}

	public static final String getDate(java.util.Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String cdate = sdf.format(date);
		return cdate;
	}

	public static final String getDate(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String cdate = sdf.format(c.getTime());
		return cdate;
	}

	public static final String getDate(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		String cdate = sdf.format(c.getTime());
		return cdate;
	}
	
}
