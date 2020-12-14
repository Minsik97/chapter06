package com.javaex.ex03;

public class DigitRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			try {
				System.out.print(cnt);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
