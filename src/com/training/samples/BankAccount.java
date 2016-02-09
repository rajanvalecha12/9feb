package com.training.samples;

public class BankAccount {
private long accountNumber ;
private String accountHolderName;
private double balance;

public BankAccount(long accountNumber, String accountHolderName, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
}

public double withdraw(double amountWithdrawn){
	double remainingBalance=0.0;
	if((balance - amountWithdrawn)>0){
		remainingBalance=balance-amountWithdrawn;
	return remainingBalance;
	}
else
	throw new IllegalArgumentException("jkdfhgjkhjkgtrjkhgjkerhg");
}
}