package ExtraExercises;

import java.util.Scanner;

public class ArithmeticScannerAndSwitch {


    public static void main(String[] args) {

            int number1, number2; //Created Variables To Use

            char operator; //Created char variable with the name Operator

            Scanner sc = new Scanner(System.in); //imported a Scanner

            System.out.println(" Please Enter two values to perform Arithmetic Operations "); //Question/Command

            number1 = sc.nextInt(); // We want to be able to enter an integer in our scanner [number 1]
            number2 = sc.nextInt(); // We want to be able to enter another integer in our scanner [number 2]

            System.out.println(" Please select any ARITHMETIC OPERATOR You wish!\n"); //Second Question/Command

            operator = sc.next().charAt(0); // we want to be able to enter a char value in our scanner
            //Once you enter the char value it will be matched with the case according to what you enter

            switch (operator) { // our restaurant food menu has operators

                case '+':  //food menu option 1
                    System.out.format("Addition of two numbers is: %d", number1 + number2); //number1 plus number2
                    break; //make this a independent case. if true, pick than close program

                case '-': //food menu option 2
                    System.out.format("Subtraction of two numbers is: %d", number1 - number2); //number1 minus number2
                    break; //make this a independent case. if true, pick than close program

                case '*':
                    System.out.format("Multiplication of two numbers is: %d", number1 * number2);
                    break;
                case '/':
                    System.out.format("Division of two numbers is: %d", number1 / number2);
                    break;
                case '%':
                    System.out.format("Module of two numbers is: %d", number1 % number2);
                    break;

                default: //if none of the operators on the menu are entered than print
                    System.out.println("You have entered the Wrong operator\n");
                    System.out.println("Please enter the Correct operator such as +, -, *, /, %%");
                    break;
            }
        }
    }

