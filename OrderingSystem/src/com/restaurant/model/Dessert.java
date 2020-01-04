package com.restaurant.model;

public class Dessert extends Meal {
	private String name;
	private int price;

	public Dessert(String name, int price) {
		this.name=name;
		this.price=price;
		}

	@Override
	public String toString() {
		return name + ", cena=" + price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
