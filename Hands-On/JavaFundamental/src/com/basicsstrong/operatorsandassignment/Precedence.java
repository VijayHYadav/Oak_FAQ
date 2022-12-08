package com.basicsstrong.operatorsandassignment;

public class Precedence {

	public static void main(String[] args) {
		int a = 2, b = 15, c = 20, d =4;
		int result = a*b + c/d;
		int result2 = a*(b + c)/d;
		
		System.out.println(result);
		System.out.println(result2);
		
		a = b++ + c;
		System.out.println(a);
		System.out.println(b);
	}

}
