package com.restaurant.model;

public enum Cuisine {
	POLISH(1), MEXICAN(2), ITALIAN(3);

	private int cuisineNumber;

	private Cuisine(int number) {
		cuisineNumber = number;
	}

	public static String getEnumByInt(int num) {
		for (Cuisine c : Cuisine.values()) {
			if (num == c.cuisineNumber)
				return c.name();
		}
		return null;
	}
}
