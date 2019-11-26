package com.bit.javaex.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	//vector
	// 버퍼형 자료형
	// 순서가 있는 개체들의 집합
	
	public static void main(String[] args) {
		// 백터 생성
		Vector v = new Vector(); //특별히 타입 지적하지 않아도 됨 generic으로 타입 지정하지 않았음 -> object/ 모든타입이 될수있음
		System.out.println("Size:" + v.size()
							+",Capacity:" + v.capacity());
		
		Vector<Integer> v2 = new Vector<>(8); // 인티저를 담을 8개의 공간을 가진 벡터
		System.out.printf("Size: %d, Cap :%d%n", v2.size(), v2.capacity());
		
		// 1부터 10까지 값을 담아봅시다.
		for (int i =1; i <=10; i++) {
			v2.addElement(Integer.valueOf(i));
			//Wrapper 클래스는 자동 wrapping이 되므로 
			// v2.addElement(i); 해야함 지금은 그냥 이해해보라고 위의방식으로 함
			
		}
		System.out.printf("Size: %d, Cap:%d%n", v2.size(), v2.capacity());
		// 용량을 원래 설정해둔 칸(크기)를 초과하면 자동으로 증가(capacity 만큼)
		
		System.out.println("v2에 7이 있는가?" + v2.contains(7));
		
		// v2에 7은 몇번 인덱스에 있는가?
		System.out.println("index of 7:" + v2.indexOf(7));
		
		//중간에 객체 삽입
		v2.insertElementAt(11, 5);
		
		//객체 조회
		System.out.println("5번 인덱스에 있는 객체: " + +v2.elementAt(5));
		
		//객체검색 : 없는 객체
		System.out.println("없는 객체 검색:" + v2.indexOf(0));
		
		//객체 삭제
		v2.remove(10);
		System.out.println(v2);
		
		
		//내부 데이터를 순화하고자 하는 경우
		/*
		for (Integer i : v2) {
			System.out.println("Element : " +i);
		}
		//TODO: -> 나중에 다른 방식으로 바꿀 예정
		*/
		//enumeration : Vector ,Hashtable
		Enumeration<Integer> e = v2.elements();
		//루프
		while(e.hasMoreElements()) { //뒤에 데이터가 더 있는가?
			Integer item = e.nextElement();
			System.out.println("Element(enum):" + item);
		}
		
		
		// 버퍼 비우기
		v2.clear();
		System.out.println(v2);
		System.out.printf("Size: %d, Cap: %d%n", v2.size(), v2.capacity());//한번 늘어난 버퍼는 줄어들지 않는다
		
		// Number를 확장한 모든 클래스를 담을 수 있는 벡터
		// ->generic의 활용
		Vector<? super Number> numVector = new Vector<>();
		numVector.addElement(Integer.valueOf(2019)); //integer는 number
		numVector.addElement(Float.valueOf(3.14159F)); //float는 number
//		numVector.addElement("Java"); //String은 number 상속받지 않았으므로 추가 안됨
		
	
		}
		
	}

	
	






