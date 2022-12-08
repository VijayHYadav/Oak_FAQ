package com.basicsstrong.fundamentals;

public class PassByValueApp {

	public static void main(String[] args) {
		int a = 10;
		method(a);
		System.out.println(a);
	}

	// This is pass by value
	static public void method(int a) {
		a = 1;
		System.out.println(a);
	}
	
}
