package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//13페이지 쓰레드 만들어보기
		Thread thread1 = new DigitThread();
		Thread thread2 = new LowerThread();
		Thread thread3 = new UpperThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		

	}
	

}
