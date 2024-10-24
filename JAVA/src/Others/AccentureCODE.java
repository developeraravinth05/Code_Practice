package Others;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AccentureCODE {
    public static void main(String[] args) {

        List<Integer> integreList= Arrays.asList(21,2,3,4,4,4,2,11,3454,22,113,55,30,88);

        integreList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(2).forEach(System.out::println);
    }
}
