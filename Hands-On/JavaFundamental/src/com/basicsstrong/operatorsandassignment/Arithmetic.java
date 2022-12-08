package com.basicsstrong.operatorsandassignment;

public class Arithmetic {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		String s = "Basics";
		String t = "Strong";
		
		System.out.println(a+b);
		
		System.out.println(a-b);
		
		System.out.println(a*b);
		
		System.out.println(a/b);
		
		System.out.println(a%b);
		
		// gotcha
		short srt = 5;
		short srt2 = 5;
		
		// srt = srt + srt2; // Type mismatch: cannot convert from int to short
		
		srt += srt2; // implicitly cast the result of addition into the type of variable used to hold the result.
		
		srt = (short) (srt + srt2); // explicit cast
	}
}
