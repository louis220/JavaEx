package com.bit.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// 콘솔 출력
		// System.out.print : 출력 후 개행 없음
		// System.out.println : 출력 후 개행
		// System.out.printf : 형식 지정 문자열 출력
		
		System.out.print("Hello "); //개행 없음
		System.out.println("Java"); //출력 후 개행
		
		// 이스케이프 문자
		
		// \n 개행 , \t 탭 , \" 쌍따옴표  \\ (\그자체) 하나만 쓰면 에러..
		System.out.println("Hello\nJava"); // 강제개행 \n
		System.out.println("Hello\tJava"); // 탭문자 /t
//		Hello "java" 를 인쇄하기위해서 밑처럼 입력
		String message = "Hello\"Java\""; // 쌍 따옴표 \"
		System.out.println (message);
		
		String dir = "D:\\javastudy"; //역슬래시 그 자체 \\
		System.out.println(dir);
	}

}
