package FP03Programming;

import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {

    private static void print(String str){
        System.out.println(str);
    }
     public static void main(String[] args) {

        List<String> courses = List.of("java", "Spring", "Spring Boot", "AWS");

        courses.stream()
                .map(String::toUpperCase)
                .forEach(FP03MethodReferences::print);

         //Supplier<String> supplier = () -> new String();
         Supplier<String> supplier = String::new;
    }
}


