package com.bit.javaex.io;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName = "D:\\javastudy\\files";
	// File Class 예제
	public static void main(String[] args) {
		//file 객체
		// new file 해도 실제 생성되는것은 아니다
		// 해당 파일 정보를 확인하는 클래스
		File root = new File(dirName);
		// 파일이 실제 존재하는지 확인
		System.out.println(dirName + ":" + root.exists());
		// 파일 혹은 디렉터리를 만들고자 할떄,
		// 해당 파일이 존재하는지 먼저 확인한 후 생성
		if (!root.exists()) {
			//디렉터리 만들기
			root.mkdir(); //하위 디렉터리 일괄 생성
		}
		// 디렉터리 안에 새 파일을 만들어 넣어 봅시다.
		File file = new File(dirName + "\\myfile.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 지정된 디렉터리 내부의 정보를 출력하는 메서드
		printInfo(root);
		
		//파일 지우기
		if(file.exists()) {
			file.delete();
		}
		printInfo(root);

		
	}
	static void printInfo(File f) {
		// 파일 정보를 넘겨 받아서
		// 만약 디릭터리면 내부의 내부의 파일 목록을 출력
		// 만약 디렉터리가 아니면 파일의 속성들을 출력
		System.out.println("File list");
		// 넘겨받은 파일이 디렉터리인지 확인
		if (f.isDirectory()) {
			// 디렉터리니까 내부의 파일을 담고 있을 것이다
			File[] files = f.listFiles(); //파일의 목록
			System.out.println("Directory:" + f.getName());
			// 파일 목록 출력
			for (File file:files) {
				System.out.print(file.isDirectory() ? "d" : "f");
				System.out.println(file.getName() + " " + file.length());
			}
		} else { //디렉터리가 아니다
			System.out.println("File:" + f.getName());
			
			
		}
		
	}
	
	
	
	
	
	
	
	

	
	
	
}
