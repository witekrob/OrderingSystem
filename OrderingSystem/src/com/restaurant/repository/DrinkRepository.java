package com.restaurant.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.restaurant.model.Drink;
import com.restaurant.service.DrinkMenu;

public class DrinkRepository {
	private List<Drink> menu = new ArrayList<Drink>();
	private List<Drink> niemod;

	private List<Drink> createExampleMenu() {
		Drink dri1 = new Drink("Kawa czarna", 12);
		Drink dri2 = new Drink("Herbata czarna", 8);
		Drink dri3 = new Drink("Herbata zielona", 10);
		Drink dri4 = new Drink("Latte", 12);
		Drink dri5 = new Drink("Woda niegazowana", 6);

		menu.add(dri1);
		menu.add(dri2);
		menu.add(dri3);
		menu.add(dri4);
		menu.add(dri5);
		return menu;
	}

	public void addDrinkToMenu(Drink Drink) {
		menu.add(Drink);
	}

	public List<Drink> getExampleMenu() {
		this.createExampleMenu();
		niemod = java.util.Collections.unmodifiableList(menu);
		return niemod;
	}
}