package Loops;

public class NestedIfElseIf {

    // if-else-if ladder: Here, a user can decide among multiple options.
    // The if statements are executed from the top down.
    // As soon as one of the conditions controlling the if is true
    // The statement associated with that if is executed and the rest of the ladder is bypassed.
    // If none of the conditions is true, then the final else statement will be executed.
    //
    // For Example:
    //
    // if (condition)
    //    statement;
    // else if (condition)
    //    statement;
    // else
    //    statement;

    public static void main(String args[]) // Main Method
    {
        int i = 32; // Initializing A Value

        if (i < 10) // Boolean Condition <--True or False (If True Than Print Pizza)
            System.out.println("Pizza");

        else if (i < 20) // Boolean Condition <--True or False (If True Than Print Burger)
            System.out.println("Burger");

        else if (i < 30) // Boolean Condition <--True or False (If True Than Print Pasta)
            System.out.println("Pasta");

        else // If Number Does Not Match The Condition Than Run This As A Last Option
            System.out.println("Food Dish Is Not Available");
    }
}
