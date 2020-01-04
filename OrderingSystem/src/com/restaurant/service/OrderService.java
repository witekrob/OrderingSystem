package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.Meal;

public class OrderService {
	private List<Meal> order;
	int overallPrice;
	
	public OrderService() {
	order=new ArrayList<Meal>();
	}
public void addSomethingToOrder(Meal meal) {
	order.add(meal);
	overallPrice=overallPrice+meal.getPrice();
}
public void showYourOrder() {
	List<Meal> yourOrder = getOrder();
	int i=1;
	for(Meal m:yourOrder) {
	System.out.println(i +")" + m);
	i++;
	}
	System.out.println("Cena końcowa : " + overallPrice);
}
public List<Meal> getOrder() {
	return order;
}
public void finalizeOrder() {
order = new ArrayList<Meal>();	
overallPrice=0;
}

}
