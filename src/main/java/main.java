import ER.CheckAndSet;
import ER.Account;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Field[] fields = Exemplo.class.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field.getName());
        }
    }
}