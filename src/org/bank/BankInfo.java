package org.bank;

public class BankInfo extends AxisBank{
	
	public void saving() {
		System.out.println("The Savings amount will get Interest");

	}
	
	public void fixed() {
		System.out.println("The Fixed rate increased");

	}

	public static void main(String[] args) {
		
		BankInfo b = new BankInfo();
		
		b.saving();
		b.fixed();
		b.deposit();
	}
}
