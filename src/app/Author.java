package app;

import java.lang.annotation.*;

// Створення власної анотації для позначення методів
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String authorName();
    String authorSurname();
}