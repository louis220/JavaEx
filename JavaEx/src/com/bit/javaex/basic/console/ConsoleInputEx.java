package com.bit.javaex.basic.console;

import java.util.Scanner;  //Scanner 불러오기
public class ConsoleInputEx {

	public static void main(String[] args) {
		//Console Input : Scanner
		// 표준 입력(System.in)으로부터 입력받을
		// 스캐너 생성
		
		Scanner scanner = new Scanner(System.in);
		
		// 스캐너로부터 이름을 입력받아
		// Hello, (이름) 이되도록
		System.out.print("이름입력:");
		String name = scanner.next();
		System.out.println("Hello, " + name);
		// 스캐너로부터 정수 입력
		// 출력
		System.out.print("정수입력:");
		int num = scanner.nextInt();
		System.out.println(num);
		
		// 시스템 자원을 사용했으면 꼭 닫아줘야 한다

		scanner.close();
		

	}

}
