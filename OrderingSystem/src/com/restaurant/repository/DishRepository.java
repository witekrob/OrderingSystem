package com.restaurant.repository;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.Cuisine;
import com.restaurant.model.Dish;

public class DishRepository {

	private List<Dish> menu = new ArrayList<Dish>();
	private List<Dish> niemod;

	private List<Dish> createExampleMenu() {
		Dish dis1 = new Dish("Spaghetti", 10, Cuisine.ITALIAN);
		Dish dis2 = new Dish("Klopsiki", 12, Cuisine.POLISH);
		Dish dis3 = new Dish("Golabki", 15, Cuisine.POLISH);
		Dish dis4 = new Dish("Penne arrabiatta", 12, Cuisine.ITALIAN);
		Dish dis5 = new Dish("Rissotto", 14, Cuisine.ITALIAN);

		menu.add(dis1);
		menu.add(dis2);
		menu.add(dis3);
		menu.add(dis4);
		menu.add(dis5);
		return menu;
	}

	public void addDishToMenu(Dish Dish) {
		menu.add(Dish);
	}

	public List<Dish> getExampleMenu() {
		this.createExampleMenu();
		niemod = java.util.Collections.unmodifiableList(menu);
		return niemod;
	}
	}
