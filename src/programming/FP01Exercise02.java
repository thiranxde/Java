package programming;

import java.util.List;

public class FP01Exercise02 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, 56, 90, 12, 38);
        printSquresOfEvenNumbersInListFunctional(numbers);
        printCubesOfOddNumbersInListFunctional(numbers);
    }

    private static void printSquresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }
}

