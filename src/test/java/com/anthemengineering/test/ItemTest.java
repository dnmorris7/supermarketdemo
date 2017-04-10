package com.anthemengineering.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.anthemengineering.model.Item;

public class ItemTest {
	public Item test, test2;

	@Before
	public void setUpBeforeClass() throws Exception {

		test = new Item("0001");
		//System.out.println(test.print());
		System.out.println(test.print());
		test2 = new Item("0002");
String fourdigit = String.format("%04d", 1);

System.out.println(fourdigit);
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testName() {
		String name = test.getName();
		String name2 = test2.getName();
		boolean sameName = name.equals("Apple");
		boolean sameName2 = name2.equals("Banana");
		assertTrue(sameName && sameName2);
		// assertTrue(sameName2);
	}

	@Test
	public void testID(){
	String expected =	test.getId();
	boolean sameId=  expected.equals("0001");
	assertTrue(sameId);
	}
	
	@Test
	public void testPrice(){
		double expected = test.getPrice();
		
		assertSame(expected, 2.50);
		
	}
	
	@Test
	public void testPrint() {
		String expected = "[id: 0001 | name: Apple | price: 2.49]";
		boolean samePrint = expected.equals(test.print());
		assertTrue(samePrint);
	}

}
