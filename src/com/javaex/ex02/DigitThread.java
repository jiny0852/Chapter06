package com.javaex.ex02;

public class DigitThread extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 30 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
}
