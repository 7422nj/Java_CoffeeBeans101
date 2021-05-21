package javaRevision;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.Scanner;

public class JavaDay5 {

    //Try is like trying something
    //doDivision(x/y)
    //Catch will catch the exception and give description why it was not able to execute
    //Catch (Exception e){
    //e.printStackTrace() -> full description of line or error and how and what is wrong (description)

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your monthly salary :");
            double x = scanner.nextDouble();
            System.out.println("Your taxes are : " + doDivision(0.06, x));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("*** Try Again ***");
        } finally {
            System.out.println("Enter salary after taxes :");
            double x = scanner.nextDouble();
            System.out.println("Your yearly salary is : " + yearlySalary(x, 12));
        }
    }

    public static double doDivision(double y, double x) {
        return y / x;
    }

    public static double yearlySalary(double x, double y) {
        return x * y;
    }
}
//
//        try{
//            int x = 10;
//            int y = 2;
//            int total = x/y;
//            System.out.println("Result is : "+total);
//        } catch (Exception e){
//            e.printStackTrace();
//            throw new ArithmeticException("Numbers are not valid");
//            //The Java throw keyword is used to explicitly throw an exception.
//            // We can throw either checked or uncheked exception in java by throw keyword.
//            // The throw keyword is mainly used to throw custom exception.
//        }
////        throw new Exception("Person is not eligible to vote");




