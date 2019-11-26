package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class partition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int array[] = new int [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.nextInt();	
			
		}
		
		int num2 = 0;
		 for (int i = 0; i <array.length ; i++) {    
			 if (  array[num2] > array[i] )
	           {
	              int j = i;
	              while ( j > num2 )
	              {
	                  int tmp = array[j];
	                  array[j] = array[j-1];
	                  array[j-1] = tmp;
	                  j--;
	              }
	              num2++;
	              
	           }
	        }
	         System.out.println(Arrays.toString(array));
	            }
	               
		}	
	           
	
