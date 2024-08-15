package app;

import java.util.Arrays;

public class ArrayUtils {

    public String[] seasons;

    // Використання анотацій на методі
    @MethodInfo(methodName = "creationSeasonsArray", dataType = "String[]",
            descriptions = "Creates an array of seasons")
    @Author(authorName = "Coder", authorSurname = "Javaenko")
    public String[] creationSeasonsArray() {
        seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        return seasons;
    }

    // Використання анотацій на методі 1
    @MethodInfo(methodName = "toUpperCaseData", dataType = "String[]",
            descriptions = "converts the list to uppercase and outputs the result")
    @Author(authorName = "Coder", authorSurname = "Javaenko")
    public void toUpperCaseData(String[] arr) {
        String res = Arrays.toString(arr).toUpperCase();
        System.out.println(res);
    }
}
