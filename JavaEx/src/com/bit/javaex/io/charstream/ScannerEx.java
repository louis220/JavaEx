package com.bit.javaex.io.charstream;

import java.io.File;
import java.util.Scanner;

public class ScannerEx {
	//Scanner는 다양한 입력 소스로부터 다양한 값을 입력받는
	//범용 클래스(키보드 전용 아님)
	// -> 데이터 입력시 scanner로 구현 가능하다면
	//		scanner 사용할 것을 권장
	
	static String dirName = "D:\\javastudy\\files";
	static String filename = dirName + "\\thieves.txt";
	
	public static void main(String[] args) {
		// Scanner에 넘겨 주기 위한 File의 정보
		File file =  new File(filename);

			try {
				Scanner scanner = new Scanner(file);
				String name;
				float height;
				float weight;
				
				while(scanner.hasNextLine()) {
					name = scanner.next();
					height = scanner.nextFloat();
					weight = scanner.nextFloat();
					
					System.out.printf("%s, 키 : %f, 체중: %f%n", name, height, weight);	
					scanner.nextLine();
					
				}
			scanner.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
	}

}
