package com.restaurant.model;

public class Drink extends Meal<Drink> {
	private String name;
	private int price;

	public Drink() {
	}

	public Drink(String name, int price) {
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return name + ", cena=" + price;
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

}
