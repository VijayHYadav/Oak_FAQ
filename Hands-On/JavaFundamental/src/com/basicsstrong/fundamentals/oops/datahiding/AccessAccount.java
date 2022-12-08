package com.basicsstrong.fundamentals.oops.datahiding;

class BankAccount {
	// we can achieve data-hiding by private modifier.
	private double balance = 10000;
	private String username = "basicsstrong";
	private String password = "password";
	
	public double getWallentBalance(String username, String password) {
		if(this.username.equals(username) && this.password.equals(password)) {
			return balance;
		}
		else {
			return 0.0;	
		}
	}
}

public class AccessAccount {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.getWallentBalance("basicsstrong", "password"));
	}

}
