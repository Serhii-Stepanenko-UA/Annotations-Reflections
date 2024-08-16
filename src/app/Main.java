package app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            ArrayUtils arrayUtils = new ArrayUtils();
            Class<?> cls = arrayUtils.getClass();
            Method method0 = cls.getMethod("creationSeasonsArray");
            // Викликаємо метод
            method0.invoke(arrayUtils);
            // Показуємо метод
            System.out.println(method0);
            // Показуємо результат роботи метода
            System.out.println("Seasons list: ");
            System.out.println(Arrays.toString(arrayUtils.seasons));

            // Отримання анотації для методу creationSeasonsArray, виведення інформації про метод
            Method method = cls.getDeclaredMethod("creationSeasonsArray");

            System.out.println("Method name - " + method.getAnnotation(MethodInfo.class).methodName());
            System.out.println("Method returns types - " + method.getAnnotation(MethodInfo.class).dataType());
            System.out.println("Method descriptions - " + method.getAnnotation(MethodInfo.class).descriptions());
            System.out.println("Author - " + method.getAnnotation(Author.class).authorName() + " "
                    + method.getAnnotation(Author.class).authorSurname());

            Method method2 = cls.getMethod("toUpperCaseData", String[].class);
//            // Викликаємо метод
//            Object seasons = String[]; // Приведення типів
//            method2.invoke(arrayUtils, seasons);
//            // Показуємо метод
//            System.out.println(method2);
            // Показуємо результат роботи метода
            System.out.println("\nSEASONS IN UPPER CASE: ");
            arrayUtils.toUpperCaseData(arrayUtils.seasons);

            // Отримання анотації для методу toUpperCaseData, виведення інформації про метод
            Method method1 = cls.getDeclaredMethod("toUpperCaseData", String[].class);
            System.out.println("Method name - " + method1.getAnnotation(MethodInfo.class).methodName());
            System.out.println("Method returns types - " + method1.getAnnotation(MethodInfo.class).dataType());
            System.out.println("Method descriptions - " + method1.getAnnotation(MethodInfo.class).descriptions());
            System.out.println("Author name - " + method1.getAnnotation(Author.class).authorName());
            System.out.println("Author surname - " + method1.getAnnotation(Author.class).authorSurname());

        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
