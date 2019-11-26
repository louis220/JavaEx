package com.bit.javaex.api.objectclass.ex03;

public class ObjectTest {

	public static void main(String[] args) {
		//Point 클래스의 복제 테스트
		Point p = new Point (10, 10);
		System.out.println(p);
		Point p2 = p;
		System.out.println(p2);
		//두 객체는 별개의 객체인가?
		System.out.println( p == p2);  //두 식별자는 같은 객체
		
		//객체 복제(얕은 복제)
		p2 = p.getClone();
		//point 클래스는 cloneable 인터페이스를 구현하고
		// 복제를 위한 getclone  메서드를 구현했기 때문에
		// 복제 객체를 얻어낼 수 있다.
		System.out.println(p2);
		System.out.println(p == p2);
		
		// p2는 복제된 새로운 객체
		
		//Scoreboard 복제 테스트
		// scoreboard는 내부에 참조형(배열)을 가지고 있다
		Scoreboard s1 =  new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1=" + s1);
		Scoreboard s2 = s1.getClone();
		System.out.println("s2=" + s2);
		//s1과 s2는 같은 객체인가?
		System.out.println(s1 == s2); //s2 는 복제가 된 새 객체다
		
		
		//s2 내부에 참조자료(배열)의 값을 바꿔 봅시다
		s2.getScores()[2] = 100;
		System.out.println("s2=" + s2);
		System.out.println("s1=" + s1);
		
		//얕은 복제의 경우, 참조자료형은 주소값만 복제되기 때문에 문제가 발생할 수 있다
		// 내부 참조 자료형의 경우 내부에서 clone이 일어날 때 
		// 참조 자료형을 모두 새롭게 복제해서 다시 참조해야 한다
		// ***** 깊은복제
	}
	
}
