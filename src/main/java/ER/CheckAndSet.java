package ER;

import ER.Check;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class CheckAndSet {
    public static Object getObject() {
        return (Object) 1;
    }

    public static void checkAndSet(Object target, Map<String, Object> values) throws IllegalAccessException {
        Class<?> Klass = target.getClass();

        Stream<Field> fields =
                Arrays.stream(Klass.getDeclaredFields()).filter(it -> it.isAnnotationPresent(Check.class));

        fields.forEach(field -> {
            try {
                Check annotation = field.getAnnotation(Check.class);
                Object mapValue = values.get(field.getName());
                String funName = annotation.valid();
                Method verificationFun = Klass.getDeclaredMethod(funName, field.getType());
                if (!((Boolean) verificationFun.invoke(target, mapValue))) {
                    throw new Exception("invalid value for " + field.getName());
                }
                field.setAccessible(true);
                field.set(target, mapValue);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
