package IntefacesAndAbstraction.FoodShortage;

import IntefacesAndAbstraction.Person.Person;

public class Rebel implements Person, Buyer{

    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString(){
        return String.format("%s %d %s",this.name,this.age,this.group);
    }
}
