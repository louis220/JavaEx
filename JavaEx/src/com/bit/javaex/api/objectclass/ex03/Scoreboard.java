package com.bit.javaex.api.objectclass.ex03;

import java.util.Arrays;

// 복제 가능하도록 Cloneable 인터페이스를 구현
public class Scoreboard implements Cloneable{
	//필드로 참조형이 있을 경우
	private int scores[];
	// 생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// step1 먼저 얕은 복제를 시도
		// step2 내부 참조 자료형을 복제해서 다시 할당
		Scoreboard newBoard = (Scoreboard)super.clone(); //얕은 복제
		// 내부 참조 객체의 복제 시도
		newBoard.scores = Arrays.copyOf(scores, scores.length);
		return newBoard;
	}


	//복제를 위한 getclone 구현
	public Scoreboard getClone() {
		Scoreboard newBoard = null;
		try {
			newBoard = (Scoreboard)clone(); //클론을 스코어보드로 강제 변환
			//클론 메서드를 실행할 때, 내부 참조 자료를 새로 복제해서 
			// 다시 할당해야 한다
			// -> 클론 매서드를 오버라이드 해서 새로 구현을 해 줘야 한다
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return newBoard;
	}
	//getter setter
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
	@Override
	public String toString() {
		String output = "Scoreboard(";
		for (int i =0; i <scores.length; i++) {
			output += scores[i];
			if (i < scores.length - 1) {
				output += ",";
			}
		}
		output += ")";
		
		return output;
	}

}
