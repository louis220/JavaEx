package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	
		int array[] = new int [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.nextInt();	

		}
		int num2 = array[0];
		int num3 = array[num-1];
		
		 for (int i = 1; i <= array.length ; i++) {    
	            for(int t = 0; t <= i; t++) { 
	                if (num2 > array[t+1]) {
	                	array[t] = array[t+1];
	                    array[t+1] = num2;
	                   
	                    System.out.println(Arrays.toString(array));
//	                }else if(num2 < array[t+1]){	
//                   
//                   System.out.println(Arrays.toString(array));
                                
//	                }else if(num3 < array[num3-1]) {
//	                	for (int j = array.length-2; j >= 0; j-- ) {
//	                		if( num3 > array[j]) {
//	                			array[j+1] = num3;
//	               System.out.println(Arrays.toString(array));
//	                	}
//	                
//	                }
}
}
	}
}
}