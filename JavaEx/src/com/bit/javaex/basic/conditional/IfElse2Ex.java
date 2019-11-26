package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElse2Ex {

	public static void main(String[] args) {
		System.out.println("1: C, 2: C++, 3: Java");
		//키보드로부터 정수 입력
		//1 -> R101  2-> R102, 3 -> R103 그외 -> 문의
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목명:");
		
		int subject = scanner.nextInt();
		String message;
		
		//조건판별
		if (subject == 1) {
			message = "R101";
		} else if (subject ==2) {
			message = "R102";
		}	else if (subject ==3) {
				message = "R103";
			}else {
				message = "문의바람";
			}
		
		System.out.println(message);
		scanner.close();
		}

	}

