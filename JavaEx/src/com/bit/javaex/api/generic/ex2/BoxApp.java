package com.bit.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 클래스 테스트
		Box<Integer> intBox = new Box<>(); //integer만 담을 수 있다
		intBox.setContent(2019);
//		intBox.setContent("String"); // 안돼요: 내부데이터는 integer라서
		
		// 내용물 꺼내 보자
		//  내용물의 타입을 객체 생성시 지정했기 때문에 다운캐스팅 필요없다
		int retVal = intBox.getContent();
		System.out.println(retVal);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();
		System.out.println(strVal);
		// Object 타입을 데이터 참조하게 되면
		// 캐스팅 문제 등 여러가지 부가적인 문제가 발생한다
		// 만약에 캐스팅을 잘못했다면?
		// Generic으로 만든 클래스는 내부 데이터 타입을 강제 했기 때문에
		// 컴파일 타임에서 캐스팅 오류를 잡아낼 수 있다
//		strVal = (String)intBox.getContent(); //안전하지 않음
	}

}
