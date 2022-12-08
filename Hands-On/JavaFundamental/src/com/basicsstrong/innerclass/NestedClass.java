package com.basicsstrong.innerclass;

class Pasta {
	
	public void prepare() {
		System.out.println("Red sauce pasta is ready!");
	}
}

public class NestedClass {
	
	static int x = 10;
	int y = 20;
	
	class InnerClass {
		public void display() {
			System.out.println("InnerClass."+x+y);
		}
		
		// The method method1() cannot be declared static; 
		// static methods can only be declared in a static or top level type
//		public static void method1() {
//			
//		}
	}
	
	static class StaticNested {
		public void print() {
			// we can't access instance var in static nested class.
			// System.out.println("StaticNested."+x+y);  
			System.out.println("StaticNested."+x);
		}
		
		public static void method1() {
            
		}           
		
		public static void main(String[] args) {
			
		}
	}
	
	public void method1() {
		String s = "Local member";
		class Printer {
			public void printInfo() {
				// Local variable s defined in an enclosing scope must be final or effectively final
				// s = ""; 
				System.out.println("printing your documents with ctr+p"+s);
			}
		}
		
		Printer p = new Printer();
		p.printInfo();
	}
}
