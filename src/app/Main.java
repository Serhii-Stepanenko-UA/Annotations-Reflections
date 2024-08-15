package app;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            ArrayUtils arrayUtils = new ArrayUtils();
            Class<?> cls = arrayUtils.getClass();

            arrayUtils.creationSeasonsArray();
            System.out.println("\nSeasons list: ");
            System.out.println(Arrays.toString(arrayUtils.seasons));

            // Отримання анотації для методу creationSeasonsArray, виведення інформації про метод
            Method method = cls.getDeclaredMethod("creationSeasonsArray");
            System.out.println("Method name - " + method.getAnnotation(MethodInfo.class).methodName());
            System.out.println("Method returns types - " + method.getAnnotation(MethodInfo.class).dataType());
            System.out.println("Method descriptions - " + method.getAnnotation(MethodInfo.class).descriptions());
            System.out.println("Author - " + method.getAnnotation(Author.class).authorName() + " "
                    + method.getAnnotation(Author.class).authorSurname());

            System.out.println("\nSEASONS IN UPPER CASE: ");
            arrayUtils.toUpperCaseData(arrayUtils.seasons);
            
            // Отримання анотації для методу toUpperCaseData, виведення інформації про метод
            Method method1 = cls.getDeclaredMethod("toUpperCaseData", String[].class);
            System.out.println("Method name - " + method1.getAnnotation(MethodInfo.class).methodName());
            System.out.println("Method returns types - " + method1.getAnnotation(MethodInfo.class).dataType());
            System.out.println("Method descriptions - " + method1.getAnnotation(MethodInfo.class).descriptions());
            System.out.println("Author name - " + method1.getAnnotation(Author.class).authorName());
            System.out.println("Author surname - " + method1.getAnnotation(Author.class).authorSurname());

        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
