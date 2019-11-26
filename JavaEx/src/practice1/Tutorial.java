package practice1;

import java.util.Scanner;

public class Tutorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num = scanner.nextInt();
		int count = 0;
		
		int array[] = new int [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.nextInt();
			if(array[i] == num1) {
				count++;
			}
				
				
		}
		
		System.out.println(count);
		

	}

}
