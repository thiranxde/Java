package FP02Programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Collectors {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23, 56, 90, 12, 38);

        List<Integer> collect = doubleList(numbers);

        List<Integer> evenNumbersOnly = numbers.stream()
                        .filter(x -> x%2==0)
                                .collect(Collectors.toList());

//        System.out.println(collect);
        System.out.println(evenNumbersOnly);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}


