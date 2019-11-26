package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		int n = (int)(Math.random()*10+3);
		int m = (int)(Math.random()*21+10);
		System.out.print(n+" ");
		System.out.println(m);
		
		
			int arr[] = new int[n];
			for(int a=0; a<n; a++) {
				arr[a]= (int)(Math.random()*10+1);
			}
			System.out.println(Arrays.toString(arr));
			
			
		
		
		
	
			
	}

}
