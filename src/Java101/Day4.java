package Java101;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {

        // className is Scanner
        // how to create an object of Scanner class?

        // className objectName =new constructorOfClass();
        Scanner input = new Scanner(System.in);
        //Enter firstName
        System.out.println("Enter your first name"); //Prints
        String firstName = input.nextLine(); // This runs the program so you can enter String Value
        System.out.println("First Name : " + firstName);//Prints

        //Enter lastName
        System.out.println("Enter your last name");//Prints
        String lastName = input.nextLine(); // This runs the program so you can enter String Value
        System.out.println("Last Name : " + lastName);//Prints

        //Print Full Name
        System.out.println("Full Name : " + firstName + " " + lastName);//Prints

        //Enter Course Fee
        System.out.println("Enter Course Fee");//Prints
        double cFee = input.nextDouble(); // Enter a double value for example 1500.76
        System.out.println("Course fee is " + cFee);//Prints

        //Enter Age
        System.out.println("Enter your age");//Prints
        int age = input.nextInt(); // This allows you enter an int for age
        System.out.println("My Age is " + age);//Prints


        // To Close Scanner
        input.close();

    }
}
