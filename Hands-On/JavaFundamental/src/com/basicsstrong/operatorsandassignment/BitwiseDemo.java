package com.basicsstrong.operatorsandassignment;

public class BitwiseDemo {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 20;
		
		System.out.println(a&b); // 0
		System.out.println(a|b); // 15
		System.out.println(a^b); // 15
		System.out.println(~b); // -11
		System.out.println((a<b)&(a>c)); // false
		System.out.println((a<b)|(a>c)); // true
	}
}
