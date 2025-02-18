package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23,56,90,12,38);
//        printAllNumbersInListFunctional(numbers);
        printEvenNumbersInListFunctional(numbers);
    }

    private static void print(int number){
        System.out.println(number);
    }
//    private static boolean isEven(int number){
//        return number% 2 == 0;
//    }

//    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
//        numbers.stream()
//                .forEach(FP01Functional::print);
//        }
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)
                .forEach(System.out::println);
    }
    }

