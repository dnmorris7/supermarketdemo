package com.anthemengineering.supermarketdemo;

import java.util.HashMap;
import java.util.Map;

import com.anthemengineering.model.ShoppingCart;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) {
String appleTestId = "0001";
String banannaTestId = "0002";

		ShoppingCart cart = new ShoppingCart();
		cart.add(appleTestId);
		cart.add(banannaTestId);
		//cart.add("0001");
		//cart.add("0002");
		double retailPrice = cart.itemList.stream().mapToDouble(i -> i.getPrice()).sum();
		// String cartString = cart.itemList.stream().filter(pred).forEach(i ->
		// i.getName());
		// cart.itemList.forEach(i -> System.out.println(i.getName()));
		cart.printData();
		System.out.print("Number of Items: " + cart.itemCounts());
		System.out.println("  | Cart total: " + cart.retailPrice());
		System.out.println("|Cart Size: " + cart.itemList.size());
		cart.add("0001");

		System.out.println("==Second Item Add Iteration== \r");

		System.out.println("Cart size (after second apple): " + cart.itemList.size());
		

		cart.printData();
		
		System.out.print("  | Cart total: " + cart.retailPrice());
		System.out.println(" | Cart Size: " + cart.itemList.size());		
		Map<String, Integer> itemCounts = new HashMap<String, Integer>();

		itemCounts = cart.itemCounts();
		int items = itemCounts.get("0001");
		System.out.println("Apples in Cart: " + items);
		
	
		 items = itemCounts.get("0002");
		System.out.println("Bananas in Cart: " + items);
		//cart.printName();
		
		//Iterator iterator = cart.itemList.iterator();
		/*
		 * while( iterator.hasNext());{ ArrayList check = (ArrayList)
		 * iterator.next(); print(cart.itemList.)
		 * if(cart.itemList.contains(test)) System.out.println(1); }
		 */

		// System.out.println(cartString);
	}
}
