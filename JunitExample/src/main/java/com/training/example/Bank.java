package com.training.example;

public class Bank {
double balance;

public Bank(double balance) {
	super();
	this.balance = balance;
}
public double withdraw(double amount) throws ExceedingException{
	if(amount>4000 || amount==4000){
		throw new ExceedingException("amount beyond limit");
	}
	if(amount<=0) {
		throw new NegvalueException("amount is insufficient");
	}
	balance= balance-amount;
	return balance;
}
public double deposit(double amount) throws ExceedingException {
	if(amount>50000){
		throw new ExceedingException("amount beyond limit");
	}
	if(amount<=0) {
		throw new NegvalueException("enter correct amount");
	
	}
	balance =  balance+amount;
	return balance;
}






}
