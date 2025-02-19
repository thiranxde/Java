package FP02Programming;

import java.util.List;

public class FP02Exercise02 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,56,90,12,38);

        int sum = sumOfAllOddNumbersFunctional(numbers);

        System.out.println(sum);
    }
    private static int sum(int a,int b){
        return a + b;
    }

    private static int sumOfAllOddNumbersFunctional(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x%2 == 1)
//                .filter(x -> x%2 == 0)
                .reduce(0, Integer::sum);

        }
    }


