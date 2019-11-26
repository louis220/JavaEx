package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Bigsort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	
		String array[] = new String [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.next();
				
		}
		
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	
	}
}

//		Scanner scanner = new Scanner(System.in);
//		
//		int num = scanner.nextInt();
//		Long[] array = new Long [num];
//		for(int i = 0; i <array.length; i++) {
//				array[i] = scanner.nextLong();	
//		}
//		
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//
//	}
//}
		
		
		
		