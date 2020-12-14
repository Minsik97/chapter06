package com.javaex.ex04;

public class DigitImpl implements Runnable {

	@Override
	public void run() {
		for (int ch = 0; ch <= 9; ch++) {
			try {
				System.out.print(ch);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}
