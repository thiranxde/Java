package FP05Programming;

import java.util.stream.LongStream;

public class FP05Parallelization {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

//        System.out.println(LongStream.range(0, 1000000000).sum()); //499999999500000000
//        //527

        System.out.println(LongStream.range(0, 1000000000).parallel().sum());//499999999500000000
        //79

        System.out.println(System.currentTimeMillis() - time);
    }
}
