package Loops;

public class WhileLoop {

    //While Loop is a control flow code that can be executed (infinitely) based on a given Boolean condition.
    //The while loop can be thought of as a repeating if statement.

    // *** While Loop Example ***
    // int loop=0;
    // while (boolean condition){
    // loop++; or loop--;

    public static void main(String[] args) {
        {
            // Starting Value
            int i = 1; // i = 1 is our value to start with
            //  1,2,3,4,5

            // condition
            while (i < 6) {  // if i is less than 6

                System.out.println("Hello World"); // than print hello world

                // increment
                i++;
            }
        }
    }
}

