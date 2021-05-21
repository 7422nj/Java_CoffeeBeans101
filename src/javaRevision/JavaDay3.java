package javaRevision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaDay3 {

    //Loops Review

    //If Else
    public static void main(String[] args) {

//        //initialized value of num
//        int num = 5;
//
//        //if(num is greater then 8) -> only then will it work/print
//        if(num>8){ //boolean condition
//            System.out.println("The condition is true");
//
//        } else {//if condition is not met then will it do this step
//            System.out.println("The Condition is false");
//        }

        ////////////////////////////////////////////////////////////////////////////////////////

        //variables
//        int a = 5;
//        int b = 5;
//
//        //if a is equal to b
//        if(a==b){
//            System.out.println("numbers are equal");
//
//        //if numbers are not equal
//        }else{
//            System.out.println("numbers are not equal");
//        }

        //////////////////////////////////////////////////////////////////////////////////

        //While loop
//        int age = 20; //-> initialized value of age = 20
//
//        //while loop condition which will check if age is less then 18
//        while(age>18){
//            System.out.println(age+" : This person is elible for voting");
//
//            //decrementing -> will order in decreasing order / backwards (ex.5,4,3,2,1)
//            age--;
//        }

        //////////////////////////////////////////////////////////////////////////////////

        //Do While Loop
//        int age = 10; //->initialize value
//
//        //this will run atleast once per loop
//        do{
//            System.out.println(age+" : This persion is a child");
//
//            //incrementing -> increasing order (ex. 1,2,3,4,5)
//            age++;//will say if you want to print it in incrementing or decrementing order
//
//        //while age is less then 14
//        } while (age<14); //-> give a boolean condition


        /////////////////////////////////////////////////////////////////////////////////////

        //For Loop
//        for(int age = 10; age < 14; age++){
//            System.out.println(age+" : This person is a child");


        //////////////////////////////////////////////////////////////////////////////////////

        //if else if else -> Grade Sheet
//        int grade = 70;
//
//        //if grade is greater than or equal to 90 -> A Grade
//        if (grade>=90) {
//            System.out.println("Student's grade is A");
//
//        // or else if the grade is less than 85
//        } else if (grade>=80) {
//            System.out.println("Student's grade is B");
//
//        //if grade is greater than 68 than student's grade is C
//        } else if (grade>=70){
//            System.out.println("Student's grade is C");
//
//        //else the student's grade is failure
//        } else {
//            System.out.println("Student Fails");
//        }

        //////////////////////////////////////////////////////////////////////////////////////

        //Nested If Else
        int age;

        //Created object of Scanner/Imported Class
        Scanner scan = new Scanner(System.in);

        //First Step/Question in Terminal for Scanner
        System.out.println("Please Enter Your Age  :");

        //Asking to allow to enter int input and after getting input -> send value to int age;
        age = scan.nextInt();

        //If age is less then 18 -> not able to work
        if (age < 18){
            System.out.println("You are not eligible to work");

        //If age is greater than or equal to 18 and if age is less then or equal to 60 -> able to work
        } else if (age >= 18 && age <= 60){
            System.out.println("You are eligible to work");

        //Or else apply for retirement package
        } else {
            System.out.println("Please apply for retirement package");
        }




        }

    }




