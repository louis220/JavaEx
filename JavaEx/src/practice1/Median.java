package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	
		String array[] = new String [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.next();
				
				

	}
		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		int num2 = (array.length/2 +1);
		System.out.println(array.length/2);
		
		
		
	
}
}