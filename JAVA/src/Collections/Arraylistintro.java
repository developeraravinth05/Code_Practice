package Collections;

import java.util.ArrayList;

public class Arraylistintro {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(33);
        arrayList.add(22);
        System.out.println(arrayList);

        for (int i = 0; i < 5; i++) {
        arrayList.add(i);

        }
        System.out.println(arrayList);
    }


}
