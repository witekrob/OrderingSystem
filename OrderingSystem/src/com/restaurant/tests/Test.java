package com.restaurant.tests;

import static org.junit.jupiter.api.Assertions.*;

import com.restaurant.model.Meal;
import com.restaurant.service.OrderService;

class Test {

	@org.junit.jupiter.api.Test
	void addMealToOrder() {
	OrderService orderService = new OrderService();
	Meal<Meal> meal = new Meal<>("Soup", 10);
	orderService.addSomethingToOrder(meal);
	Meal<Meal> whatsInOrder = orderService.getOrder().get(0);
	
	assertEquals(meal,whatsInOrder);
	}

}
