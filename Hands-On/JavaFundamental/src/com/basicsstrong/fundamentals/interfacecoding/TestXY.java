package com.basicsstrong.fundamentals.interfacecoding;

public class TestXY implements X, Y {
	@Override
	public void display() {
		// super is reference to parent
		X.super.display();
	}

	public static void main(String[] args) {
		
	}

}
