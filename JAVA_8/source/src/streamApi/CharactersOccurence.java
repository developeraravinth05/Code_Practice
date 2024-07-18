package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersOccurence {
    public static void main(String[] args) {


  List<Integer> integers= Arrays.asList(1,2,3,7,4,7,5,7,8,9,8);
 Map<Integer,Long> map= integers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        System.out.println("Numbers occurring more than once:");
        map.entrySet().
                stream()
                .filter(entry -> entry.getValue()> 1)
               .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()+
                       "-"+ entry.hashCode()));

}
    }