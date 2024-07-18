package Loops;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingOccurence {
    public static void main(String[] args) {

     int num=12556;

        int count = 0;

        while (num > 0) {
            int rem = num % 10;
                if (rem == 5) {
                  count++;
                }
                num=num/10;
            }

        System.out.println(count);
    }
}
