package com.basicsstrong.fundamentals.oopsaccess;

import com.basicsstrong.fundamentals.oops.Fan;

public class Main extends Fan {

	public static void main(String[] args) {
		Fan f = new Fan();
//		f.turnOn();
		
		Main m = new Main();
		m.turnOn();
		
		/*
		 * Classes with no modifier said to be default classes. The scope for the
		 * default classes and default Class members is within their Package.
		 * 
		 * AirConditioner name = new AirConditioner();
		 */

	}

}
