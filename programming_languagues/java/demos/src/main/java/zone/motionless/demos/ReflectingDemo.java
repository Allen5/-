package zone.motionless.demos;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectingDemo {

    private String name = "REFLECTING!";

    public void yield(String words) {
        System.out.println("yielling with " + words );
    }

    /**
     * 静态入口方法
     * @param args
     */
    public static void main(String[] args) {
        // show class name
        System.out.println(ReflectingDemo.class.getCanonicalName());

        // invoke method
        try {
            Method method = ReflectingDemo.class.getMethod("yield", String.class);
            Object clz = ReflectingDemo.class.getDeclaredConstructor().newInstance();
            method.invoke(clz, "AGE!");
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
            e.printStackTrace();
        }

        // change private field
        try {
            Field field = ReflectingDemo.class.getDeclaredField("name");
            System.out.println("field type: " + field.getType() + " : " + field.toGenericString());
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
