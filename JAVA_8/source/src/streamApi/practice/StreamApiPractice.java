package streamApi.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiPractice {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,5,8,1,8);
        Set<Integer> set=new HashSet<>();

      Set<Integer> integerSet=  list.stream().filter(x->!set.add(x)).collect(Collectors.toSet());

        System.out.println(integerSet);


    }
}
