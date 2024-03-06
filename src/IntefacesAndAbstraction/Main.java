package IntefacesAndAbstraction;

import IntefacesAndAbstraction.FoodShortage.Rebel;
import IntefacesAndAbstraction.Person.Citizen;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        int boughtFood = 0;

        Map<String,Citizen> citizens = new LinkedHashMap<>();
        Map<String, Rebel> rebels = new LinkedHashMap<>();

        int n = Integer.parseInt(kbInput.nextLine());

        for (int i = 0; i < n ; i++) {

            String[] sysInput = kbInput.nextLine().split("\\s+");

            if (sysInput.length == 3 ){
               Rebel rebel = new Rebel(sysInput[0], Integer.parseInt(sysInput[1]), sysInput[2]);

                rebels.put(rebel.getName(),rebel);
            }else {
                Citizen citizen = new Citizen(sysInput[0],Integer.parseInt(sysInput[1]), sysInput[2],sysInput[3]);

                citizens.put(citizen.getName(),citizen);
            }
        }

        String buyerName = kbInput.nextLine();

        while (!"End".equalsIgnoreCase(buyerName)){


            if (rebels.containsKey(buyerName)){
                rebels.get(buyerName).buyFood();

            }else if (citizens.containsKey(buyerName)){
                citizens.get(buyerName).buyFood();

            }

            buyerName = kbInput.nextLine();
        }


        for (Rebel rebel: rebels.values()){
           boughtFood += rebel.getFood();
        }
        for (Citizen citizen: citizens.values()){
            boughtFood += citizen.getFood();
        }

        System.out.println(boughtFood);
    }
}
