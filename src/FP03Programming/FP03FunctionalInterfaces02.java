package FP03Programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03FunctionalInterfaces02 {

    private static Function<Integer, Integer> go;

    public static void main(String[] args) {

        List<Integer> numbers = List.of(23, 56, 90, 12, 38, 38);

        // Predicate<T>: A functional interface that takes an argument and returns a boolean.
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        // Function<T, R>: A functional interface that takes an argument of type T and returns a value of type R.
        Function<Integer, Integer> squaredNumber = x -> x * x;

        // Consumer<T>: A functional interface that takes an argument and returns no result.
        Consumer<Integer> sysOut = System.out::println;

        // BinaryOperator<T>: A specialization of BiFunction that takes two arguments of type T and returns a T result.
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

        /*
        numbers.stream()
               .filter(isEvenPredicate)  // Filters even numbers using Predicate
               .map(squaredNumber)       // Maps numbers to their squares using Function
               .forEach(sysOut);         // Consumes and prints each number using Consumer
        */

        // Supplier<T>: A functional interface that provides a result without taking any input.
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        // System.out.println(randomIntegerSupplier.get());

        // UnaryOperator<T>: A specialization of Function<T, T> that takes one argument and returns a result of the same type.
        UnaryOperator<Integer> getNumber = (x) -> 3 * x;

        // System.out.println(getNumber.apply(10));

        // BiPredicate<T, U>: A functional interface that takes two arguments and returns a boolean.
        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return number < 10 && str.length() > 5;
        };
        // System.out.println(biPredicate.test(10, "inSomeMinutes"));

        // BiFunction<T, U, R>: A functional interface that takes two arguments and returns a result.
        BiFunction<Integer, String, String> biFunction = (number, str) -> {
            return number + " " + str;
        };
        System.out.println(biFunction.apply(10, "SomeText"));

        // BiConsumer<T, U>: A functional interface that takes two arguments and returns no result.
        BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer.accept(15, "Some Text");
    }
}
