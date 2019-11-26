package com.bit.javaex.oop.staticmember;

public class StaticExTest {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		//처음 staticEx Class를 불러와야 함으로 (설계도를 불러와야함) static 블록이 1회 호출
		// 그 이후 StaticEx의 생성자가 호출
		// static 멤버는 new를 이용해 인스턴스화 하지 않아도 접근 가능
		System.out.println("참조 갯수:" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		StaticEx s3 = new StaticEx();
		
		s2 = null; //사용 해제
		System.out.println("s2를 해제");
		
		System.gc(); //가비지 컬렉터 호출 - 일반적인 상황에서는 권장하지 않음
		try {
			Thread.sleep(3000); //3초 대기
			System.out.println("참조 갯수:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
		
		
	}

}
