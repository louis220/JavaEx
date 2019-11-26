package practice1;

import java.util.Arrays;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	
		int array[] = new int [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.nextInt();			
			
		}
		int num2 = array[num-1];
		 for (int i = array.length; i >= 1 ; i--) {    
	            for(int t = i; t > i; t--) { 
	                if (num2 < array[t - 1]) {
	                    array[t] = array[t-1];
	                    System.out.println(Arrays.toString(array));
	                }else if(num2 > array[t - 1]){	
                    array[t] = num2;
                    
                    System.out.println(Arrays.toString(array));
                  
	            }         
		}	

	}	 
	}

}
