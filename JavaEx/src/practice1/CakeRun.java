package practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CakeRun {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int output = 0;
		int array[] = new int [num];
		for(int i = 0; i <array.length; i++) {
				array[i] = scanner.nextInt();
		}

		for(int i = 0; i < array.length; i++)
	    {
	      for(int j = i; j < array.length; j++)     
	      {                                       
	        if(array[i] < array[j])                  
	        {                                      
	          int temp = array[i];
	          array[i] = array[j];
	          array[j] = temp;
	        }
	      }
	    }
	
		for(int k= 0; k <num; k++) {
			output += (Math.pow(2, k)*array[k]);
		}
		

		System.out.println(output);
	}
	
}

//List<int[]> list = Arrays.asList(array);
//Collections.reverse(list);
// TODO list를 다시 array로


//for(Object obj : list) {
//String str = (String)obj;
//int to =Integer.parseInt(str);

//for(int k =0; k<num; k++) {
//output +=(Math.pow(2, k)* array[k]);
