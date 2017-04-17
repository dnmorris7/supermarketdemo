package com.anthemengineering.model;

public class SaleRetail extends Sale{
	Sale price;
	Item item;
	public SaleRetail(Item item){
		dealDescription="Retail";
		this.item = item;
	}

	
	public double cost(){
		return item.getPrice();
	}



}
