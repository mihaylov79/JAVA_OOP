package Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        String[] pizzaInfo = kbInput.nextLine().split("\\s+");
        try{
        int toppicsNumz = Integer.parseInt(pizzaInfo[2]);
        if (toppicsNumz < 1 || toppicsNumz > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            return;
        }
        String[] doughInfo = kbInput.nextLine().split("\\s+");
        Pizza pizza;
        try{



            Dough dough = new Dough(doughInfo[1], doughInfo[2], Double.parseDouble(doughInfo[3]));

            pizza = new Pizza(pizzaInfo[1], Integer.parseInt(pizzaInfo[2]));

            pizza.setDough(dough);



            String toppingInfo = kbInput.nextLine();



            while (!"END".equalsIgnoreCase(toppingInfo)){



                Topping topping = new Topping(toppingInfo.split("\\s+")[1],
                        Double.parseDouble(toppingInfo.split("\\s+")[2]));

                pizza.addTopping(topping);

                toppingInfo = kbInput.nextLine();

            }

            System.out.printf("%s - %.2f",pizza.getName(),pizza.getOverallCalories());

        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            return;
        }
        System.out.printf("%s - %.2f",
                pizza.getName(),
                pizza.getOverallCalories());

    }
}
