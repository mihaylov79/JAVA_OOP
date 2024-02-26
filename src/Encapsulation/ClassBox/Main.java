package Encapsulation.ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner kbInput = new Scanner(System.in);

    Box box = new Box(Double.parseDouble(kbInput.nextLine()),
                        Double.parseDouble(kbInput.nextLine()),
                        Double.parseDouble(kbInput.nextLine()));

        System.out.printf("Surface Area - %.2f%n",box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n",box.calculateLateralSurfaceArea());
        System.out.printf("Volume – %.2f%n",box.calculateVolume());

    }
}
