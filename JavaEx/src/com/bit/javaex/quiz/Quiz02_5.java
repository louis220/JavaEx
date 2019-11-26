package com.bit.javaex.quiz;

public class Quiz02_5 {

	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		String message;
		message = ++num1 + 1 == num2++ +1? "같음" : "다름";
	
		System.out.println(message);
		
		System.out.println(++num1 +1 );
		System.out.println(num2++ +1 );
	}

}
