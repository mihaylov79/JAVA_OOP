package ReflectionAndAnnotation.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner kbInput = new Scanner(System.in);

        Class<BlackBoxInt>blackBoxIntClass = BlackBoxInt.class;

        Constructor<BlackBoxInt>privateConstr =
                blackBoxIntClass.getDeclaredConstructor();

        privateConstr.setAccessible(true);

        BlackBoxInt blackBoxInt = privateConstr.newInstance();


        String commandInput = kbInput.nextLine();




        while (!"END".equals(commandInput)){
            String command = commandInput.split("_")[0];
            int value = Integer.parseInt(commandInput.split("_")[1]);

            Method method = blackBoxIntClass.getDeclaredMethod(command,int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, value);

            Field innerValue = blackBoxIntClass.getDeclaredField("innerValue");
            innerValue.setAccessible(true);

            System.out.println(innerValue.get(blackBoxInt));

            commandInput = kbInput.nextLine();
        }


    }
}
