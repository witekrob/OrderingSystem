package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.Drink;
import com.restaurant.repository.DrinkRepository;

public class DrinkMenu extends ModelMenu<Drink> {

	private DrinkRepository drinkRepo = new DrinkRepository();
	private List<Drink> drinkMenu = drinkRepo.getExampleMenu();

	@Override
	public void addToMenu(Drink drink) {
	drinkRepo.addDrinkToMenu(drink);	
	}
	@Override
	public List<Drink> getMenu() {
	return drinkMenu;	
	}
}