package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//switchEx1();//메인에 불러줘야 실행됨 이 문장이 없을 경우 실행안됨
//		switchEx2();
		switchEx3();
	}
	
	
	public static void switchEx3() {
		//여러 개의 값을 한꺼번에 묶어서 case로 처리하고자 할 경우
		// 요일에 따라 다른 행동을 해 봅시다
		
		// TODO NOTE : 코드값 등을 만들고자 할 때에 문자열로 설정하는 것은 바람직하지 않다
		// 		이럴경우, 상수 혹은 ENUM 타입을 활용해서
		// 		데이터의 범위를 강제하거나 축소해야 한다
		// 		-> 이 메서드의 코드는 나중에 ENUM 타입으로 바꿔볼 것임
		String dow = "SUN";
		// SUN -> 휴식
		// MON, TUE, WED, THU -> 열공
		// FRI -> 불금
		// SAT -> 방전
		String message;
		switch (dow) {
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "불금";
			break;
		case "SAT":
			message = "방전";
		case "SUN":
			message = "휴식";
			break;
		default :
			message = "여긴 어디지?";
		
		}
		System.out.println(message);
		
	}
	
	
	
	
	public static void switchEx2() {
		// c언어의 switch는 수치형 판별만 가능하지만
		//java는 char, String도 가능하다
		char grade = 'A';
		// gradee A -> Excellent, B-> Good, C->So so, D-> Fail, 나머지 -> what?
		String message;
		switch (grade) {
		case 'A' :
		message = "Excellent!";
		break;
		case 'B' :
		message = "Good!";
		break;
		case 'C' :
		message = "So so!";
		break;
		case 'D' :
		message = "Fail!";
		break;
		default :
			message = "What?";
		}
		System.out.println(grade + ":" + message);
		
		
		
		
	}
	
	public static void switchEx1() {
		//일반적인  swith ~case 문의 사용법
		// 과목을 입력 받아서
		// 과목별 강의실을 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1:C, 2:C++, 3:Java");
		System.out.println("과목명:");
		int subject = scanner.nextInt();
		
		//swith는 조건 판별이 아니라 값의 판별
		String message;
		
		switch(subject) {
		case 1:
			message = "R101";
			break; // 잊지말자 break
		case 2:
			message = "R102";
			break;
		case 3:
			message = "R103";
			break;
			default:
				message = "문의바람";
				// 끝부분이기 때문에 브레이크 안해도 됨
				System.out.println(message);
				scanner.close();
		}
	}

}
