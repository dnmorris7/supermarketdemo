package com.anthemengineering.model;

import java.util.HashMap;
import java.util.Map;

public class SaleMediator implements Mediator {
	private ShoppingCart cart;
	private Map<String, String> bundle;
	private Map<String, Integer> saleMap;

	public SaleMediator(ShoppingCart cart) {
		this.cart = cart;
		saleMap = new HashMap<String, Integer>();
		bundle = new HashMap<String, String>();
		//Logger log = Logger.getLogger(SaleMediator.class.getName());
	}

	public SaleMediator() {
		saleMap = new HashMap<String, Integer>();
	}

	@Override
	public boolean getSaleBuyGet(String id) {
		boolean eligible = false;
		//System.out.println("Test SaleOfferGet: " + saleMap.get(id) + "\r" + "TestCartItem: " + cart.itemCount(id));

		try {
			// if number of items in the cart IS ABOUT to become the number of
			// items we set as the quantity for a sale
			if (cart.itemCount(id) + 1 == saleMap.get(id))
			eligible = true;
		} catch (Exception e) {
		}
		System.out.println(eligible);
		return eligible;
	}

	@Override
	public boolean saleOfferBundle(String id, String id2) {
		boolean eligible = false;
		try {
			if (cart.contains(id) && cart.contains(id2))
				eligible = true;
		} catch (Exception e) {
		}

		return eligible;
	}

	@Override
	public void addSale(String id, int quantity) {
		saleMap.put(id, quantity);
	}

	public void addSaleBundle(String id, String id2) {
		bundle.put(id, id2);
		bundle.put(id2, id);
	}

	public int getSale(String id) {
		return saleMap.get(id);

	}

	public boolean getSaleBundle(String id, String id2) {
		boolean eligible = false;
		if (bundle.containsKey(id2) || bundle.containsKey(id)) {
			if (bundle.get(id).equals(id2) || bundle.get(id2).equals(id)) {
				eligible = true;
			}
		} 
			return eligible;
	}


	@Override
	public void addSale(String id, String id2) {
		// TODO Auto-generated method stub

	}
}
