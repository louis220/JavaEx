package com.bit.javaex.collection;

public class ClassRoom {
	//필드
	private String subject; //과목명
	private String roomName; // 강의장 명
	
	//생성자
	public ClassRoom(String subject) {
		this.subject= subject;
	}
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return other.hashCode() == hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 객체 식별 정수
//		return super.hashCode();
		return subject.hashCode();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
