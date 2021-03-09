package Loops;

public class InnerLoops {

    //Inner Loop is a Loop Inside an Another Loop, it is also known as Nested For Loop.
    // The Inner Loop Executes Completely Whenever Outer Loop Executes.

    //*************************************************************************************************//

    // Our Example: i=0,j=0,row=6 (i<row)[Outer Loop] (j<=i)[Inner Loop]

    // i=0,j=0 & j<=i but < 6 rows so it prints 0
    // i=1,j=0 & j<=i but < 6  rows so it prints 0, than it does 1 so j=1,i=1 & i=j but < 6 so it prints
    // i=2,j=0 j<=i  how many times can we run this loop until j is not less than or equal to i?
    // 1=3,j=0 j<=i  how many times can we run this loop until j is not less or equal to i?
    // i=4,j=0 j<=i  how many times can we run this loop until j is not less than or equal to i?
    // i=5,j=0 j<=i  how many times can we run this loop until j is not less than or equal to i?

    //**************************************************************************************************//

    // Our Example: i=0,j=0,row=6 (i<row)[Outer Loop] (j<=i)[Inner Loop]

    //Prints         //Condition

    // 0             i=0,j=0
    // 0,1            i=1,j=0 ! i=1,j=1
    // 0,1,2           i=2,j=0 ! i=2,j=1 ! i=2,j=2
    // 0,1,2,3          i=3,j=0 ! i=3,j=1 ! i=3,j=2 ! i=3,j=3
    // 0,1,2,3,4         i=4,j=0 ! i=4,j=1 ! i=4,j=2 ! i=4,j=3 ! i=4,j=4
    // 0,1,2,3,4,5        i=5,j=0 ! i=5,j=1 ! i=5,j=2 ! i=5,j=3 ! i=5,j=4 ! i=5,j=5

    //***************************************************************************************************//

    public static void main(String[] args) {

        //i for rows and j for columns
        //row is the number of rows you want to print
        int i, j, row = 6;

        //Outer Loop for Rows
        // for(initializing value; boolean condition; incrementing/decrementing){
        for (i = 0; i < row; i++) { // 0,1,2,3,4,5

            //inner loop for columns
            for (j = 0; j <= i; j++) {

                //prints stars
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
}



