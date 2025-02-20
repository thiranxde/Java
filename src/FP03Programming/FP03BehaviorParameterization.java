package FP03Programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03BehaviorParameterization {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,56,90,12,38,38);
        extracted(numbers, x -> x % 2 == 0);

        extracted(numbers, x -> x % 2 != 0);


//        filterAndPrint(numbers, x-> x%2 == 0);
//        filterAndPrint(numbers, x-> x%2 !=0);
//    }
//
//    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
//        numbers.stream()
//                .filter(predicate)
//                .forEach(System.out::println);
    }

    private static void extracted(List<Integer> numbers, Predicate<Integer> oddPredicate) {
        numbers.stream()
                .filter(oddPredicate)
                .forEach(System.out::println);
    }

}
