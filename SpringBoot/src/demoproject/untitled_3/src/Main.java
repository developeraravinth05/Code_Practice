import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    //list of integrs we need find the 3rd higets number
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 10, 8, 5);

        Optional<Integer> thirdHigesht = findThirdHighest(numbers);

    }

    public static Optional<Integer> findThirdHighest(List<Integer> numbers) {

        List<Integer> topThree = numbers.stream().distinct().collect(() -> new int[]
                        {
                                Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                (top3, num) -> {
                    if (num > top3[0]) {
                        top3[2] = top3[1];
                        top3[1] = top3[0];
                        top3[0] = num;

                    } else if (num>top3) {
                        
                    }
                }

    }
}
