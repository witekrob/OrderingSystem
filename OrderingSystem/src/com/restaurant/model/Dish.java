package com.restaurant.model;

public class Dish extends Meal<Dish> {
	
	private String name;
	private int price;
	private Cuisine cuisine;

	
	public Dish(String name, int price, Cuisine cuis) {
		super(name,price);
		this.name=name;
		this.price=price;
		this.setCuisine(cuis);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public Cuisine getCuisine() {
		return cuisine;
	}
	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return  name + ", cena=" + price + ",kuchnia : " + cuisine;	
		}
}
