package functionalInterface.combinationOFFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {
        // Example number
        int number = 2;

        // Function to square a number
        Function<Integer, Integer> square = (n) -> n * n;

        // Predicate to check if a number is even
        Predicate<Integer> isEven = (n) -> n % 2 == 0;


        // Apply the Function to square the number
        int squaredNumber = square.apply(number);
        System.out.println("Square of " + number + " is " + squaredNumber);

        // Use Predicate to check if the squared number is even
        if (isEven.test(squaredNumber)) {
            System.out.println(squaredNumber + " is even");
        } else {
            System.out.println(squaredNumber + " is not even");
        }
        Stream.of(2,2).reduce((a,b)->a*b).stream().forEach(x->System.out.println("MULTIPLY"+x));

    }
}
