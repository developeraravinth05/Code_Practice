import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "BBCCCCBBBBB";


        char longestChar = str.charAt(0);
        int longestCount = 0;
        int currentCount = 1;
        int longestStartIndex = -1;
        int currentStartIndex = 0;


        // iterte through the string to find longest char
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentCount++; //increment here
            } else
            {    if (currentCount > longestCount) {
                longestCount = currentCount;
                longestStartIndex = currentStartIndex;
            }
            currentCount = 1;  //Rest count for new char
            currentStartIndex = i;
        }
    }

            //final check for the last char
        if (currentCount>longestCount){
        longestCount=currentCount;
    longestStartIndex =currentStartIndex;
        }


if (longestCount>1){
    System.out.println("start index" + longestStartIndex);
    System.out.println("longest count "+  longestCount);

}
else
    System.out.println(" no continous is print ");
        System.out.println(longestChar);

//         Map<Character,Integer> occurence = new HashMap<>();
//         // count the occurence of each character
//         for(char c :str.toCharArray()){
//         occurence.put(c, occurence.getOrDefault(c ,0)+1);
//
//         }
//
//         // print
//        for (Map.Entry<Character ,Integer> entry:occurence.entrySet()) {
//        System.out.println(entry.getKey()+":"+entry.getValue());
//        }


    }

}
