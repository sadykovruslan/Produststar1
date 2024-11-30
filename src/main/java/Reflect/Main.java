package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    static void setFinalStatic (Field field, Object newValue) throws Exception {
        field.setAccessible(true);
        Field modifierField = Field.class.getDeclaredField("modifiers");
        modifierField.setAccessible(true);

        modifierField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, newValue);

    }
    public static void main(String[] args) throws Exception {
        setFinalStatic (Boolean.class.getField("FALSE"), true);

        System.out.format("Value %s", 2==5);
        System.out.println();
        System.out.format("Value %s", 5==5);
    }
}