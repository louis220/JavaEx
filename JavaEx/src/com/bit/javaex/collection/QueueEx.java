package com.bit.javaex.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	// Queue : 파이프를 떠올리면 된다
	// 입력 방향과 출력 방향이 반대
	// 중간에 값을 넣고 뺄수 없다
	public static void main(String[] args) {
		// queue를 만들어 봅시다
		// queue는 클래스가 아니라 인터페이스
		// 실제 클래스는 linkedlist의 저장기능을 그대로 이용 arraylist는 안됨
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터를 제공
		for (int i = 1; i <=10; i++) {
			queue.offer(i); //큐 데이터 넣기
		}
		
		System.out.println("QUEUE:" + queue);
		
		//가장 처음 입력된 값을 확인
		int out = queue.peek(); //큐에서 데이터 꺼내기
		System.out.println("PEEK:" + out);
		System.out.println("QUEUE:" + queue);
		
		//데이터 끄집어 내기 -> poll()
		out = queue.poll(); // 데이터를 끄집어 내고 큐로부터 삭제
		System.out.println("POLL:" + out);
		System.out.println("QUEUE:" + queue);
		
		// 루프를 돌면서 전체 데이터를 꺼내 봅시다
		while(!queue.isEmpty()) {
			System.out.println("POLL:" + queue.poll());
			System.out.println("QUEUE:" + queue);
		}
	}

}
