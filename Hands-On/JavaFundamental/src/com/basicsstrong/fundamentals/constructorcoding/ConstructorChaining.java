package com.basicsstrong.fundamentals.constructorcoding;

class SuperClass {
	public SuperClass() {
		System.out.println("this is super class constructor");
	}
}

public class ConstructorChaining extends SuperClass {

	private int id;
	
	public ConstructorChaining() {
		// this is how we call super's class/parent's constructor
		super();
		System.out.println("Zero param constructor");
	}
	
	public ConstructorChaining(int id) {
		// this is how we call constructor
		this();
		this.id = id;
	}
}
