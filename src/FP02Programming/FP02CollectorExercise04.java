package FP02Programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02CollectorExercise04 {
    public static void main(String[] args) {

        List<String> courses = List.of("Java", "Spring", "Spring Boot", "AWS");

        List<Integer> lengthOfTheCharacters = courses.stream().map(x -> x.length()).collect(Collectors.toList());
        System.out.println(lengthOfTheCharacters);

    }

}


