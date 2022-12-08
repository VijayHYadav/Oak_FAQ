package com.basicsstrong.fundamentals.oops;

public class BlankFinal {

//	blank final static variable can be only init in static block.
	final static String name;
//	blank final variable in instance block & constructor.
	final String name2;
	
//	public BlankFinal() {
//		this.name = "vijay";
//	}
	
	{
		this.name2 = "this is rock";
	}
	
	static {
		name = "tom";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
