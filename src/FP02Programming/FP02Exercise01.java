package FP02Programming;

import java.util.List;

public class FP02Exercise01 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,56,90,12,38);

        int sum = sumOfAllSquareNumbersFunctional(numbers);

        System.out.println(sum);
    }
    private static int sum(int a,int b){
        return a + b;
    }

    private static int sumOfAllSquareNumbersFunctional(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x*x)
                .reduce(0, Integer::sum);

        }
    }


