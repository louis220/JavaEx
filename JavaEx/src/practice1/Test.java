package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int a[]= new int[m];
	        for(int i=0;i<m;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        Arrays.sort(a);
	        int n = sc.nextInt();
	        int b[]= new int[n];
	        for(int i=0;i<n;i++)
	        {
	            b[i]=sc.nextInt();
	        }
	        Arrays.sort(b);
	        int j=0;
	        for(int i=0;i<n;i++)
	        {
	            if(b[i]==a[j])
	            {
	                j++;
	                if(j==m && i!=(n-1))
	                {
	                  
	                    System.out.println(b[i] + " ");
	                    break;
	                }
	                    
	                
	                    
	            }
	            else 
	            {
	                System.out.print(b[i] + " ");
	                while(b[i]==b[i+1])  
	                    i++;
	            }
	          
	                        
	        }
	        
	    }
	}