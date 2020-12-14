package com.javaex.ex03;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 방법1 DigitRunnableImpl digit = new DigitRunnableImpl(); Thread thread = new
		 * Thread(digit);
		 */

		// 방법2
		Thread thread = new Thread(new DigitRunnableImpl());
		thread.start();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1000);
		}

	}

}
