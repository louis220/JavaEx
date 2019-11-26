package com.bit.javaex.thread.ex03;

public class AlphabetThread implements Runnable {
	// runnable 인터페이스를 구현한 쓰레드 클래스
	@Override
	public void run() {
		for (char ch = 'A'; ch <='Z'; ch++) {
			System.out.println("MainThread:" + ch);
			
			//출력 속도 제한 thread.sleep()
				
			try{
				Thread.sleep(300); // 0.3초 대기
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
		
	}
	
	

}
