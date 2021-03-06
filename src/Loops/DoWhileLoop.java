package Loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        // Our Value
        int i=1;

        // RUN At Least ONCE
        do{
            System.out.println(i);
            i++;

            // If Value Meets Condition
            // Will Run Continuously Until CCondition is Met
        }while(i<=10); //Should Print 1,2,3,4,5,6,7,8,9,10
    }
}
