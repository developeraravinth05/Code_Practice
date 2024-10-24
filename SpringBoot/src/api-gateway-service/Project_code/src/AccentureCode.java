import java.util.Arrays;
import java.util.List;

public class AccentureCode {
    public static void main(String[] args) {
        List<Integer> integreList= Arrays.asList(21,2,3,4,4,4,2,11,3454,22,113,55,30,88);

        integreList.stream().distinct().limit(1).skip(1).forEach(System.out::println);
    }
}
