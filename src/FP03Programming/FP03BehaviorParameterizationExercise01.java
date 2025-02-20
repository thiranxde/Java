package FP03Programming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03BehaviorParameterizationExercise01 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23, 56, 90, 12, 38, 38);

        Function<Integer, Integer> squaredFunction = x -> x * x;

        Function<Integer, Integer> cubedFunction = x -> x * x * x;
        System.out.println(cubedFunction);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> squaredFunction) {
        return numbers.stream()
                .map(squaredFunction)
                .collect(Collectors.toList());
    }


}
