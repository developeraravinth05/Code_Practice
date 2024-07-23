package Loops;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int asum= A.length();
        int bsum= B.length();
        System.out.println(asum+bsum);


        A.toUpperCase().charAt(0);
        B.toUpperCase().charAt(0);
        System.out.println(A+B);


    }
}
