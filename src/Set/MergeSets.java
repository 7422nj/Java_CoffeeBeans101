package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Java HashSet class is used to create a collection that uses a hash table for storage.
// It inherits the AbstractSet class and implements Set interface.
// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.

public class MergeSets {
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

        // How To Do Union Set??

        // 1. Called the Set interface with the dataType <Integer>
        // 1. Called HashSet class using the number1 parameter which is our Array #1
        Set<Integer> union = new HashSet<>(number1); // Now Union has all Values of Array #1

        //We are saying I want to Add All numbers in Array #2 to Union, which already has all numbers of Array #1
        union.addAll(number2); // By doing this We create a Union with Array #2 and Array #1

        System.out.println("Union of two set " + union); //Print the Array After Union

    }
}
