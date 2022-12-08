package com.basicsstrong.innerclass;

public interface InnerInterfaceDemo {
	void display();
	
	/*
	 * inner interface is always public and static and can be implemented
	 * independently. So if i try to make it private, i will get error
	 * as this can only be public and static. private interface Inner {
	 */
	interface Inner {
		void info();
	}
	
	class InnerClass implements InnerInterfaceDemo {

		/*
		 * So now we will provide the implementation to this display method and that will
		 * be considered as the default implementation.
		 */
		@Override
		public void display() {
			System.out.println("This is the default implementation");
		}
		
	}
}
