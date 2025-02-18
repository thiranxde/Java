package programming;

import java.util.List;

public class FP01Exercise03 {
    public static void main(String[] args) {

        List<String> courses = List.of("java", "Spring", "Spring Boot", "AWS");

        courses.stream()
                .map(course ->course+ " " +course.length())
                .forEach(System.out::println);
    }
}


