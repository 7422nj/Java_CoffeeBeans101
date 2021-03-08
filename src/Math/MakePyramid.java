package Math;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        int rows = 5, k = 0;

        // Outer Loop
        for (int i = 1; i <= rows; ++i, k = 0) {

            //Inner Loop
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print(" *");
                ++k;
            }

            System.out.println();


        }  System.out.println("-*****Pyramid*****-");
    }
    public static int pyramid(int i) {
        return i=20;
    }
}
