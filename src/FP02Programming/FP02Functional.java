package FP02Programming;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,56,90,12,38);

        int sum = sumOfAllNumbersFunctional(numbers);

        System.out.println(sum);
    }
    private static int sum(int a,int b){
        return a + b;
    }

    private static int sumOfAllNumbersFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
//                .reduce(0, (x,y)->x+y);
//                .reduce(0,FP02Functional::sum);
        }
    }


