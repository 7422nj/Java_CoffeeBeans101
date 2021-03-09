package Loops;

// The if statement alone tells us that if a condition is true it will execute a block of statements
// If the condition is false it won’t.
// But what if we want to do something else if the condition is false.
// Here comes the else statement.
// We can use the else statement with if statement to execute a block of code when the condition is false.
//
// Syntax:
// if (boolean condition){
//     // 1. Condition is true
//    //  2. Executes this if block
// }else{
//      // 1. Condition is false
//     //  2. Executes this else block
//}

public class IfElse {

    public static void main(String args[]) // Main Method
    {
        // Initializing A Value
        int i = 10;

        // Boolean Condition Checks If i is Less Than 15
        if (i < 15) // if this statement is true than it Prints = "i is smaller than 15"
            System.out.println("i is smaller than 15");

        else // if the statement above is not true than it Prints = "i is greater than 15"
            System.out.println("i is greater than 15");
    }
}

