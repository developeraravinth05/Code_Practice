package String;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringWithSpecialChars {
    public static void main(String[] args) {
        String str = "a,b$c";

        // Extract characters that are not special characters
        List<Character> letters = str.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());

        // Reverse the list of letters
        List<Character> reversedLetters = new ArrayList<>(letters);
        java.util.Collections.reverse(reversedLetters);

        // Reconstruct the string by replacing letters in the original positions
        String result = str.chars()
                .mapToObj(ch -> Character.isLetterOrDigit(ch)
                        ? reversedLetters.remove(0)
                        : (char) ch)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result); // Output: "c,b$a"
    }
}
