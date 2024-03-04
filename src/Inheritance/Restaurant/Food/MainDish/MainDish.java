package Inheritance.Restaurant.Food.MainDish;

import Inheritance.Restaurant.Food.Food;

import java.math.BigDecimal;

public class MainDish extends Food {

    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
