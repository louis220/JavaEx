package com.bit.javaex.basic.var;

public class BolleanEx {

	public static void main(String[] args) {
		// 논리형(true, false)
		boolean b1 = true; //참
		boolean b2 = false; //거짓
		//조건 분기, 반복 등에서 흐름제어를 위해 논리값을 사용
		//매우 중요
		
		System.out.println(b1);
		System.out.println(b2);
		
		// 두개의 정수값이 있을때 대소 비교를 해서
		// 논리값을 추출해 봅시다
		
		boolean result;
		int i1 = 3, i2 = 5;
		
		result = i1 > i2;
				
		System.out.println(i1 +">" + i2  +"?:"
							+ result);
	}

}
