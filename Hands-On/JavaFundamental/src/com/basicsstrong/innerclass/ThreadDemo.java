package com.basicsstrong.innerclass;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();

		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread Started");
			}
		};

		Thread t2 = new Thread(r);
		t2.start();
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Started");
	}

}