package com.basicsstrong.fundamentals.oops;

public class Main {

	public static void main(String[] args) {
		Fan myFan = new Fan();
		
		myFan.i = 11;
		
		myFan.status();
		myFan.turnOn();
		myFan.status();
		
		/*
		 * Classes with no modifier said to be default classes. The scope for the
		 * default classes and default Class members is within their Package.
		 * 
		 */
		AirConditioner name = new AirConditioner();
	}

}
