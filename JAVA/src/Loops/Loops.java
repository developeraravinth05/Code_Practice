package Loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
//for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Hello World");
        }

//
//while loop
        int num = 12;
        while (num <= 14) {
            System.out.println("mass");
            num++;
        }


//do while
        int number=19;
do {
    System.out.println("maapi");
    number++;
}
while(number<=14);


    }
}
