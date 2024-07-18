package CondtionalStatements;

import java.util.Scanner;

public class SwicthCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit:");
        String fruit=sc.next();
        System.out.println(" ");
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Keeps doctor away");
            case "Orange" -> System.out.println("i am the citrix acid");
            default -> System.out.println("Enter the correct fruit");
        }
}}
