package Loops;

public class InnerLoops {
    public static void main(String[] args) {
        //i for rows and j for columns
        //row denotes the number of rows you want to print
        int i, j, row = 6;
        //outer loop for rows
        // for(initializing value; condition; incrementing/decrementing){
        for (i = 0; i < row; i++) { // 0,1,2,3,4,5
            //inner loop for columns
            for (j = 0; j <= i; j++) {
                //prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
        //0
        //0,1
        //0,1,2
        //0,1,2,3
        //0,1,2,3,4
        //0,1,2,3,4,5
    }
}



