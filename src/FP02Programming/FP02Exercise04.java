package FP02Programming;

import java.util.Comparator;
import java.util.List;

public class FP02Exercise04 {
    public static void main(String[] args) {

        List<String> courses = List.of("Java", "Spring", "Spring Boot", "AWS");

        courses.stream()
                .sorted(Comparator.comparing(x -> x.length()))
//                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}


