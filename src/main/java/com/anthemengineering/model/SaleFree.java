package com.anthemengineering.model;

import java.text.DecimalFormat;

//SaleFree decorates the Sale object so that an item becomes free.
//will be called for those sales that apply a discount
public class SaleFree extends SaleDealer {
	Sale price;
	

	public SaleFree(Sale price) {
		this.price = price;
	}

	public String getDescription() {
		return price.getDescription() + " (Get One Free): ";

	}

	public double cost() {
		DecimalFormat df = new DecimalFormat("#.00"); //for making sure we only return to the newest 2 decimals.
		String format = df.format(price.cost()*0);
		return Double.parseDouble(format);
	}
}
