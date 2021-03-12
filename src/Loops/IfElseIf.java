package Loops;

//
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

import java.util.Scanner;

public class IfElseIf {
    // Else if means another If or adding more condition

    public static void main(String[] args) {

        //This Will Run The Scanner
        IfElseIf.retirementCalculator();
    }

    //Created A Method
    public static void retirementCalculator(){

        //Created A Scanner
        Scanner input= new Scanner(System.in);

        // First Input Asks for Age:
        System.out.println("Enter your Age : ");
        int age= input.nextInt();

        // If Age is less than or equal to 24 || less than or equal to 40 = "Your age is more/less than 24"
        if (age <= 24 || age <= 40){
            System.out.println("Your age is more/less than 24");

            // If Age is greater than or equal to 40 || if age is less than or equal to 50 = "Your age is more than 40"
        } else if ( age > 45 || age <53){
            System.out.println("Your age is more than 40");

            // If Age is greater than or equal to 50 || if age is less than or equal to 60 = "Your age is more than 50"
        } else if (age >=50 || age <=60){
            System.out.println("Your age is more than 50");

            // If Age is greater than or equal to 60 || if age is less than or equal to 65 = "Your age is more than 40"
        } else if (age>=60 || age <=65){
            System.out.println("Your age is more than 60");

            // If Age is Greater than 65 Than it Will Print = "Its your Retirement Time"
        } else {
            System.out.println("Its your Retirement Time");
        }
    }
}
