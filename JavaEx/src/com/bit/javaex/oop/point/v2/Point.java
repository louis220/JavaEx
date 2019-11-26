package com.bit.javaex.oop.point.v2;

public class Point {
	// 필드 만들기 (은닉 :private)
	private int x;
	private int y;
	
	// 생성자
//	public Point() {
//		//기본 생성자
//	}
	
	public Point(int x, int y) {
		//super()가 생략된 상태
		this.x = x; 
		this.y = y;
	}
	//getter setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y){
		this.y =y;
	}
	
	//메서드
	public void draw() {
		System.out.printf("점[%d, %d]을 그렸습니다.%n",
				x, y);
	}
	//메소드 오버로딩이란?(다향성 중)
	//같은 리턴 타입, 같은 이름의 메서드를 중복해서 선언하는 것
	// 메서드 인자값에 따라 조금씩 다른 기능을 수행하도록 만들 수 있다
	public void draw(boolean show) {
		// boolean show가 true면 -> 그렸습니다.
		//				 false면 -> 지웠습니다.
		String message = String.format("점[%d, %d]을 ", x, y);
		if (show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다";
		}
		System.out.println(message);
	}
}






