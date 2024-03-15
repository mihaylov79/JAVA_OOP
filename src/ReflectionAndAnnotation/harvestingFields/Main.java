package ReflectionAndAnnotation.harvestingFields;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Class<RichSoilLand>RichSolidLandClass = RichSoilLand.class;
		Field[] declaredFields = RichSoilLand.class.getFields();
		Arrays.stream(declaredFields).forEach(f-> System.out.println(f.getType().getSimpleName()));
	}
}
