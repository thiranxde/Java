package FP02Programming;

import java.util.List;

public class FP02Exercise03 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,56,90,12,38,38);
//        removeDuplicates(numbers);
        sortList(numbers);

    }

    private static void sortList(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }


    private static void removeDuplicates(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        }
    }


