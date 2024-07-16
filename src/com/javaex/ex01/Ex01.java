package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//숫자 출력
		Thread dThread = new DigitThread();
		//dThread.run();
		dThread.start();
		/*//출장 가서 실행
		for (int i = 0; i < 30 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//문자 출력
		for (char ch = 'A' ; ch <= 'Z' ; ch++ ) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
