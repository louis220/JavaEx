package com.bit.javaex.basic.var;

public class FloatDoubleEx {
	public static void main(String[] args) {
		// float 4바이트 double 8바이트
		float floatVal = 3.14159F; //float 뒤에 F
		double doubleVal = 3.14159;
		
		floatVal =0.1234567894561234555F;
		doubleVal = 0.12345678945612567489;
		
		//정밀도
		
		System.out.println("float:"+ floatVal);
		System.out.println("double:"+ doubleVal);
		
		//일반 컴퓨터 프로그래밍에세 실수 데이터는 정밀도를 포기하고 범위를 넓힌 것
		
		//0.1을 3번 곱해보면
		System.out.println(0.1*3);
		
		// 지수표기법 e
		// 300000
		doubleVal = 3e5;
		System.out.println(doubleVal);
	}

}
