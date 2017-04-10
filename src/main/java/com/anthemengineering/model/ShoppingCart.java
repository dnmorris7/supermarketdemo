package com.anthemengineering.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.function.Predicate;

public class ShoppingCart extends Observable {
public Item item;
public List<Item> itemList;

public ShoppingCart() {

	this.itemList = new ArrayList<Item>();
}

	public void add(String id) {
		item = new Item(id);
		itemList.add(item);
		double totalPrice = item.getPrice();//need to replace this with an update call to the price object
	}
	
	public void priceChanged(){
		setChanged();
		notifyObservers();
		
	}
	
	public double retailPrice(){
	return this.itemList.stream().mapToDouble(i -> i.getPrice()).sum();
	}
	
	public void printData(){
		this.itemList.forEach(item -> System.out.println(item.print()));
		//toString(i -> i.print());
	}
	
	public void printName(){
		this.itemList.forEach(item -> System.out.println(item.getName()));
		//toString(i -> i.print());
	}

//to-do: set up real-time price totaling via observer
	
	public static void main(String[] args) {
		Item test = new Item("0001");
		Item test2 = new Item("0002");
		
		ShoppingCart cart = new ShoppingCart();
		cart.add("0001");
		cart.add("0002");
		double retailPrice = cart.itemList.stream().mapToDouble(i -> i.getPrice()).sum();
		//String cartString = cart.itemList.stream().filter(pred).forEach(i -> i.getName());
		 //cart.itemList.forEach(i -> System.out.println(i.getName()));
		cart.printData();
		System.out.println("Cart total: " +cart.retailPrice());
		//System.out.println(cartString);
	}
}
