package com.bit.javaex.basic.var;

public class ConstantEx {
	//상수는 static final 로 고정
	//final은 한번 할당되면 재할당 불가하다
	static final double PI = 3.14159;
	//상수의 이름은 모두 대문자
	//단어의 구분은 _로 
	static final int SPEED_LIMIT = 100;
	
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		// 상수를 쓰는 이유 1.가독성 높일 수 있다
		//	          2. 동일 값을 일괄 관리할 수 있다
		//            3. 값을 보호할 수 있다
		System.out.println("현재 제한 속도는"+ SPEED_LIMIT + "입니다");
		
		//값을 고정하지 않을 경우 이 위치에 SPEED_LIMIT = 120; 으로 해서 밑 값을 120으로 출력되도록 변경가능
		//final은 변경할 수 없다
		
		System.out.println(SPEED_LIMIT + "이하로 주행해 주십시오.");
		
		//java는 상수를 많이 활용합니다.
		System.out.println(Math.PI); //내장 Math 객체의 상수

	}

}
