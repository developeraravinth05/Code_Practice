package Loops;

import java.util.Scanner;

public class FibanoociNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
   int a=0;
   int b=1;
//         int count=2;
//        while(count<=n){
//        int temp=b;
//        b=b+a;
//        a=temp;
//        count++;
//        }
//        System.out.println(b);


        /*
        using for loop
        */
        for (int count=2;count<=n;count++){
            int temp =b;
            b=a+b;
            a=temp;
        }
        System.out.println(b);

    }


}
