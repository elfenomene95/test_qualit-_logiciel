package com.moneyBag;

public class Money {
	private double fAmout;
	private String fCurrency;
	
	public Money(double newAmount, String currency) {
			fAmout = newAmount;
			fCurrency = currency;
	}
	
	public String currency() {
		
		return fCurrency;
	}
	
	public double amount() {
		return fAmout;
	}
	
	public Money add(Money m) {
		if (fCurrency == m.currency())
			fAmout +=m.amount();
		return this;
	}
	
	public Money add(int namount, String ncurrency) {
		if (fCurrency == ncurrency)
			fAmout+=namount;
		return this;
	}
	
}
