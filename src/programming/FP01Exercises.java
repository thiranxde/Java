package programming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(23,56,90,12,38);
//        printOddNumbersInListFunctional(numbers);
        List<String> courses = List.of("java","Spring","Spring Boot","AWS");

//        courses.stream()
//                .forEach(System.out::println);
//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 1)
                .forEach(System.out::println);
    }
    }

