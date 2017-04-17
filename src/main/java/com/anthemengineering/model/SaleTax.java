package com.anthemengineering.model;

import java.text.DecimalFormat;

public class SaleTax extends SaleDealer {
Sale price;
	
	public SaleTax(Sale price){
		this.price = price;
	}
	
	public String getDescription(){
		return price.getDescription() + "Plus Tax: ";
		
	}
	
	public double cost(){
		DecimalFormat df = new DecimalFormat("#.00"); //for making sure we only return to the newest 2 decimals.
		String format = df.format((price.cost()*0.0925 + price.cost()));
		return Double.parseDouble(format);
		}
}
