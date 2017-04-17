package com.anthemengineering.model;

import java.text.NumberFormat;

import org.apache.commons.logging.Log;

public class Item {

	private Sale sale = null;
	private String id = "";
	private String name = "";
	private String description;
	private SaleMediator saleMediator;
	private ShoppingCart cart;
	Log log;

	public Item(String id) {
		/*
		 * Later, we'll used the SQL DAO to access and create an item from the
		 * SQL prepared statement For now, a simple test case will do
		 */
		if (id.equals("0001")) { // to test Use Case #1: Multiple items, no
									// price modifiers
			this.id = id;
			this.name = "Apple";
			this.price = 2.50;
			sale = new SaleRetail(this);
		} else if (id.equals("0002")) { // to test Use Case #2: An additional
										// item distinct from the first
			this.id = id;
			this.name = "Banana";
			this.price = .49;
			sale = new SaleRetail(this);
		} else if (id.equals("0003")) { // to test Use Case #3:three items, get
										// one free
			this.id = id;
			this.name = "Toothbrush";
			this.price = 1.99;
			sale = new SaleRetail(this);
		} else if (id.equals("0004")) {// to test Use Case #: Extra Tax surcharge
			this.id = id;
			this.name = "Wine";
			this.price = 15.49;
			sale = new SaleRetail(this);
			sale = new SaleTax(sale);

		} else if (id.equals("0005")) {// to test Use Case #5: Bundled
			this.id = id;
			this.name = "Chips";
			this.price = 2.49;
			sale = new SaleRetail(this);
		} else if (id.equals("0006")) {// to test Use Case #5: Bundled
			this.id = id;
			this.name = "Salsa";
			this.price = 3.49;
			sale = new SaleRetail(this);
		}

		else {
			System.out.println("to be tested");

		}
	}

	public Item(String id, SaleMediator mediator) {
		saleMediator = mediator;

		if (id.equals("0003")) { // to test Use Case #3:three items, get one
									// free
			this.id = id;
			this.name = "Toothbrush";
			this.price = 1.99;
			sale = new SaleRetail(this);
			// log.info(this.getSalePrice());
			if (saleMediator.getSaleBuyGet(id) == true)
				sale = new SaleFree(sale);

		} else if (id.equals("0005")) { // to test Use Case #5: Multiple bundled items in one cart. Still needs refinement.
			this.id = id;
			this.name = "Chips";
			this.price = 2.49;
			sale = new SaleRetail(this);
			System.out.println(saleMediator.getSaleBundle(id, "0006"));
			if (saleMediator.getSaleBundle(id, "0006") == true) {//maybe it should be treated as a seperate item entirely, but I need to move the logic to the cart level first.
				sale = new SaleFree(sale);
				this.id = "1001";
				this.name = "Salsa Chips Special";
				this.price = 4.99;
				sale = new SaleChips(sale);
			}

		}

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private double price; // potentially change to a full price object later

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public Sale getSale() {
		return sale;
	}

	public double getSalePrice() {
		return sale.cost();
	}

	public void setSaleTax(Sale sale) {
		sale = new SaleTax(sale);
	}

	public void setBuyXDeal(Sale sale) {
		sale = new SaleFree(sale);
	}

	public void setBundleSale(Sale sale) {
		sale = new SaleBundleSalsa(sale);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String print() {
		return "[id: " + this.getId() + " | name: " + this.getName() + " | price: $" + this.getPrice() + " "
				+ sale.getDescription() + " " + sale.cost() + "]";
	}

	public void addMediator(SaleMediator sale2) {
		this.saleMediator = sale2;

	}
}
