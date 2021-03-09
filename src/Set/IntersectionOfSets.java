package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Java HashSet class is used to create a collection that uses a hash table for storage.
// It inherits the AbstractSet class and implements Set interface.
// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.

public class IntersectionOfSets {
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

        // How To do Intersection??
        // Intersection helps you Identify Common Numbers in the Array (Same Numbers Are Identified by Intersection)

        // 1. Called the Set Interface with the dataType <Integer>
        // 2. Called HashSet class using the number1 parameter which is our Array #1
        Set<Integer> intersection = new HashSet<>(number1);

        // The retainAll() method of ArrayList is used to remove all the array list's elements that are not contained
        // In the specified collection or retains all matching elements in the current ArrayList instance
        // That match all elements from the Collection list passed as a parameter to the method.

        //Since intersection already has Array #1's numbers
        //Now we want to Retain All Numbers in Array #2 & Array #1
        intersection.retainAll(number2); //retainAll() is a method already made inside Java

        System.out.println("Intersection of two set " + intersection); // Print after Intersection
    }
}
