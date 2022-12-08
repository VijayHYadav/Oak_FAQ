package com.basicsstrong.fundamentals.interfacecoding;

public interface X {
	default void display() {
		System.out.println("X display");
	}
}
