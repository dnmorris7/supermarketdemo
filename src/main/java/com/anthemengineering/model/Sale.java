package com.anthemengineering.model;



public abstract class Sale {
	String dealDescription= "sale price: ";
	public String getDescription(){
		return dealDescription;
	}
	public abstract double cost();


}
