package com.basicsstrong.innerclass;

public class InnerInterfaceMainDemo implements InnerInterfaceDemo.Inner {

	@Override
	public void info() {
		System.out.println("here is Inner impl");
	}

}

class Demo2 implements InnerInterfaceDemo {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}