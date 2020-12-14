package com.javaex.ex02;

public class LowerThread extends Thread{

	@Override
	public void run() {
		for(int a = 0; a<5; a++) {
			System.out.print(a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	
	
	
	
	
}
