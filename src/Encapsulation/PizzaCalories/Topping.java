package Encapsulation.PizzaCalories;

import java.util.Map;

public class Topping {

    private static final int BASE_CALORIES = 2;
    private static final Map<String,Double> TOPPINGS =
                            Map.of("Meat", 1.2, "Veggies", 0.8, "Cheese", 1.1, "Sauce", 0.9) ;

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateCalories(){
        return (BASE_CALORIES * this.weight) * TOPPINGS.get(this.toppingType);
    }
}
