package com.bit.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	// fileinputstraeam. fileoutputstream
	static String dirName = "D:\\javastudy\\files";
	static String source = dirName + "\\img.jpg";
	static String target = dirName + "\\img_copy.jpg";
	
	public static void main(String[] args) {
		//source 파일을 FileInputStream으로 열어서
		//target 파일로 복사(Fileoutputstream)
		try {
			// 스트림 열기
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
			
			int data = 0;  //데이터 저장용
			// inputstream으로부터 데이터를 불러와서
			// 아웃풋스트림으로 저장
			while((data = is.read()) != -1) {
				System.out.print("*");
				os.write(data);
				// 한 바이트 단위로 복사를 시도하기 때문에 호율상 문제
				// TODO : 버퍼방식으로 변경 해 볼 예정
			}
			// 스트림 닫기
			os.close();
			is.close();
			System.out.println("파일을 복사했어요!");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
