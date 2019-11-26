package practice1;

import java.util.Scanner;

public class Cake {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
//		int min = scanner.nextInt();
		int output = 0;
		int array[] = new int [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.nextInt();
		}
			
			
			
		
		for(int i= 0; i <num; i++) {
			output += (Math.pow(2, array[i]));
				
		}
		System.out.println(output);
	}

}
