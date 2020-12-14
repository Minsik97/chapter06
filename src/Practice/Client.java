package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
			System.out.println("클라이언트 시작");
			System.out.println("=============================");
			System.out.println("서버에 연결을 요청합니다.");
			
			socket.connect(new InetSocketAddress("192.168.0.26", 10001));
		
		
		System.out.println("서버에 연결되었습니다.");
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner sc = new Scanner(System.in);
		
		InputStream is = socket.getInputStream();
		InputStreamReader osr = new InputStreamReader(is,"UTR-8");
		BufferedReader br = new BufferedReader(osr);
		
		while(true) {
			String str = sc.nextLine();
		}
		
		
		

	}

}
