package com.anthemengineering.model;
public class SaleChips extends SaleDealer {
Sale price;
	
	public SaleChips(Sale price){
		this.price = price;
	}
	
	public String getDescription(){
		return price.getDescription() + "Chips and Salsa Special Price: ";
		
	}
	
	public double cost(){
		return 4.99;
	}
}



