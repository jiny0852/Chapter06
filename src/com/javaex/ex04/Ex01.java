package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
		Runnable rAble01 = new DigitRunnableImpl();
		Runnable rAble02 = new LowerRunnableImpl();
		Runnable rAble03 = new UpperRunnableImpl();
		
		Thread t01 = new Thread(rAble01);
		t01.start();
		
		Thread t02 = new Thread(rAble02);
		t02.start();
		
		Thread t03 = new Thread(rAble03);
		t03.start();
		

	}

}
