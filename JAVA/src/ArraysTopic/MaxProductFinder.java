package ArraysTopic;

public class MaxProductFinder {
    public static int findMaxProduct(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two numbers.");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        System.out.println(max1);
        System.out.println(max2);
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5,6};
        System.out.println("The maximum product is: " + findMaxProduct(nums)); // Output: 35
    }
}
