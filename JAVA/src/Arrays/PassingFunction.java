package Arrays;

import java.util.Arrays;

public class PassingFunction {

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] array) {
    array[0] =10;

    }
}
