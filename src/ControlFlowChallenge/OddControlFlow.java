package ControlFlowChallenge;

import java.util.Scanner;

public class OddControlFlow {
    // write a control flow program that prints only even numbers from 1-100, inclusive

    public static void main(String[] args) {

        int number, i;
        // Created scanner
        Scanner sc = new Scanner(System.in);

        // At this point you can enter any amount to proceed with
        System.out.print(" Please Enter Any Number : ");
        number = sc.nextInt();{

        }
        // initializing i and giving it the value 1;
        // conditioning than i must be less than or equal to number;
        // we don't want an infinite loop, but we do want the order of print to be in increment(increasing order)
        for (i = 1; i <= number; i++) {

            //logic to check if the number is odd or not
            //if i%2 is not equal to zero, the number is odd
            if (i%2!=0) {

                // \t is a tab
                System.out.print(i + "\t");{

                }

            }
        }
    }}

