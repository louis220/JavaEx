package com.bit.javaex;

public class MethodEx {

	public static double getSum(double a, double b) { 
		//a, b는 고정인자
		// double 값을 반환해야 한다
		return a + b;
	}
	
	public static double getSumVar(double... values) {
		// ...표기는 가변인자를 의미하고
		// value는 배열로 전달된다.
		double total = 0;
		for (double num : values) {
			total += num;
		}
		return total;
	}
	
	public static void printTotal(String message,
			double ... value) {
		//반환할 값이 없어도 선언부에서는 리턴 타입이 있어야 한다(void)
		// 고정 인자와 가변인자를 같이 쓸 경우 순서에 유의해야 한다
		// 먼저 고정인자가 나와야 한다, 그 뒤에 가변 인자 선언
		System.out.println(message + " " + getSumVar(value));
		// return 타입이 void 이기 때문에 return 문은 없어도 된다
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("3 + 5:" + getSum(3, 5));
		System.out.println(getSumVar(2, 3, 5, 2, 1, 6));
		printTotal("결과는?", 3, 5, 2, 6, 5, 4, 6, 7);
	}

}
