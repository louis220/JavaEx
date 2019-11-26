package com.bit.javaex.basic.reftype;

public class argsTest {

	public static void main(String[] args) {
		// main이 실행될 때 인수(arguments)를 부여할 수 있고
		// 인수는 args라는 String 배열로 넘어온다
		for (String arg:args) {
			System.out.println("ARG:" + arg);
		}

	}

}
