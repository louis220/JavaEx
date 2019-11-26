package com.bit.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String dirName = "D:\\javastudy\\files";
	static String filename = dirName + 
			"\\primitives.txt";
	// DataInputstream과 dataoutputstream
	// 기본 데이터 타입을 byte stream으로 다루기 위한
	// 보조 스트림 클래스 (변환 작업 대신 수행)
	public static void main(String[] args) {
		try {
			// 메인 스트림을 열어봅시다
			OutputStream fos = new FileOutputStream(filename);
			//보조 스트림 연결
			DataOutputStream dos = new DataOutputStream(fos);
			
			//기본 데이터 출력
			//String -> boolean -> int -> float
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("장길산");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);
			
			dos.close();
			// Inputstream 설정
			InputStream fis = new FileInputStream(filename);
			// 기본 타입으로 변환을 위한 보조 스트림 연결
			DataInputStream dis = new DataInputStream(fis);
			
			// 두번적었으니 루프 두번 돌려서 내용 읽어오기
			for (int i=0; i<2; i++) {
				//읽어올 때, 출력한 순서에 맞게 읽어와야 한다(주의)
				String s =  dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s : %b : %d : %f%n",
						s, b, val, f);
			}
			dis.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
