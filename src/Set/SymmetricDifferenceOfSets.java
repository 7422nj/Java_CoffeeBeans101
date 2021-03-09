package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Java HashSet class is used to create a collection that uses a hash table for storage.
// It inherits the AbstractSet class and implements Set interface.
// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.

public class SymmetricDifferenceOfSets {

    public static void main(String[] args) {

        int num1[] = {1, 4, 5, 7, 12, 24, 66, 56, 78};
        int num2[] = {2, 7, 4, 8, 12, 79, 44, 102, 203, 304};


        // 1. Calling Set Interface, By using the Integer dataType
        // 2. Giving it a referenceName number1 = new ConstructorOfClass [ in this instance our class is HashSet Class]
        Set<Integer> number1 = new HashSet<>();

        //Adding All Numbers from Array #1 to a List
        number1.addAll(Arrays.asList(new Integer[]{1, 4, 5, 7, 12, 24, 66, 56, 78})); //These are the numbers in the List

        //Adding All Numbers from Array #2 to a List
        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{2, 7, 4,  8, 12, 79, 44, 102, 203, 304})); //These are the numbers in the list

        // How To Do Symmetric Difference??

        // 1. Called the Set interface with the dataType <Integer>
        // 1. Called HashSet class using the number1 parameter which is our Array #1
        Set<Integer> difference = new HashSet<>(number1);

        //Difference already has All the Numbers in Array #1
        //Now Difference looks at All the Numbers in Array #2
        //Checks for Similar Numbers, Than Removes Similar Numbers in Array #1 & Array #2
        difference.removeAll(number2); //This removeAll() method is already a method made inside Java
        //RemoveAll() Method looks at numbers that are the same in the two Arrays than removes the Same Numbers, than prints

        System.out.println("After Difference Array #1 Has : " + difference);//Prints Array #1 After Same Numbers Are Removed


        // 1. Called the Set interface with the dataType <Integer>
        // 1. Called HashSet class using the number1 parameter which is our Array #2
        Set<Integer> difference2 = new HashSet<>(number2);

        //Difference already has All the Numbers in Array #2
        //Now Difference looks at All the Numbers in Array #1
        //Checks for Similar Numbers, Than Removes Similar Numbers in Array #1 & Array #2
        difference2.removeAll(number1); //This removeAll() method is already a method made inside Java
        //RemoveAll() Method looks at numbers that are the same in the two Arrays than removes the Same Numbers, than prints

        System.out.println("After Difference Array #2 Has : " + difference2);// Prints Array #2 After Same Numbers Are Removed
    }
}