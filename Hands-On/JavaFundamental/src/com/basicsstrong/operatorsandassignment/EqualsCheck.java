package com.basicsstrong.operatorsandassignment;

public class EqualsCheck {
	public static void main(String[] args) {
		String s = "Sone";
		String s2 = "Sone";
		String s3 = new String("Sone");
		
		System.out.println(s == s2);
		System.out.println(s.equals(s2)); // compares content
		System.out.println();
		System.out.println(s == s3); // compares the reference
		System.out.println(s.equals(s3)); // compares content
	}
}
