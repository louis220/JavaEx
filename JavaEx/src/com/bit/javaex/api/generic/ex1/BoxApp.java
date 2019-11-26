package com.bit.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 클래스 테스트
		Box intBox = new Box();
		intBox.setContent(2019);
		
		// 내용물 꺼내 보자
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal =  (String)strBox.getContent();
		System.out.println(strVal);
		// Object 타입을 데이터 참조하게 되면
		// 캐스팅 문제 등 여러가지 부가적인 문제가 발생한다
		// 만약에 캐스팅을 잘못했다면?
		strVal = (String)intBox.getContent(); //안전하지 않음
	}

}
