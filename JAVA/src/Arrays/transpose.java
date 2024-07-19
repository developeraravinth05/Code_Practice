package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] transposedArr = new int[3][3];
        for (int row=0;row< 2;row++){
        for (int col=0;col<arr[row].length;col++){
            transposedArr[row][col]=arr[col][row];
            System.out.print(transposedArr[row][col]);
        }
            System.out.println();
        }

for (int[] array:transposedArr){

    System.out.println(Arrays.toString(array));
}

    }
}
