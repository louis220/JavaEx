package com.bit.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		// point 클래스 테스트
		Point p1 = new Point(10,10);
		p1.draw();
		p1.draw(true);

		Point p2 = new Point(20,20);
		// 아래 두 메서드는 오버로딩된 메서드들
		p2.draw();
		p2.draw(false);

		
	}

}
