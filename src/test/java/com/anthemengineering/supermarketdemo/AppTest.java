package com.anthemengineering.supermarketdemo;

import java.util.HashMap;
import java.util.Map;

import com.anthemengineering.model.Item;
import com.anthemengineering.model.Sale;
import com.anthemengineering.model.SaleMediator;
import com.anthemengineering.model.SaleRetail;
import com.anthemengineering.model.ShoppingCart;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {
String appleTestId = "0001";
String banannaTestId = "0002";
String toothbrushTestId = "0003"; 
String wineTestId = "0004";
String chipsTestId = "0005";
String salsaTestId = "0006";
		ShoppingCart cart = new ShoppingCart();
		SaleMediator sales = new SaleMediator(cart);
		sales.addSale(toothbrushTestId, 3);
	//	sales.addSaleBundle(chipsTestId, salsaTestId);
		System.out.println("Quantity for toothbrush sale: "+ sales.getSale(toothbrushTestId));
		//System.out.println("Sale Matches for Bundle: "+ sales.getSale(chipsTestId, salsaTestId));
		
		cart.add(toothbrushTestId);
		cart.printData();
		cart.add(toothbrushTestId);
		cart.printData();
//		sales = new SaleMediator(cart);
		cart.add(toothbrushTestId, sales);
		//cart.add(toothbrushTestId);
		cart.printData();
		cart.add(toothbrushTestId);
		cart.printData();
		/*cart.add(appleTestId);
		cart.add(banannaTestId);
		cart.add(chipsTestId);
		cart.add(salsaTestId);
		//cart.add("0001");
		//cart.add("0002");
		
//		double retailPrice = cart.itemList.stream().mapToDouble(i -> i.getPrice()).sum();
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
		
		 * while( iterator.hasNext());{ ArrayList check = (ArrayList)
		 * iterator.next(); print(cart.itemList.)
		 * if(cart.itemList.contains(test)) System.out.println(1); }
		 

		// System.out.println(cartString);
		System.out.println("==Third Item Add Iteration== \r");

		cart.printData();
		cart.add(wineTestId);
		
		cart.add(chipsTestId);
		cart.add(salsaTestId);
		cart.printData();
		if(cart.itemList.contains(new Item(salsaTestId))
			System.out.println("Salsa Found");

cart.itemList.lastIndexOf(salsaTestId);		*/
	}
}
