package practice1;

import java.util.Scanner;

public class problem06 {

	public static void main(String[] args) {
		
		
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int total1 = 0;
		int total2 = 0;
				
		for(int j =2; j <=num; j++) {
			
		total1 += j;
		}
		
		for(int i =1; i <=num; i++) {
			total2 += i;
		}
		
		
		if(num % 2 ==0) {
			System.out.println("결과값:"+ total1 );
		}else {
			System.out.println("결과값:"+  total2  );
		}
		
	
	}

}
