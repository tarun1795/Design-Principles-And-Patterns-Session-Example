package com.accolite.miniau.factory;

public class CoffeeFactory {

	public CoffeeFactory()
	{
		
	}
	
	public static Coffee getCoffee(String option)
	{
		Coffee coffee;
		switch(option)
		{
			case "A":coffee = new Espresso();
			break;
			case "B":coffee = new Latte();
			break;
			default: coffee = null;
		}
		return coffee;
	}
}
