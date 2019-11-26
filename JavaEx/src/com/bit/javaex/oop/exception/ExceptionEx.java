package com.bit.javaex.oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	// ArithmeticException
	public static void AtithExceptEx() {
		// 상황1
		// Scanner로 부터 정수를 입력 받아서
		// 해당 정수로 100을 나눈다
		
		double result = 0;
		Scanner scanner = new Scanner(System.in);
		int num = 0; //입력 값 변수
		
		try {
			// 오류 발생 가능 영역
			System.out.println("정수를 입력해 주세요:");
			num = scanner.nextInt();  //정수 입력 받음
			result = 100/ num;
			
			System.out.println("결과:" + result);
			// 오류 발생 가능 영역 끝
		}catch (InputMismatchException e) {
			System.out.println("정수로 해 주세요!");
		}catch (ArithmeticException e) {
			//ArithmeticException 발생했을 경우의 처리
			System.out.println("0으로는 나눌 수 없어요:");
			System.out.println("ERROR 메시지:" + e.getMessage());
		}catch(Exception e) { //Exception catch 블록은 맨 마지막에 위치 
						// Exception 클래스는 모든 예외를 다 처리하기 때문
			e.printStackTrace(); //오류정보 추석해서 출력해달라
		} finally{
			//예외여부에 상관없이 상항 마지막에 실행
			System.out.println("Finally 실행");
		}
		
		scanner.close();
		
	}
	public static void arrayExceptionEx() {
		//arrayIndexOutOfBoundsException 테스트
		int intArray[] = {3, 6, 9};
		//intArray의 length == 3
		// intArray의 인덱스 범위 0~2 까지 
		System.out.println("길이:" + intArray.length);
		
		try {
		intArray[4] = 12;
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : 인덱스 범위는" 
						+ (intArray.length -1 +"까지 입니다."));
					System.out.println(e.getMessage());	
			
		}
}
	
	public static void main(String[] args) {
		
//		AtithExceptEx();
		arrayExceptionEx();

	}

}
