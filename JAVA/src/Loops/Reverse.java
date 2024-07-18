package Loops;

public class Reverse {

    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        while (num >0) {
            int rem = num % 10;       // Extract the last digit
            reversed = reversed * 10 + rem;   // Append the digit to reversed
            num /= 10;                 // Remove the last digit from num
        }

        System.out.println("Reversed number: " + reversed);
    }

}
