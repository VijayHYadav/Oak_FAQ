package com.basicsstrong.fundamentals.interfacecoding;

public interface MyInterface {
	public void m1();
	public void m2();
	
	// 1.8 java
	static void m3() {
		System.out.println("this is static method");
	}
	
	// 1.8 java
	default void m4() {
		System.out.println("this is default method");
		m5();
	}
	
	// 1.9 java
	private void m5() {
		System.out.println("this is private method");
	}
}
