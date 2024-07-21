package ArraysTopic;

import java.util.*;

import static java.util.Comparator.reverseOrder;

public class ArraysAndCollection {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5, 7, 8, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 7, 8, 5};
        //sort
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

// check equality of two arrays
        System.out.println(Arrays.equals(arr1, arr2));

        // find max in Array list

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a = 1; a <= 15; a++) {
            arrayList.add(a);
        }
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));


        //SHUFFLING ELEMENTS IN ARRAYLIST
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        //find the frequency of elment in array list
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1,2,3,3,44,5,55,2));
        var frequency = Collections.frequency(arrayList2,3);
        System.out.println(frequency);


    // convert array to Aarry list

    String[] strings={"pam",null,"sam","mam",null};

    ArrayList<String> strings1=new ArrayList<>(Arrays.asList(strings));
        System.out.println(strings1);

        //reverse an array

        ArrayList<String> arrayReverse=new ArrayList<>(Arrays.asList(strings));
        Collections.reverse(arrayReverse);
        System.out.println();
//removal of all elememt in occurance
        ArrayList<String> arraylistRemoval=new ArrayList<>(Arrays.asList(strings));
 arraylistRemoval.removeAll(Collections.singleton("pam"));
        System.out.println(arraylistRemoval);

//copying from arraylist to array
        ArrayList<Integer> integerArrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
     Integer arr[]= integerArrayList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

//remove null values
strings1.removeAll(Collections.singleton(null));
        System.out.println(strings1);

        //sorting list of String in reverse order
        ArrayList<String> sortinglist=new ArrayList<>(Arrays.asList("apple","grapes","banana"));
        Collections.sort(sortinglist,Collections.reverseOrder());
        System.out.println(sortinglist);

        //find the last occurrence of sublist
        // List containing repeated sublists
        ArrayList<String> mainList = new ArrayList<>(Arrays.asList(
                "apple", "banana", "apple", "grapes", "apple", "banana", "grapes", "apple", "banana"
        ));

        // Sublist to find the last occurrence of
        ArrayList<String> sublist = new ArrayList<>(Arrays.asList( "grapes"));

        // Find the last occurrence of the sublist
        int lastIndex = Collections.lastIndexOfSubList(mainList, sublist);

        System.out.println("Main List: " + mainList);
        System.out.println("Sublist: " + sublist);
        System.out.println("Last occurrence of sublist starts at index: " + lastIndex);

        //unmodifiable list

        ArrayList<String> modifiableList = new ArrayList<>(Arrays.asList("grapes", "lemon"));

        // Create an unmodifiable view of the list
        List<String> unmodifiableList = Collections.unmodifiableList(modifiableList);

        // Print the unmodifiable list
        System.out.println("Unmodifiable list: " + unmodifiableList);

//    unmodifiableList.add("ram");
//        System.out.println(unmodifiableList);

  //synchronized list

        List<Integer> sync=Collections.synchronizedList(Arrays.asList(1,2,3,4));
        System.out.println(sync);
}}