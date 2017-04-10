package com.anthemengineering.model;

import java.text.NumberFormat;

public class Item {

	private String id = "";
	private String name = "";
	private String description;

	public Item(String id){
	/*Later, we'll used the SQL DAO to access and create an item from the SQL prepared statement
	 * For now, a simple test case will do */
		if (id.equals("0001")){
			this.id=id;
			this.name="Apple";
			this.price=2.50;
			
		}
		else if (id.equals("0002")){
			this.id=id;
			this.name="Banana";
			this.price=.49;
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
