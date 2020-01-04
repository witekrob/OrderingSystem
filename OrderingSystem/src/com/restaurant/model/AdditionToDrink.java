package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class AdditionToDrink extends Meal {
	private String name;
	private int price;
	List<AdditionToDrink> listOfAdds = new ArrayList<>();

	public AdditionToDrink() {
	}

	public AdditionToDrink(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void addAdditionToList(AdditionToDrink add) {
		listOfAdds.add(add);
	}

	public List<AdditionToDrink> getListOFAddition() {
		return listOfAdds;
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