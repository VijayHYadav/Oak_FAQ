package com.basicsstrong.operatorsandassignment;

public class PrePostIncr {
	public static void main(String[] args) {
		short a = 5;
		int b = a++; // Post
		System.out.println(a);
		System.out.println(b);
		
		short c = 5;
		int d = ++c; // Pre
		System.out.println(c);
		System.out.println(d);
		
	}
}
