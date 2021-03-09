package Loops;

// if: if statement is the most simple decision making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
// Syntax:
// if(condition)
//{
// If Condition is True Than Statement Executes
//}
//
// Here, condition after evaluation will be either true or false.
// if statement accepts boolean values – if the value is true then it will execute the block of statements under it.
// If we do not provide the curly braces ‘{‘ and ‘}’ after if( condition )
// Then by default if statement will consider the immediate one statement to be inside its block.
//
// For Example:
// if(condition)
//   statement1;
//   statement2;
//
// Here if the condition is true, if block will consider only statement1 to be inside its block.
//

public class If {
    public static void main(String args[]) // Main Method
    {
        // Initialized The Value
        int i = 5; // <-- i equals 10

        // Boolean Condition <-- if the initialized value is greater than 15 than print = "Value is Greater than 15"
        if (i > 15)
            System.out.println("Value is Greater than 15");

        // Boolean Condition <-- if the initialized value is less than 15 than print = "Value is Less than 15"
        if (i < 15)
            System.out.println("Value is Less than 15");
    }
}

