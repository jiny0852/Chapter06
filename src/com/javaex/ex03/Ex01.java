package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) {
		
		//Runnable dr = new DigitRunnableImpl(); //실행 코드가 있다
		
		Thread thread = new Thread(new DigitRunnableImpl());
		
		thread.start(); //출장 기능 있음, 해야할 일이 있다
		
		//문자 출력
		for (char ch = 'A'; ch <= 'Z' ; ch++ ) {
			System.out.println(ch);
			
			
		}
		

	}

}
