package practice1;

import java.util.Scanner;

public class MakingCircle {

	public static void main(String[] args) {
		
		 {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] arr = new int[n];
	        int max = 0;
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            int candle = scan.nextInt();
	            if (candle > max) {
	                max = candle;
	                count = 1;
	            } else if (candle == max) {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
        }
	}
// 입력한 값이 0보다 크면 입력한값을 맥스에 준다 그리고 카운트1 돌아가서 또 입력
// 입력한 값이 0보다 크면...
