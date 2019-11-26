package com.bit.javaex.api.stringclass;

public class StringPractice {

	public static void main(String[] args) {
		
		String s1 = "aBcAbCabcABC";
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.length());
		System.out.println(s1.replace("a", "R"));
		System.out.println(s1.replace("abc", "123"));
		System.out.println(s1.substring(0,3));
		System.out.println(s1.toUpperCase());

	}

}
