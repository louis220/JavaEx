package com.bit.javaex.basic.reftype;

public class StringEx {
	
	
	public static void defineStr() {
		// 문자열 선언
		String str; // 선언
		str = "JAVA"; // 코드에 직접 입력한 값 : Literal
		String str2 = "JAVA"; //리터럴 str과 같은 값
		String str3 = new String("JAVA");
		
		// == 비교
		System.out.println(str == str2);
		System.out.println(str == str3);
		// 참조 타입(객체)에서 ==은 객체의 주소 비교다( 값의 비교가 아님) 그래서 str과 str3의 값은 같지만 str3은 
		//주소가 새로 만들어서 false가 된것
		
		//값의 비교 : Java의 모든 객체는 equals라는 값 비교 매서드가 있다
		System.out.println(str.equals(str3));	
			}

	
	public static void stringFormatEx() {
		// 포멧 문자 %d(10진), %s(문자열), %f(실수형) %n(개행문자
		// -> String.format 매서드 or System.out.printf
		String fruit = "사과";
		int total = 10, eat = 3;
		
		System.out.println(total + "개의" + fruit + "중에서" 
				+ eat + "개를 먹었다.");
		//가변 데이터 영역을 포맷 문자로 설정하고 고정영역을 문자열로 설정
		// 향후에 포멧 문자에 연결시킬 데이터를 지정
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n", 
				total, fruit, eat);
		
		float rate = 1.2345f;
		// 현재 이자율은 1.23%입니다.
		String fmt = "현재 이자율은 %.2f%%입니다.%n";
		//%f의 경우 소수점 자리수를 지정 가능
		//%% -> %로 출력(%가 포맷 지정 문자)
		System.out.printf(fmt, rate);
		// 포멧으로 지정된 문자열은 재활용 가능
		String s = String.format(fmt, 1.5678f);
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args) {
//		defineStr();
		stringFormatEx();
	}

}
