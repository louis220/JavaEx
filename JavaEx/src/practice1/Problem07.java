package practice1;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("      [숫자맞추기게임 시작]     ");
		System.out.println("============================");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i = (int)(Math.random()*100)+1;
		
		while (!(i == num)) {
		if(num > i) {
			System.out.println("더 낮게");
		}else if (num < i) {
			System.out.println("더 높게");
		} else System.out.println("맞았습니다.");
		scanner.nextInt();
		
		}
		
	}

}
