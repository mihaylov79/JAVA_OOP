package IntefacesAndAbstraction;

import IntefacesAndAbstraction.BirthdayCelebrations.Pet;
import IntefacesAndAbstraction.MultipleImplementations.Birthable;
import IntefacesAndAbstraction.Person.Citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Birthable> list = new ArrayList<>();

        String [] commandInput = kbInput.nextLine().split("\\s+");


        while (!"End".equalsIgnoreCase(commandInput[0])){

            String command = commandInput[0];

            switch (command){

                case "Citizen":
                    Citizen citizen = new Citizen(commandInput[1], Integer.parseInt(commandInput[2]),
                                        commandInput[3],commandInput[4]);
                    list.add(citizen);
                    break;

                case "Pet":
                    Pet pet = new Pet(commandInput[1], commandInput[2] );
                    list.add(pet);
                    break;
            }

            commandInput = kbInput.nextLine().split("\\s+");
        }
        String year = kbInput.nextLine();

        list.stream().filter(birthable -> birthable.getBirthDate().contains(year))
                .forEach(birthable -> System.out.println(birthable.getBirthDate()));
        }
    }


