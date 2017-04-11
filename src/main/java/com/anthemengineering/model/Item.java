package com.anthemengineering.model;

import java.text.NumberFormat;

public class Item {

	private String id = "";
	private String name = "";
	private String description;

	public Item(String id){
	/*Later, we'll used the SQL DAO to access and create an item from the SQL prepared statement
	 * For now, a simple test case will do */
		if (id.equals("0001")){ //to test Use Case #1: Multiple items, no price modifiers
			this.id=id;
			this.name="Apple";
			this.price=2.50;
			
		}
		else if (id.equals("0002")){ //to test Use Case #2: An additional item distinct from the first
			this.id=id;
			this.name="Banana";
			this.price=.49;
		}
		else if (id.equals("0003")){ //to test Use Case #3:three items, get one free
			this.id=id;
			this.name="Toothbrush";
			this.price=1.99;
		}
		else if (id.equals("0004")){//to test Use Case #: Extra Tax Surcharge
			this.id=id;
			this.name="Toothbrush";
			this.price=3.49;
			
		}
		else if (id.equals("0005")){//to test Use Case #5: Bundled
			this.id=id;
			this.name="Chips";
			this.price=2.49;
			
		}
		else if (id.equals("0006")){//to test Use Case #5: Bundled
			this.id=id;
			this.name="Toothbrush";
			this.price=3.49;
		}
		
		
		else{
			System.out.println("to be tested");
			
		}
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	private double price; //potentially change to a full price object later
	
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
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String print(){
		return "[id: "+ this.getId() + " | name: " + this.getName() + " | price: $"+ this.getPrice() +"]";
	}
}
