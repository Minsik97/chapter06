package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		
		//준비
		Thread thread= new DigitThread(); //섞어 쓰기

		//스레드 실행 --> 출장
		//thread.run(); 아님
		thread.start();
		
		
			
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
            Thread.sleep(1000);
        }
		
		
		
		
		

	}

}
