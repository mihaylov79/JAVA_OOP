package Inheritance.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String name = kbInput.nextLine();
        int age = Integer.parseInt(kbInput.nextLine());

        Child child = new Child(name,age);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
