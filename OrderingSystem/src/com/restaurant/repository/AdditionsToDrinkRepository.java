package com.restaurant.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.restaurant.model.AdditionToDrink;
public class AdditionsToDrinkRepository {

	private List<AdditionToDrink> menu = new ArrayList<AdditionToDrink>();
	private List<AdditionToDrink> niemod;

	private List<AdditionToDrink> createExampleMenu() {
		AdditionToDrink dri1 = new AdditionToDrink("Ice cubes", 0);
		AdditionToDrink dri2 = new AdditionToDrink("Lemon", 0);
		AdditionToDrink dri3 = new AdditionToDrink("Ice cubes and lemon", 0);

		menu.add(dri1);
		menu.add(dri2);
		menu.add(dri3);
		return menu;
	}

	public void addAdditionToMenu(AdditionToDrink addit) {
		menu.add(addit);
	}

	public List<AdditionToDrink> getExampleMenu() {
		this.createExampleMenu();
		niemod = java.util.Collections.unmodifiableList(menu);
		return niemod;
	}
}