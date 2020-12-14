package com.javaex.ex04;

public class LowerImle implements Runnable {

	@Override
	public void run() {
		for (char alp = 'a'; alp <= 'j'; alp++) {
			try {
				System.out.print(alp);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}
