package ArraysTopic;

public class Max {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 45, 5, 6};

        System.out.println(max(arr));


    }

    private static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxVal) {
          maxVal=arr[i];
            }
        }
        return maxVal;
    }
}