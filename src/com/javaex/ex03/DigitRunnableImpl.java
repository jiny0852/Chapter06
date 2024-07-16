package com.javaex.ex03;

public class DigitRunnableImpl implements Runnable { //  extends Thread {

	
	
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
