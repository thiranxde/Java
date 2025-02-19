package FP01Programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        printAllNumbersInListStructured(List.of(23,56,90,12,38));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number:
             numbers) {
            System.out.println(number);

        }
    }
}
