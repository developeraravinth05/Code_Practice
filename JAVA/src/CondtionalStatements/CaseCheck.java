package CondtionalStatements;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char string=sc.next().trim().charAt(0);
        if (string>='a'&&string<='z' ){
            System.out.println("lowercase");
        }else {
            System.out.println("uppercase");
        }
    }


}
