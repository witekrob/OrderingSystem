package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.restaurant.model.Cuisine;
import com.restaurant.model.Dish;
import com.restaurant.repository.DishRepository;

public class DishMenu extends ModelMenu<Dish> {

	private DishRepository dishRepo = new DishRepository();
	private List<Dish> dishMenu = dishRepo.getExampleMenu();

	@Override
	public void addToMenu(Dish dish) {
		dishRepo.addDishToMenu(dish);
	}

	@Override
	public List<Dish> getMenu() {
		return dishMenu;
	}

	public List<Dish> getParticulatCuisineList(String cuisine) {
		List<Dish> particList = new ArrayList<>();
		System.out.println("ukladam menu : " + cuisine);

		particList = getMenu().stream().filter(d -> d.getCuisine().toString() == cuisine).collect(Collectors.toList());
		if (particList == null) {
			System.out.println("Brak potraw tej kuchni");
		}
		return particList;
	}

	public void setDishMenu(List<Dish> dishMenu) {
		this.dishMenu = dishMenu;
	}
}
