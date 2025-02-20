package FP03Programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    private static Function<Integer, Integer> go;

    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,56,90,12,38,38);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>(){

            @Override
            public boolean test(Integer x) {
                return  x % 2 == 0;
            }
        };

        Function<Integer, Integer> squaredNumber = x -> x * x;

        Function<Integer, Integer> squaredNumber2 = new Function<Integer, Integer>(){

            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

        Consumer<Integer> sysOut = System.out::println;

        Consumer<Integer> sysOut2 = new Consumer<Integer>(){

            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };

        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

        int sum = numbers.stream()
                .reduce(0, sumBinaryOperator);


        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };

        numbers.stream()
                .filter(isEvenPredicate2)
                .map(squaredNumber2)
                .forEach(sysOut2);
    }
}
