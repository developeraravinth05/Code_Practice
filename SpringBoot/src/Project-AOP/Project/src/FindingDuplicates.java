import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicates {

/*
Write a java function
which excepts an arraylist as input parameter and returns an arraylist
input list -    20,30,40,50,20,10,50
output list-    20,50
*/

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(20,30,40,50,20,10,50);
        Set<Integer> integerSet=new HashSet<>();

        integers.stream().filter(x->!integerSet.add(x)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
