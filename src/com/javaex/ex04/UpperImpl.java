package com.javaex.ex04;

public class UpperImpl implements Runnable {

	@Override
	public void run() {
		for (char Alp = 'A'; Alp <= 'J'; Alp++) {
			try {
				System.out.print(Alp);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}
