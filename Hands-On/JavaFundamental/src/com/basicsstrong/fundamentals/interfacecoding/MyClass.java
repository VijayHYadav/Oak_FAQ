package com.basicsstrong.fundamentals.interfacecoding;

public class MyClass implements MyInterface {
	
	// Can we overload and override static methods? YES
	public static void static1() {
		System.out.println("static1");
	}
	
	public static void static1(int n) {
		System.out.println("static1");
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
