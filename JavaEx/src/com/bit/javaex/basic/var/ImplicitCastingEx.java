package com.bit.javaex.basic.var;

public class ImplicitCastingEx {

	public static void main(String[] args) {
		//  암묵적 캐스팅(Promotion)
		// 표현 범위가 좁은 데이터를 넓은 데이터로 변경할 때 
		// java 가 자동으로 캐스팅을 해 준다
		
		byte b = 25; //1바이트 정수형
		System.out.println("BYTE:" + b );
		
		short s = b; //2바이트 정수형
		//b는 1바이트이므로 short에 할당이 가능
		System.out.println("SHORT:" + s);
		
		int i = s;  //4바이트 정수형
		System.out.println(i);
		
		long l =i;   //8바이트 정수형
		System.out.println(l);
		
		
		float f = l; //4바이트 실수형
		// 바이트수는 long 형보다 작지만 범위가 넓으므로 암묵적 캐스팅이 가능
		System.out.println(f);
		
		char ch = 'A';
		//short s2 =ch; 둘이 signed? 다르기 때문에 안됨
		int e =ch;

		System.out.println(e);

	}

}
