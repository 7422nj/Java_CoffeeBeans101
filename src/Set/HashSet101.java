package Set;

import java.util.HashSet;
import java.util.Set;


public class HashSet101 {
    // Set is an interface which extends collection. it is an un order collection of objects in which
    // duplicate values can not be stored

    // Set is implemented by HashSet, LinkedHashSet or UseTreeSet

    // A Set is a set of values which is not allowed duplicate elements. its a parent interface of all
    // set classes like TreeSet, HashSet.
    // A HashSet is set where elements are not sorted or ordered. it is faster than a TreeSet.

// Set is an interface which extends collection. it is an un order collection of objects in which
    // duplicate values can not be stored

    // Set is implemented by HashSet, LinkedHashSet or UseTreeSet

    // A Set is a set of values which is not allowed duplicate elements. its a parent interface of all
    // set classes like TreeSet, HashSet.
    // A HashSet is set where elements are not sorted or ordered. it is faster than a TreeSet.

    public static void main(String[] args) {

// Java HashSet class is used to create a collection that uses a hash table for storage.
// It inherits the AbstractSet class and implements Set interface.
// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.

        // A set  into a hashSet
        Set<String> mobileBrand = new HashSet<>();

        //How to Add to the hashSet
        mobileBrand.add("iPhone");
        mobileBrand.add("google");
        mobileBrand.add("nokia");
        mobileBrand.add("blackBerry");
        mobileBrand.add("samsung");
        mobileBrand.add("condor");

        System.out.println("Size of the set is : "+mobileBrand.size()); // Prints size of hashSet
        System.out.println("Object's Memory Address is : "+mobileBrand.hashCode()); // Print's Object's Memory Address


        //Print the HashSet
        System.out.println(mobileBrand);

        //removes nokia
        mobileBrand.remove("nokia");
        //prints after nokia is removed
        System.out.println("After remove" + mobileBrand);

        mobileBrand.add("Furqan"); // Adds Furqan to the HashSet

        //By using contains, we are asking if this set has "samsung" in it
        System.out.println(mobileBrand.contains("samsung")); //True or False, HashSet Contains "samsung"?
        //True or False, HashSet Contains "iPhone"?
        System.out.println("Does this set contain iPhone? "+mobileBrand.contains("iPhone"));
        System.out.println("Was Furqan added to the set? "+mobileBrand.add("Furqan")); //True or False was it added?
        System.out.println("First Name in Set is : "+mobileBrand.stream().findFirst()); //Finds first in line in HashSet


    }

}


