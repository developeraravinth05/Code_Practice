package Arrays;

import java.util.Arrays;

public class SwapAndReverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void reverse(int[] arr) {
  int startIndex=0;
  int endIndex=arr.length-1;
  while (startIndex<endIndex){

      swap(arr,startIndex,endIndex);
      startIndex++;
      endIndex--;
  }

    }

    //first we store index1 in var1 and we are saying index1 = index2 which will be the value in
    //index 1
    private static void swap(int[] arr, int index1, int index2) {
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;

    }

}
