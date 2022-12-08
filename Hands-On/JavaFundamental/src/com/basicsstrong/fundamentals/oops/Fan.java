package com.basicsstrong.fundamentals.oops;

public class Fan {
	
	private boolean isOn;
	protected String brand;
	public int noOfBlade;
	
	static int i = 10; 
	
	protected void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public void status() {
		if (isOn) {
			System.out.println("Fan is ON");
		} else {
			System.out.println("Fan is OFF");
		}
	}
}

class AirConditioner {
	
}