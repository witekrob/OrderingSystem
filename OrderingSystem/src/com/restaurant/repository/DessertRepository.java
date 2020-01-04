package com.restaurant.repository;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.Dessert;
import com.restaurant.service.DessertMenu;

import java.util.Collections;

public class DessertRepository {
	
	private List<Dessert> menu = new ArrayList<Dessert>();
	private List<Dessert> niemod;
	
	public List<Dessert> createExampleMenu() {
		Dessert des1 = new Dessert("Lody", 10);
		Dessert des2 = new Dessert("Gorąca czekolada", 12);
		Dessert des3 = new Dessert("Gofry", 15);
		Dessert des4 = new Dessert("Sernik", 12);
		Dessert des5 = new Dessert("Jabłecznik", 14);

		menu.add(des1);
		menu.add(des2);
		menu.add(des3);
		menu.add(des4);
		menu.add(des5);
		return menu;
	}

	public void addDessertToMenu(Dessert dessert) {
		menu.add(dessert);
	}
public List<Dessert> getExampleMenu() {
	this.createExampleMenu();
	niemod = java.util.Collections.unmodifiableList(menu);
	return niemod;
}
}
