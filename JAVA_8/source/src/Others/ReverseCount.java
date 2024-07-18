package Others;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseCount {
    public static void main(String[] args) {


    int num = 123456;

    List<Integer> reversedDigits = String.valueOf(num).chars().mapToObj(c->c).map(Character::getNumericValue).collect(Collectors.toList());
       Collections.reverse(reversedDigits);
        System.out.println(reversedDigits);
}}
