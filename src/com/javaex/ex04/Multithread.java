package com.javaex.ex04;

public class Multithread {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new DigitImpl());
		Thread thread2 = new Thread(new LowerImle());
		Thread thread3 = new Thread(new UpperImpl());

		thread1.start();
		thread2.start();
		thread3.start();

		for (int x = 10; x < 20; x++) {
			try {
				System.out.print(x);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}

	}

}
