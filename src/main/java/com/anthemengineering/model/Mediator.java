package com.anthemengineering.model;

public interface Mediator {
	public boolean getSaleBuyGet(String id); //set the string of the id, and the number before adding one free
	public boolean saleOfferBundle(String id, String id2);
	public void addSale(String id, int quantity); //shopping cart is the collegue
	public void addSale(String id, String id2);
	//boolean saleOfferBuyGet(String id); 
}
