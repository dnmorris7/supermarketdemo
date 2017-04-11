package com.anthemengineering.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.function.Predicate;

public class ShoppingCart extends Observable {
	public Item item;
	public List<Item> itemList;
	public Map<String, Integer> itemCount;

	public ShoppingCart() {

		this.itemList = new ArrayList<Item>();
		itemCount = new HashMap<String, Integer>();
	}

	public void add(String id) {
		item = new Item(id);
		itemList.add(item);
		// need to replace this with an update call to the price object
	}

	// TODO: for the sake of view operations later on.
	public void priceChanged() {
		setChanged();
		notifyObservers();

	}

	// the basis for deals
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

	// Gets the original total sale price
	public double retailPrice() {
		return this.itemList.stream().mapToDouble(i -> i.getPrice()).sum();
	}

	public void printData() {
		this.itemList.forEach(item -> System.out.println(item.print()));
		System.out.println("Number of Items: " + this.itemCounts());
		System.out.println("Cart Original Price Total: " + this.retailPrice());
		
		
		// toString(i -> i.print());
	}

	public void printName() {
		this.itemList.forEach(item -> System.out.println(item.getName()));
		// toString(i -> i.print());
	}

	// to-do: set up real-time price totaling via observer
}
