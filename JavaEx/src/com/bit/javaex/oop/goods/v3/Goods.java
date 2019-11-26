package com.bit.javaex.oop.goods.v3;

public class Goods {
	// 필드 선언
	// private으로 접근 제한
	private String name; //name 이라고 하는 필드 
	private int price; //price라고 int타입의 필드를 가짐
	
	
	// 생성자
	// 만약에 코드에 생성자가 하나도 없다면 컴파일러가 기본생성자를 자동으로 추가
	// 생성자는 반드시 1개 이상 있어야 한다
	
	public Goods(String name) {
		this.name = name;
	}
	public Goods(String name, int price) { //괄호안의 것을 초기화한다
	//	super(); //부모 생성자 호출 -> 부모로부터 물려받은 필드 초기화
		// 명시적으로 부모 생성자를 호출하지 않으면 컴파일러가
		// 기본 부모 생성자를 끼워넣는다
		
//		this.name = name;
		this(name); //이건 무슨뜻일까... 세팅되는거...? 
		this.price = price; //중복되므로 특정한 내것이다라고 정의하는것
	}
	
	// Getter와 Setter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	// Setter가 없으면 field는 read only가 된다
	/*
	
	public void setName(String name) {
		this.name = name;
		//this는 해당 인스턴스  위에 네임과 구분하기위해 
	}

	public void setPrice(int price) {
		if (price > 0)
		this.price = price;
	}
	*/
	// 메서드 
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:" + price);
	
	}
	
	
}
