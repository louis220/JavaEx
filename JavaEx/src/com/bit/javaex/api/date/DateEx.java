package com.bit.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//날짜 얻어오기
		//Java.util 안에 있으므로 명시적으로 import
		Date now = new Date();
		String nowStr = now.toString();
		System.out.println("현재시간:" + nowStr);
		System.out.println(now.toLocaleString()); 
		//deprecated -> 앞으로는 없어질 예정이므로
		// 다른 방식을 사용하자
		
		//날짜 출력 형식 사용
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		
		//dateformat full ling medium short
		
		//simpledateformat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("포매팅된 날짜 정보:" + sdf.format(now));


	}

}
