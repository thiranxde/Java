package FP02Programming;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,56,90,12,38);

        int sum = sumOfAllNumbers(numbers);

        System.out.println(sum);
    }

    private static int sumOfAllNumbers(List<Integer> numbers) {
        int sum =0;
        for (int number:
             numbers) {
            sum+= number;

        }
        return sum;
    }

}
