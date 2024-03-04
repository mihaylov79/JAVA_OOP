package Inheritance.Restaurant.Beverage.HotBeverage;

import Inheritance.Restaurant.Beverage.Beverage;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {
    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
