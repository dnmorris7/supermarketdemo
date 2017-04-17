package com.anthemengineering.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.anthemengineering.model.SaleMediator;
import com.anthemengineering.model.ShoppingCart;
import com.anthemengineering.model.Item;
public class SaleMediatorTest {
public ShoppingCart cart;
public  String toothbrushTestId, chipsTestId, salsaTestId;
public SaleMediator sales;
public Item item;

	@Before
	public void setUpBeforeClass() throws Exception {
		
		 toothbrushTestId = "0003"; 
		 chipsTestId = "0005";
		 salsaTestId = "0006";
		 cart = new ShoppingCart();
		 sales = new SaleMediator(cart);
		sales.addSale(toothbrushTestId, 3);
		sales.addSaleBundle(chipsTestId, salsaTestId);
		
	}

	@Test
	public void testToothBrushSale() {

		cart.add(toothbrushTestId);
		cart.add(toothbrushTestId);
		cart.add(toothbrushTestId, sales);
		//cart.printData();
		double expectedToothbrushSale=cart.salePrice();
	assertTrue(expectedToothbrushSale == 3.98);
	}
	@Test
	public void testChipBundleSale() {

		cart.add(salsaTestId);
		cart.printData();
		cart.add(chipsTestId, sales);
		cart.printData();
		double expectedSalsaSale=cart.salePrice();
	assertTrue(expectedSalsaSale == 4.99);
	}
}
