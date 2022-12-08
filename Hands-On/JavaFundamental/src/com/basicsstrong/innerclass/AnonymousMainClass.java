package com.basicsstrong.innerclass;

public class AnonymousMainClass {

	public static void main(String[] args) {
		
		/*
		 * So suppose the permanent requirement was red sause pasta. 
		 * But if someone orders with sauce pasta, then we can create 
		 * an anonymous class for the temporary requirements.
		 * 
		 * So anonymous inner class is the subclass of pasta class which
		 * has a parent reference. we can call it using this reference 
		 * pastaObj
		 */
		Pasta pastaObj = new Pasta() {
			public void prepare() {
				System.out.println("white sause pasta is ready!");
			}
		};
		
		pastaObj.prepare();
		System.out.println();
		System.out.println(pastaObj.getClass());
		System.out.println();
		System.out.println(pastaObj.getClass().getName());
	}

}
