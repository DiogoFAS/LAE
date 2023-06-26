package EN;

import java.lang.reflect.Field;

public class Weather {
    @ValidText(values = {"Sunny", "Rainy", "Cloudy"})
    public String desc;

    public Weather() {
    }

    public static void checkAndSet(Object w, String fieldName, String value) throws NoSuchFieldException, IllegalAccessException {
        var clazz = w.getClass();
        Field field = clazz.getDeclaredField(fieldName);

        ValidText annotation = field.getAnnotation(ValidText.class);
        if (annotation != null) {
            String[] strings = annotation.values();

            for (String elem : strings) {
                if (value.equals(elem)) {
                    field.setAccessible(true);
                    field.set(w, value);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid value for property " + fieldName);
        }
    }
}



