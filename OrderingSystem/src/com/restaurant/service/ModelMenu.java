package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;

public  abstract class ModelMenu<Meal> {

List<Meal> menu = new ArrayList<>();

public void addToMenu(Meal meal)  {
	menu.add(meal);
}
public List<Meal> getMenu(){
	return menu;
}
}
