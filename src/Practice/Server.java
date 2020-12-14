package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		
		ServerSocket server = new ServerSocket();
		
		server.bind(new InetSocketAddress("192.168.0.26", 10001));
		
		System.out.println("서버 시작");
		System.out.println("==============================");
		System.out.println("서버 연결을 기다리고 있습니다.");
		
		Socket socket= server.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}System.out.println(bw);
		}
		
		
		
		

	}

}
