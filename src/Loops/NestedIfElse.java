package Loops;

// nested-if: A nested if is an if statement that is the target of another if or else. Nested if statements means an if statement inside an if statement. Yes, java allows us to nest if statements within if statements. i.e, we can place an if statement inside another if statement.
// Syntax:
// if (condition1)
// {
// Executes when condition1 is true
//   if (condition2)
//   {
// Executes when condition2 is true
//   }
//}

public class NestedIfElse {
    public static void main(String args[])
    {
        int i = 17; // Initializing A Value

        if (i == 0) { // if i is equal to 10 <-- outer loop

            // First if statement
            if (i < 15) // if i is less than 15 than print = "i is smaller than 15" <-- inner loop
                System.out.println("i is less than 15");

            // Nested - if statement
            // Will only be executed if statement above it is true
            if (i < 30) // if i is less than 12 than print = "i is smaller than 12 too" <-- also inner loop
                System.out.println("i is less than 30 too");

        }else{ // if the conditions above are not met than print = "i is greater than 15" <-- also inner loop
                System.out.println("i is less than 30");
        }
    }
}

