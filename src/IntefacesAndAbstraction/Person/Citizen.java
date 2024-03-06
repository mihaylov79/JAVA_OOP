package IntefacesAndAbstraction.Person;

import IntefacesAndAbstraction.FoodShortage.Buyer;
import IntefacesAndAbstraction.MultipleImplementations.Birthable;
import IntefacesAndAbstraction.MultipleImplementations.Identifiable;

public class Citizen implements Person, Identifiable, Buyer, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }

//    @Override
//    public String toString() {
//        return birthDate;
//    }
}
