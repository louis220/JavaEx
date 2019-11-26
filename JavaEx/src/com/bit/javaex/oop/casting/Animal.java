package com.bit.javaex.oop.casting;

public class Animal {
	//필드
	protected String name;
	
	// 생성자
	public Animal(String name) {
		this.name =name;
	}

	//메서드
	public void eat() {
		System.out.println( name + "is eating...");
	}
	
	public void walk() {
		System.out.println(name + "is walking...");
	}
	
	
}
