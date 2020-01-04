package com.restaurant.controller;

import java.util.List;
import java.util.Scanner;

import com.restaurant.model.Cuisine;
import com.restaurant.model.Dish;
import com.restaurant.model.Meal;
import com.restaurant.service.AdditionsMenu;
import com.restaurant.service.DessertMenu;
import com.restaurant.service.DishMenu;
import com.restaurant.service.DrinkMenu;
import com.restaurant.service.ModelMenu;
import com.restaurant.service.OrderService;

public class MainMenuController {
	DrinkMenu drinkMenu;
	DishMenu dishMenu;
	DessertMenu dessertMenu;
	OrderService order;
	Scanner input = new Scanner(System.in);
	AdditionsMenu additions;
	ModelMenu modelMenu;

	public MainMenuController() {
		this.drinkMenu = new DrinkMenu();
		this.dishMenu = new DishMenu();
		this.dessertMenu = new DessertMenu();
		this.order = new OrderService();
		this.additions = new AdditionsMenu();
	}

	public void mainMenu() {
		System.out.println("Witaj w naszej restauracji");
		System.out.println("Wybierz z poniższej listy co cię interesuje");
		int choice = 0;

		while (choice != 10) {
			System.out.println("1) MENU DAŃ");
			System.out.println("2) MENU DRINKÓW");
			System.out.println("3) MENU DESERÓW");
			System.out.println("4) SPRAWDZ CO ZAMÓWIŁES");
			System.out.println("5) POTWIERDZ ZAMÓWIENIE");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("A oto menu dań głównych: ");
				System.out.println("WYBÓR KUCHNI");
				showMenu(cuisineChoice());
				break;
			case 2:
				System.out.println("A oto menu drinków: ");
				showMenu(drinkMenu);
				System.out.println("Chcesz jakis dodatek do swojego drinka ? ");
				showMenu(additions);
				break;
			case 3:
				System.out.println("A oto menu deserów : ");
				showMenu(dessertMenu);
				break;
			case 4:
				System.out.println("Twoje zamówienie do tej pory :  ");
				order.showYourOrder();
				break;
			case 5:
				System.out.println("Potwierdz zamówienie");
				order.finalizeOrder();
				System.out.println("Zamówienie zrealizowane");
			default:
				System.out.println("Nieznana pozycja");
				mainMenu();
			}
		}
	}

	private void showMenu(ModelMenu modelMenu) {
		List<Meal> menu = modelMenu.getMenu();
		int k = 1;
		for (Meal m : menu) {
			System.out.println(k + ")" + m);
			k++;
		}
		System.out.println("Wybierz od 1 do " + (k - 1) + "  Albo 0 by wyjść do głównego menu");
		int mealChoice = input.nextInt();
		if (mealChoice == 0) {
			mainMenu();
		} else if (mealChoice >= k) {
			System.out.println("Nieznana pozycja, wybierz jeszcze raz");
			showMenu(modelMenu);
		}
		System.out.println("Wybrałes : " + menu.get(mealChoice - 1) + "  dodano do zamowienia");
		order.addSomethingToOrder(menu.get(mealChoice - 1));
		k = 1;
	}

	private DishMenu cuisineChoice() {
		int i = 1;
		for (Cuisine c : Cuisine.values()) {
			System.out.println(i + " ) " + c);
			i++;
		}
		int choice = input.nextInt();
		String cuisine = Cuisine.getEnumByInt(choice);
		System.out.println(cuisine);
		List<Dish> particMenu = dishMenu.getParticulatCuisineList(cuisine);
		DishMenu menu = new DishMenu();
		menu.setDishMenu(particMenu);
		return menu;
	}
}