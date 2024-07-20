package ArraysTopic;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }

        }

        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

// output using Arrays
     for (int row=0;row<arr.length;row++){
         System.out.println(Arrays.toString(arr[row]));
     }
     //output using enhanced for loop

        for (int[] array:arr){
            System.out.println(Arrays.toString(array));
        }

    }

}
