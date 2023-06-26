package T2;

import Annotations.dontRead;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class VarUtils {
    private static Map<String, Method> getPublicVarGettersOf(Class<?> Klass) {
        Map<String, Method> map = new HashMap<>();
        for (Method elem : Klass.getDeclaredMethods()) {
            if (!elem.isAnnotationPresent(dontRead.class)
                    && elem.getName().startsWith("get")
                    && elem.getReturnType() != void.class
                    && elem.getParameterCount() == 0) {
                map.put(elem.getName(), elem);
            }
        }
        return map;
    }

    public static void showVars(Object obj) {
    }
}
