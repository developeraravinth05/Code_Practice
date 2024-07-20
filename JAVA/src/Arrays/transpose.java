package Arrays;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//way 1
        int[][] transposedArr = new int[3][3];
        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                transposedArr[row][col]=arr[col][row];
                System.out.print(transposedArr[row][col]+ " ");
            }
            System.out.println();
        }
// Transpose the matrix
        for (int[] array:transposedArr){

            System.out.println(Arrays.toString(array));
        }



       //way 2


        // Transpose the matrix in place
        for (int row = 0; row < arr.length; row++) {
            for (int col = row + 1; col < arr[row].length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }

         //using deep string
        System.out.println(Arrays.deepToString(arr));

        // Print the transposed matrix using for each
        System.out.println("Transposed matrix:");
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //Using Arrays
        // Print the transposed matrix using Arrays.toString
        System.out.println("Transposed matrix:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
}