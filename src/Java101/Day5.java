package Java101;

import java.util.Arrays;

// Java provides a data structure, The Array, which stores a fixed-size sequential collection of elements of the same type.
// An array is used to store a collection of data
// But it is often more useful to think of an array as a collection of variables of the same type.
//
// Array can contain primitives (int, char, etc.) as well as object (or non-primitive) references of a class
// Depending on the definition of the array.
// In case of primitive data types, the actual values are stored in contiguous memory locations.
// In case of objects of a class, the actual objects are stored in heap segment.
//
// One-Dimensional Arrays :
// The general form of a one-dimensional array declaration is:
// type variable-name[];
// OR
// type[] variable-name;
//
// An array declaration has two components: the type and the name.
// Type declares the element type of the array.
// The element type determines the data type of each element that comprises the array.
//
// Both Of These Are Valid Declarations:
//int intArray[];
//or int[] intArray;
//
//How to do it for every dataType:
//byte byteArray[];
//short shortsArray[];
//boolean booleanArray[];
//long longArray[];
//float floatArray[];
//double doubleArray[];
//char charArray[];
//
// An Array of References to Objects of the Class MyClass (a class created by user)
// MyClass myClassArray[];
//
//  Object[]  ao,        // array of Object
// Collection[] ca;     // array of Collection
//                     // of unknown type
//
//
// Instantiating an Array in Java:
//
// When an array is declared, only a reference of array is created.
// To actually create or give memory to array
// You create an array like this:The general form of new as it applies to one-dimensional arrays appears as follows:
//
// var-name = new type [size];
//
// Here, type specifies the type of data being allocated
// Size specifies the number of elements in the array
// Var-name is the name of array variable that is linked to the array.
// That is, to use new to allocate an array, you must specify the type and number of elements to allocate.
//
// For Example:
//
// int intArray[];           // Declaring Array
// intArray = new int[20];  // Allocating Memory To Array
//
// OR
//
// int[] intArray = new int[20]; // Combining Both Statements In One

public class Day5 {
    public static void main(String[] args) throws Exception {

        //How Make Arrays:
        int x;
        //Option 1
        int[] nums = new int[5]; // Array with 5 Rows
        nums[0] = 5; // Index 0=5
        nums[1] = 4; // Index 1=4
        nums[2] = 3; // Index 2=3
        nums[3] = 2; // Index 3=2
        nums[4] = 1; // Index 4=1

        // We Want To Pick And See Value of Something in Our Array
        System.out.println("Length of the Array is " + nums.length); // This Will Print The Length of The Array
        System.out.print("Index 2's Value is " + nums[2]); // This Will Print Index 2 of The Array
        System.out.println();
        System.out.println("Max Number is " + Arrays.stream(nums).max()); // This Will Print Maximum Number in Array
        System.out.println("Lowest Number is " + Arrays.stream(nums).min()); // This Will Print Lowest Number in Array
        System.out.println("Object's Memory Address is " + nums.hashCode()); // This Gives a Distinct Hash Code Which is This Code's Unique ID Address

        //Option 2
        int[] num = {12, 3, 41, 30, 23, 8}; // Created an Array

        System.out.println("Index 1's Value is " + num[1]);


    }

}
