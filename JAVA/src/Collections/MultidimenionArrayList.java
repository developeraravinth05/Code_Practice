package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimenionArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            arrayList.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
         arrayList.get(i).add(sc.nextInt());
            }
        }


            System.out.println(arrayList);


    }
}
