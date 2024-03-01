package Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, Dough dough) {
        this.setName(name);
        this.setDough(dough);
        this.toppings = new ArrayList<>();
    }

     private void setName(String name) {
        this.name = name;
    }

    private void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
