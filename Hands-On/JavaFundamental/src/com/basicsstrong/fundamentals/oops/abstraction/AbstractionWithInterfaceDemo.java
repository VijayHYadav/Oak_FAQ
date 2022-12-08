package com.basicsstrong.fundamentals.oops.abstraction;

import java.util.ArrayList;

interface Mobile {
	public void calling(String number);
	public void sendMessage(String msgBody);
}

class Apple implements Mobile {

	private ArrayList<String> contacts = new ArrayList<String>();
	
	public ArrayList<String> addContacts(String number) {
		contacts.add(number);
		return contacts;
	}
	
	@Override
	public void calling(String number) {
		System.out.println("Calling.... "+number);
	}

	@Override
	public void sendMessage(String msgBody) {
		System.out.println("Sending message to ...." + msgBody);
	}
	
}

public class AbstractionWithInterfaceDemo {

	public static void main(String[] args) {
		Apple a = new Apple();
		
		a.addContacts("89671339012");
		a.addContacts("89671339013");
		a.addContacts("89671339014");
		
		System.out.println(a.addContacts("89671339015"));
		
		a.calling("89671339012");
		a.sendMessage("Hey there!!!");
	}

}
