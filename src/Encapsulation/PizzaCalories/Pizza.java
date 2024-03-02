package Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;


    public Pizza(String name, int toppingNum) {
        this.setName(name);
        //this.setDough(dough);
        this.setToppings(toppingNum);

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.trim().length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int toppingNum) {
        if (toppingNum < 0 || toppingNum > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(toppingNum);
    }

    public double getOverallCalories(){
        double toppingCalories =
                this.toppings.stream().
                        mapToDouble(Topping::calculateCalories).sum();

        return this.dough.calculateCalories() + toppingCalories;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }
}
