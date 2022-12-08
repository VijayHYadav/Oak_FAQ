package com.basicsstrong.fundamentals;

public class ImplicitApp {

	public static void main(String[] args) {

		final int a = 10;
		byte b = 2;
		char c = 'A';
		double d = 2.4;
		
		int conv = c;
		System.out.println(conv);
		
		System.out.println(a+b+c+d);
		
		// casting
		short srt = 5;
		short srt2 = 5;
		
		// srt = srt + srt2; // Type mismatch: cannot convert from int to short
		
		srt += srt2; // implicitly cast the result of addition into the type of variable used to hold the result.
		
		srt = (short) (srt + srt2); // explicit cast

	}

}
