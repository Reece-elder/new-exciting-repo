package com.qa.main;

public class Runner {
	
	// main ctrl + space
	public static void main(String[] args) {
		
		Cafe.addOrder("flat white");
		System.out.println(Cafe.addOrder("water"));
		Cafe.addOrder("caramel latte");
		Cafe.addOrder("strawberry frappe");
		
		Cafe.updateOrder(1, "soya caramel latte");
		System.out.println(Cafe.getOneOrder(1));
		Cafe.removeOrder(1);
		System.out.println(Cafe.getOrders());
		
		
	}

}
