package ControlFlowChallenge;

import java.util.Scanner;

public class EvenControlFlow {
    public static void main(String[] args) {

        int number, i;
        // Created scanner
        Scanner sc = new Scanner(System.in);

        // At this point you can enter any amount to proceed with
        System.out.print(" Please Enter Any Number : ");
        number = sc.nextInt();


        for(i = 1; i <= number; i++)
        {
            // In Java Programming, we have a % (Module) Arithmetic Operator to check the remainder.
            // If the remainder is 0, then the number is even.
            if(i % 2 == 0)
            {
                // \t is a tab
                System.out.print(i +"\t");
            }
}}}
