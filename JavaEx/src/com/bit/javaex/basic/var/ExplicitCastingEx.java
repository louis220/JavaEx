package com.bit.javaex.basic.var;

public class ExplicitCastingEx {

	public static void main(String[] args) {
		// 명시적 캐스팅 down casting
		// 표현 번위가 넓은 자료형을 좁은 자료형으로 변환
		// 자동 변환 완됨 (자료의 유실이 발생하기 때문에)

		byte b;
		int i = 2019;
		float f = 123.456f;
		
		System.out.println("INT:" + i);
		
		b = (byte)i; //int 가 byte 보다 표현 범위가 넓으므로 강제로 캐스팅시도
		
		System.out.println("BYTE:" + b);
		
		i=(int)f;// i= f값을 int형식으로 강제 변환한 값이 되므로 123이 된다
		System.out.println("FLOAT:" + f + " -> INT" + i);
	}

}
