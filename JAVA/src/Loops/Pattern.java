package Loops;

public class Pattern {
    public static void main(String[] args) {

        pattern5B(5);
        System.out.println();
        pattern6(5);
    }

    //pattern1
    public static void pattern1(int n) {
        //step 1 print thr row
        for (int row = 0; row < n; row++) {
            //step 2 print columns
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern 2
    public static void pattern2(int n) {
        //step 1 print thr row
        for (int row = 0; row <= n; row++) {
            //step 2 print columns
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern 3
    public static void pattern3(int n) {
        //step 1 print thr row
        for (int row = 0; row <= n; row++) {
            //step 2 print columns
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern 4
    public static void pattern4(int n) {
        //step 1 print thr row
        for (int row = 1; row <= n; row++) {
            //step 2 print columns
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    //pattern 5
    public static void pattern5(int n) {
        //step 1 print thr row
        for (int row = 1; row <= n * 2; row++) {
            //step 2 print columns
            int totalColumns = row > n ? 2 * n - row : row;
//            int totalColumns = n - Math.abs(n - row);
            for (int col = 1; col <= totalColumns; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    // patter 5 way 2
    public static void pattern5B(int n) {
        //step 1 print thr row
        for (int row = 1; row <= n; row++) {
            //step 2 print columns
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            //step 2 print columns
            for (int col = 1; col <= n - row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    //pattern6
    public static void pattern6(int n) {
        //step 1 print thr row
        for (int row = 1; row <= n * 2; row++) {

            int totalColumns = row > n ? 2 * n - row : row;
            int spaces = n - totalColumns;

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColumns; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}

