package com.anthemengineering.model;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class ShoppingCart extends ArrayList{
	public Item item;
	public List<Item> itemList;
	public Map<String, Integer> itemCount;
	public SaleMediator sale;

	public ShoppingCart() {

		this.itemList = new ArrayList<Item>();
		itemCount = new HashMap<String, Integer>();
		sale = new SaleMediator();
	}

	public ShoppingCart(SaleMediator mediator) {

		this.itemList = new ArrayList<Item>();
		itemCount = new HashMap<String, Integer>();
		sale = mediator;

	}

	//adds an item to the list in a default manner
	public void add(String id) {
		item = new Item(id);
		this.itemList.add(item);
	}

	// add items with a specific discount mediator; this makes the addition of
	// discounts optional. Still, I need to figure out how to add in the bundle 
	// use case without violating encapsulation. WIP
	public void add(String id, SaleMediator mediator) {
		item = new Item(id, mediator);
		this.itemList.add(item);
	}

	// returns a particular number of items within the cart for that id
	public int itemCount(String id) {
		itemCount = itemCounts();
		int count = 0;
		if (itemCount.containsKey(id)) {
			count = itemCount.get(id);
		}
		return count;
		
	}
	
	//keeps track of how many of our total items are
	public Map<String, Integer> itemCounts() {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < this.itemList.size(); i++) {

			String tmp = itemList.get(i).getId();

			if (map.containsKey(tmp)) {
				int count = map.get(tmp);
				map.put(tmp, count + 1);
			} else {
				map.put(tmp, 1);
			}
		}
		return map;
	}


	// Gets the original price of the cart using a Lambda function
	public double retailPrice() {
		return this.itemList.stream().mapToDouble(i -> i.getPrice()).sum();
	}

	// returns the final sale price after controlling for discounts
	public double salePrice() {
		return this.itemList.stream().mapToDouble(i -> i.getSalePrice()).sum();
	}

	//prints our data
	public void printData() {
		this.itemList.forEach(item -> System.out.println(item.print()));
		System.out.println("Number of Items: " + this.itemCounts());
		System.out.println("Cart Original Price Total: " + this.retailPrice());
		System.out.println("Cart Sales Total: " + this.salePrice());
		System.out.println("Total Difference: " + (this.retailPrice() - this.salePrice()));
		// toString(i -> i.print());
	}

	public void printName() {
		this.itemList.forEach(item -> System.out.println(item.getName()));

	}
}
