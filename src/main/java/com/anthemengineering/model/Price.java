package com.anthemengineering.model;

import java.util.Observable;
import java.util.Observer;

public class Price implements Observer{
double amount;
private Observable observablePrice;

public Price(Observable observable){
	this.observablePrice = observable;
	observablePrice.addObserver(this);
	
}
public double getAmount(){
	return amount;
}

public String toString(){
	return Double.toString(amount);
	
}
public void setAmount(double amount){
	this.amount=amount;
}

public void update(Observable arg0, Object arg1) {
	
	
	
	
}
}
