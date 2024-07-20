package ArraysTopic;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
//        int[] arr=new int[4];
//
//        arr[0]=12;
//        arr[1]=14;
//        arr[2]=143;
//        arr[3]=144;
//        System.out.println(arr[0]);
//        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Print each element of the array
        for (int num : arr2) {
            System.out.println(num);
        }

        // If you want to print the entire array as a string representation
        System.out.println(Arrays.toString(arr2));

        String[] strings=new String[3];

        for (int i=0;i<strings.length;i++){
            strings[i]=scanner.next();
        }

        System.out.println(Arrays.toString(strings));


strings[0]="asaa";
    }
}
