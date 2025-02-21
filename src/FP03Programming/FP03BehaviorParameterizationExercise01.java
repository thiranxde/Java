package FP03Programming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03BehaviorParameterizationExercise01 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23, 56, 90, 12, 38, 38);

        List<Integer> squaredNumbers = mapAndCreate(numbers, x -> x * x);

        List<Integer> cubedNumbers = mapAndCreate(numbers, x -> x * x * x);

        System.out.println(squaredNumbers);
    }

    private static List<Integer> mapAndCreate(List<Integer> numbers, Function<Integer, Integer> squaredFunction) {
        return numbers.stream()
                .map(squaredFunction)
                .collect(Collectors.toList());
    }


}
