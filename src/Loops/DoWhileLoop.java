package Loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        // Our Starting Value
         int i=25; // Initializing A Value of i  //#1 Step


        do{ // RUN At Least ONCE

            System.out.println(i+" : i "); // print values of i //#2 Step

            i--; // increment //#3 Step

            // If Value Meets Condition
            // Will Run Continuously Until Condition is Met
        }while(i==1 || i>10); //Should Print 1,2,3,4,5,6,7,8,9,10 //#4 Step
    }
}
