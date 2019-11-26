package com.bit.javaex.api.objectclass.examples;

public class Rectangle {
	
	// 필드 width, height
	//만약에 두 사각형이 면적이 같으면 equals(같다)고 판정
	//필드
	private int width;
	private int height;
	
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	// 메서드
	public int getArea() {
		return width * height;
	}

	@Override
	public boolean equals(Object obj) { //부모객체가 없기때문에 젤위인 object에서 받아온건데 오버라이딩해야하니까 object를 씀
		// 외부로부터 넘어온 obj 가 비교 가능한 객체인지 먼저 확인
		if (obj instanceof Rectangle ) {
			// obj는 rectangle로 캐스팅 가능
			Rectangle other = (Rectangle)obj;
			return getArea() == other.getArea();
		} 
		return super.equals(obj); //부모클래스보고 비교를 해달라고 하는것
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	
}
