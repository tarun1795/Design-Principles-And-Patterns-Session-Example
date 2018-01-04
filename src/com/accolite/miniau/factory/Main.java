package com.accolite.miniau.factory;

public class Main {

	public static void main(String[] args) {
		
		//espresso
		Coffee coffee = CoffeeFactory.getCoffee("A");
		System.out.println(coffee.serve()+" "+coffee);
		
		//latte
		coffee = CoffeeFactory.getCoffee("B");
		System.out.println(coffee.serve()+" "+coffee);
	}
}
