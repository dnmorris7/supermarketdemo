package com.anthemengineering.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;


import com.anthemengineering.model.ShoppingCart;

public class ShoppingCartTest extends ArrayList{
	public ShoppingCart cart;
	
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String testString = "[id: 0001 | name: Apple | price: $2.5]" +"\r"+"[id: 0002 | name: Banana | price: $0.49]";
		ShoppingCart cart = new ShoppingCart();
	}*/

	

	@Before
	public void setUpBeforeClass() throws Exception {
	 cart = new ShoppingCart();
		
		cart.add("0001");
		cart.add("0002");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cartSaleTotal() {
	
		double expected = cart.retailPrice();	
		System.out.println(expected);
		assertTrue(expected==2.99);
	}

}
