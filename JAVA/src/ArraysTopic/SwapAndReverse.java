package ArraysTopic;

import java.util.Arrays;

public class SwapAndReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[][] arrMulti = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Swap elements in 1D array
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

        // Reverse elements in 1D array
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        // Swap rows in 2D array
        swap(arrMulti, 0, 1);
        System.out.println("Swapped rows in 2D array: " + Arrays.deepToString(arrMulti));

        // Reverse rows in 2D array
        reverse(arrMulti);
        System.out.println("Reversed rows in 2D array: " + Arrays.deepToString(arrMulti));

        // Transpose the 2D array
        transpose(arrMulti);
        System.out.println("Transposed 2D array: " + Arrays.deepToString(arrMulti));
    }

    // Reverse a 1D array
    private static void reverse(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }

    // Swap elements in a 1D array
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Swap rows in a 2D array
    private static void swap(int[][] arr, int index1, int index2) {
        int[] temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Reverse rows in a 2D array
    private static void reverse(int[][] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }

    // Transpose a 2D array
    private static void transpose(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = row + 1; col < arr[row].length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }
}
