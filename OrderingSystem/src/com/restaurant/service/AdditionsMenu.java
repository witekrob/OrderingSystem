package com.restaurant.service;

import java.util.List;

import com.restaurant.model.AdditionToDrink;
import com.restaurant.model.Drink;
import com.restaurant.repository.AdditionsToDrinkRepository;
import com.restaurant.repository.DrinkRepository;

public class AdditionsMenu extends ModelMenu<AdditionToDrink>{
	private AdditionsToDrinkRepository additionsRepo = new AdditionsToDrinkRepository();
	private List<AdditionToDrink> addsMenu = additionsRepo.getExampleMenu();

	@Override
	public void addToMenu(AdditionToDrink add) {
		additionsRepo.addAdditionToMenu(add);	
	}
	@Override
	public List<AdditionToDrink> getMenu() {
	return addsMenu;	
	}
}
