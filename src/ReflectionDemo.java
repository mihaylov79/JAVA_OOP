import Inheritance.Person.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getDeclaredFields(); //returns Public Fields;

        for (Field field : fields) {

            System.out.println(field.getName());
            System.out.println(Modifier.toString(field.getModifiers()));

        }

        Constructor<Person> publicConstructor = personClass.getDeclaredConstructor(String.class,int.class);
    }
}
