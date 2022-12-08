package com.basicsstrong.fundamentals.constructorcoding;

public class ConstructorCoding {

	private int number;
	
	/*
	 * ConstructorCoding() {
	 * System.out.println("Object of ConstructorCoding created"); }
	 */
	
	ConstructorCoding(int number) {
		System.out.println("Object of ConstructorCoding created");
		this.number = number;
		System.out.println("this.number is"+this.number);
	}
	
	public static ConstructorCoding getObject() {
		return new ConstructorCoding(11);
	}
	
	// when ever we create objects, the instance block also gets executed
	{
		System.out.println("this is instance block");
	}
	
	// All the static variables get initialized at the time of class loading, right?
	// Same is true for static block also gets initialized at the time of class loading.
	// Even all the static members get initialized at the time of class loading.
	static {
		System.out.println("this is static block");
	}
	
}
