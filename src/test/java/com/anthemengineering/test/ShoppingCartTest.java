package com.anthemengineering.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.anthemengineering.model.Item;
import com.anthemengineering.model.ShoppingCart;

public class ShoppingCartTest {
	private ShoppingCart cart;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		String testString = "[id: 0001 | name: Apple | price: $2.5]" +"\r"+"[id: 0002 | name: Banana | price: $0.49]";
		
	}

	

	@Before
	public void setUp() throws Exception {
		ShoppingCart cart = new ShoppingCart();
		cart.add("0001");
		cart.add("0002");
		double retailPrice = cart.retailPrice();//cart.itemList.stream().mapToDouble(i -> i.getPrice()).sum();
		System.out.println(retailPrice);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cartTotal() {
		double expected = cart.retailPrice();	
		assertSame(expected, 2.99);
	}
	
	public void addTwoItemsTest() {
		
		
		//assert(test.print(), "0001 | Apple | 2.49" + "\r" + "0001 | Banana | 0.49");
	}

}
