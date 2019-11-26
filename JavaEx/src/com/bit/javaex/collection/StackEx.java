package com.bit.javaex.collection;

import java.util.Stack;

public class StackEx {
	
	//Stack
	// Last Input First Output

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		// 스택은 벡터를 상속해서 만듦 -> 버퍼가 있는 자료형
		//루프를 돌면서 스택에 값을 집어 넣어 보자
		for (int i = 1; i <= 10; i++) {
			stack.push(i); //스택에 input
		}
		System.out.println("STACK:" + stack);  //10이 가장 나중에 들어옴
		
		// 가장 마지막 값을 확인
		int out =  stack.peek();
		System.out.println("가장 마지막 입력값:" + out);
		System.out.println("STACK:" + stack); //peek는 데이터 추출하지 않고 훔쳐보는거라 그대로 
		
		out = stack.pop();
		System.out.println("POP:" + out);
		System.out.println("STACK" + stack);
		
		//루프를 돌면서 데이터를 pop
		while(!stack.empty()) {//stack이 비어있지 않은 동안 이라는 뜻
			//비어 있는 stack에서 데이터를 pop할 경우 익셉션 발생
			System.out.println("POP:" + stack.pop());
			System.out.println("STACK:" + stack);
		}
	}

}
