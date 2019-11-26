package com.bit.javaex.basic.reftype;

public class ArrayEx {
	public static void defineArray() {
		// 배열의 선언
		String[] names; // String names[] 와같다
		int scores[]; //int scores[]와 같다
		
		
//		System.out.println(names);
		//초기화
		names = new String[] {
				"홍길동", "전우치", "장길산"
		}; //데이터가 이미 있는 경우 개수는 표기 안해도 됨
		
		//선언시 이미 데이터를 알고 있을 때
		int height[] = {
				175, 180, 176
		}; // 이 방식은 선언과 동시에 할 경우에만 효력을 발휘
		
		scores = new int[4]; //4개의 공간을 가진 빈 배열
		// 내부 공간에 접근 -> 인덱스 사용
		// 인덱스는 0부터 시작 ~ 배열의 길이 -1 까지 *****
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 80;
//		scores[4] = 100;  // 배열 범위를 벗어남 위에서 4까지로 공간을 만들었으므로 0123 까지만 됨
		
		// scores 배열의 점수를 합산해서 총점과 평균을 출력합시다.
		int total = 0;
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
		System.out.printf("총점 %d, 평균%.2f%n", total, 
				(float)total/ scores.length);
		
		
	}
	
	public static void multiDim() {
		//2차원 배열
		int[][] twoDim = new int[5][10]; // 5행 10열 빈 배열
				
		int table [][] = {
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5, 1},
				{3, 4, 5, 1, 2},
				{4, 5, 1, 2, 3}
		};
		
		System.out.println("table의 행 수:" + table.length);
		System.out.println("table의 0번 인덱스: " + table[0]); //행의 정보 인쇄
		System.out.println("table의 열 수:" + table[1].length);
		
		//table 배열 안에 있는 모든 정수를 합산해 봅시다
		int total = 0;
		//루프
		for(int row = 0; row < table.length; row++) { //행 루프
			for (int col = 0; col <table[row].length; col++) { //열루프
				
				int value = table[row][col];
				//출력
				System.out.print(value + "\t");
				total += value;
			}
			System.out.println();
		}
		
		System.out.println("table의 총 합:" + total);
	}
	
	
	public static void arrayColy() {
		// 배열은 생성되면 크기를 변경할 수 없다
		// solution : 더 큰 크기의 새 배열을 만들고 항목값을 복사
		int source[]= {1, 2, 3};
		int target[] = new int[10]; //10개짜리 빈 배열
				
		// 복사를 위해 loop
		for (int i = 0; i <source.length; i++) {
			target[i] = source[i];
			
		}
		
		for (int i = 0; i <source.length; i++) {
		System.out.print(target[i] + "\t");
	}
	
	System.out.println();
	
	//enhanced For
	// 증감 변수 필요 없이 순차 자료형(배열포함)의 각 요소를 
	// 첫번째 요소부터 끝까지 한 개씩 돌려준다
	
	for(int val:target) {//target 부터 자료를 하나씩 빼서 앞으로 줌 // :의 앞은 타입을 잘 맞춰야 함
		System.out.print(val +"\t");
	}
	System.out.println();
}
	
	
	
	public static void arrayCopySystem() {
		int source[] = {1, 2, 3};
		int []target = new int[10];
		
		System.arraycopy(source, //원본 배열
				0, //원본 배열의 시작 인덱스
				target, // 대상 배열(target)
				5, //타겟 배열의 인덱스
				source.length); // 복사할 길이
		
		for (int val: target) {
			System.out.print(val + "\t");
		
		}
				
		System.out.println();
	}
	
	
	public static void main(String[] args) {
	
//		defineArray();
		multiDim();
//		arrayColy();
//		arrayCopySystem();
			}

}
