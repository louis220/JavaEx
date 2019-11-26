package com.bit.javaex.oop.goods.v2;

public class Goods {
	// 필드 선언
	// private으로 접근 제한
	private String name; //name 이라고 하는 필드 
	private int price; //price라고 int타입의 필드를 가짐
	
	// Getter와 Setter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
		//this는 해당 인스턴스  위에 네임과 구분하기위해 
	}

	public void setPrice(int price) {
		this.price = price;
	}
	// 메서드 
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:" + price);
	
	}
	
	
}
