package IntefacesAndAbstraction.BirthdayCelebrations;

import IntefacesAndAbstraction.MultipleImplementations.Birthable;

public class Pet implements Birthable {

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

//    @Override
//    public String toString() {
//        return birthDate;
//    }
}
