package Encapsulation.AnimalFarm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner kbInput = new Scanner(System.in);

    Chicken chicken = new Chicken(kbInput.nextLine(), Integer.parseInt(kbInput.nextLine()));


        System.out.println(chicken);
    }
}
