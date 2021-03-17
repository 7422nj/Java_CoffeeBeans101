package Challenges.MinutesToSeconds;

import java.util.Scanner;

public class MinutesToSecondsScanner {

        static int min,sec; // created variables

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); //made an object of scanner class/imported scanner class <- allow input

        System.out.println("Enter Minutes : ");// enter amount of minutes according to your choice

        min=sc.nextInt(); //nextInt scans what you enter into the scanner's question <- sends value to int min

        sec=min*60; // min (total amount of minutes) multiplied by 60 seconds

        System.out.println("Seconds = "+sec); // print total amount of seconds in a minute

    }
}
