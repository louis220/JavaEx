package com.bit.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {
	// Array를 파이트프트림으로 다루는 바이트어레이스트림 예제
	public static void main(String[] args) {
		// stream : 데이터 입력 혹은 출력을 위한 흐름
		// stream은 일방향이다
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 인풋 소스 확인
		System.out.println("Source:" + Arrays.toString(inSrc));
		byte[] target = null; // 타겟 배열 

		try {
		//인풋 스트림을 열어봅시다
		InputStream bis = new ByteArrayInputStream(inSrc);
		// Inputstream은 바이트 스트림을 입력받기 위한 최상위
		// 추상 클래스(객체 생성 안됨)
		// 실제 인풋은 인풋스트림을 상속받은 실제 객체가 수행한다
		// 아웃풋 스트림 열기
		OutputStream bos = new ByteArrayOutputStream();
		
		// 인풋 스트림으로부터 데이터 읽기
		int data = 0; // 임시 저장용 변수
		while((data = bis.read()) !=-1) {
			//-1이면 더이상 읽을 데이터가 없다
			System.out.println("Read Data:" + data);
			//읽어들인 데이터를 아웃풋 스트림으로 전송
			bos.write(data);
		}
		//ByteArratOutputstream을 배열로 변환
		target = ((ByteArrayOutputStream)bos).toByteArray();
		
		bos.close();
		bis.close();
		
		System.out.println("Target:" + Arrays.toString(target));
		} catch (IOException e) {
			// io익셉션 처리
			System.out.println("복사 에러:" + e.getMessage());
		} catch (Exception e) {
			//위에서 처리되지않은 예외처리
		}
		}

}
