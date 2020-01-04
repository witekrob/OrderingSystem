package com.restaurant.service;

import java.util.List;

import com.restaurant.model.Dessert;
import com.restaurant.repository.DessertRepository;

public class DessertMenu extends ModelMenu<Dessert>{
	
	private DessertRepository dessertRepo = new DessertRepository();
	private List<Dessert> dessertMenu= dessertRepo.getExampleMenu();
	
	@Override
	public void addToMenu(Dessert dessert) {
		dessertRepo.addDessertToMenu(dessert);
	}
	@Override
	public List<Dessert> getMenu() {
		return dessertMenu;
	}
	}

	
