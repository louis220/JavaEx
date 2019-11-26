package com.bit.javaex.api.objectclass.ex01;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		//Java의 최상위 클래스는 object -> 기본적으로 모든 클래스는
		// Object가 가진 모든 매서드를 사용 할 수 있다
		System.out.println(p.getClass().getName());
		System.out.println("Hashcode:" + p.hashCode());
		System.out.println("toString:" + p.toString());
		System.out.println("Point:" +p); //toString() 생략
	}

}
