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
            int i = 0; // i = 1 is our value to start with
            //  0<6=true prints, 1<6=true prints,2<6=true prints,3<6=true prints,4<6=true prints,5<6=true prints.. 6<6=false ends

            // boolean condition
            while (i < 6) {  // if i is less than 6

                System.out.println("Azadeh"); // than print hello world

                // increment++; 1,2,3,4,5 <> decrement--; 5,4,3,2,1
                i++;
            }
        }
    }
}

