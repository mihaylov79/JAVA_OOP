package ReflectionAndAnnotation.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbInput = new Scanner(System.in);
		Class<RichSoilLand>RichSolidLandClass = RichSoilLand.class;
		Field[] declaredFields = RichSolidLandClass.getDeclaredFields();
		String command = kbInput.nextLine();

		while (!"HARVEST".equalsIgnoreCase(command)){
			if ("all".equalsIgnoreCase(command)){

			     Arrays.stream(declaredFields)
					.forEach(f-> System.out.printf("%s %s %s%n",
							Modifier.toString(f.getModifiers()),
							f.getType().getSimpleName(),
							f.getName()));
			}else {
				String finalCommand = command;
				Arrays.stream(declaredFields).
						filter(f -> Modifier.toString(f.getModifiers()).equals(finalCommand))
						.forEach(f-> System.out.printf("%s %s %s%n",
						Modifier.toString(f.getModifiers()),
						f.getType().getSimpleName(),
						f.getName()));
			}

			command = kbInput.nextLine();
		}

	}
}
