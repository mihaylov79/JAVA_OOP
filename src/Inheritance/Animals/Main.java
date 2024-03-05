package Inheritance.Animals;

import Inheritance.Animals.Cat.Cat;
import Inheritance.Animals.Cat.Kitten;
import Inheritance.Animals.Cat.Tomcat;
import Inheritance.Animals.Dog.Dog;
import Inheritance.Animals.Frog.Frog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner kbInput = new Scanner(System.in);

        String commandInput = kbInput.nextLine();

        while(!"Beast!".equalsIgnoreCase(commandInput)){

            try{
            switch (commandInput){

                case "Cat":
                    String[] info = kbInput.nextLine().split("\\s+");
                    Cat cat = new Cat(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(cat);
                    break;

                case "Dog":
                    info = kbInput.nextLine().split("\\s+");
                    Dog dog = new Dog(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(dog);
                    break;

                case "Frog":
                    info = kbInput.nextLine().split("\\s+");
                    Frog frog = new Frog(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(frog);
                    break;

                case "Tomcat":
                    info = kbInput.nextLine().split("\\s+");
                    Tomcat tomcat = new Tomcat(info[0], Integer.parseInt(info[1]));
                    System.out.println(tomcat);
                    break;

                case "Kitten":
                    info = kbInput.nextLine().split("\\s+");
                    Kitten kitten = new Kitten(info[0], Integer.parseInt(info[1]));
                    System.out.println(kitten);
                    break ;
            }

            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Invalid input!");
            }


            commandInput = kbInput.nextLine();
        }

    }
}
