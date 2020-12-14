package com.javaex.ex02;

import com.javaex.ex01.DigitThread;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread= new DigitThread();
		Thread thread1= new LowerThread();
		Thread thread2= new UpperThread();
		
		thread.start();
		thread1.start();
		thread2.start();
		
		for(int w =0; w<15; w++) {
			System.out.print(w);
			Thread.sleep(1000);
		}

	}

}
