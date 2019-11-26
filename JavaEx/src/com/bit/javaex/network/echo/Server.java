package com.bit.javaex.network.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// 절차
		// 1. 서버 소켓 생성
		ServerSocket serverSocket = null; // 연결용, 데이터용이 아님
		
		try {
			serverSocket = new ServerSocket();
			
		// 2.  바인드 작업 : IP, Port를 서버 소켓에 연결
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local);
			
			System.out.println("<서버 시작>");
			System.out.println("[연결 대기중입니다.]");
		// 3. 연결 대기
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			//socket은 통신용
			
		// 4. 클라이언트가 접속시 처리
		// 접속한 클라이언트의 IP와 Port 정보를 출력
/*			InetSocketAddress client = 
					(InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결 되었습니다.]");
			System.out.printf("%s: %d%n",
					client.getAddress(), client.getPort());
		// 메시지 읽어오기
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			
			// echo back을 위한 아웃풋스트림
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String msg;
			while (true) {
				msg = br.readLine();
				if(msg == null) {
					System.out.println("[접속이 종료되었습니다.]");
					break;
				}
				System.out.println("Message:" + msg);
				//echo back -> 응답 돌려주기
				System.out.println("Echo Back:" + msg);
				bw.write("[Echo]:" + msg);
				bw.newLine();
				bw.flush();
			}
			
		// 5. 후처리
			System.out.println("<서버 종료>");
			bw.close();
			br.close();
*/
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 서버 소켓 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
