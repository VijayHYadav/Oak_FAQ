package com.basicsstrong.fundamentals.oops.abstraction;

import java.util.ArrayList;

abstract class Mobilee {
	abstract void calling(String number);
	abstract void sendMsg(String msgBody);
}

class Samsung extends Mobilee {
	private ArrayList<String> contacts = new ArrayList<String>();

	@Override
	void calling(String number) {
		System.out.println("Calling from samsung .... "+number);
	}

	@Override
	void sendMsg(String msgBody) {
		System.out.println("Sending message to ...." + msgBody);
	}
	
	public ArrayList<String> addContacts(String number) {
		contacts.add(number);
		return contacts;
	}
}

public class AbstractionWithClassDemo {

	public static void main(String[] args) {
		Samsung a = new Samsung();
		
		a.addContacts("99671339012");
		a.addContacts("79671339013");
		a.addContacts("69671339014");
		
		System.out.println(a.addContacts("89671339015"));
		
		a.calling("89671339012");
		a.sendMsg("Hey there!!!");

	}

}
