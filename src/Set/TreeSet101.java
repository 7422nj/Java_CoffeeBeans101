package Set;

import java.util.TreeSet;

// Java TreeSet class implements the Set interface that uses a tree for storage.
// It inherits AbstractSet class and implements the NavigableSet interface.
// The objects of the TreeSet class are stored in ascending order.
//
//The important points about Java TreeSet class are:
//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class is non synchronized.
//Java TreeSet class maintains ascending order.

public class TreeSet101 {
    // TreeSet is a set where the elements are sorted.
    public static void main(String[] args) {

        // 1. Calling the TreeSet Class, We Want To Add String Value To The TreeSet<String>
        // 2. We are giving the ReferenceName iPhoneModel
        // 3. Calling the Constructor of TreeSet Class
        TreeSet<String> iPhoneModel= new TreeSet<>(); // <-- How To Make A TreeSet

        //How To Add To The TreeSet: referenceName.add("add value");
        iPhoneModel.add("12 Pro Max");
        iPhoneModel.add("12 Pro");
        iPhoneModel.add("12");
        iPhoneModel.add("11 Pro Max");
        iPhoneModel.add("11 Pro");
        iPhoneModel.add("11");
        iPhoneModel.add("10");
        iPhoneModel.add("10");
        System.out.println("********************************************************************************");
        System.out.println("iPhone Model List : "+iPhoneModel); // Print the TreeSet
        System.out.println("********************************************************************************");

        //How To Remove Something From TreeSet: referenceName.remove("add value");
        iPhoneModel.remove("11");
        System.out.println("iPhone Model List After Removal of 11 : "+iPhoneModel);// Print After Removal Of "11"
        System.out.println("********************************************************************************");

        // pollFirst() method Retrieves and Removes the First Element of this List
        // Returns Null If this List is Empty.
        iPhoneModel.pollFirst(); // first value will be retrieved than removed from list
        System.out.println("iPhone Model List After pollFirst() : "+iPhoneModel); // Print after pollFirst()
        System.out.println("********************************************************************************");

        // pollLast() method Retrieves and Removes the Last Element of this List
        // Returns Null If this List is Empty.
        iPhoneModel.pollLast(); // last value will be retrieved and removed from list
        System.out.println("iPhone Model List After pollLast() : "+iPhoneModel); // Prints after pollLast()
        System.out.println("********************************************************************************");

        // contains() method is used to check whether the specific set of characters are part of the given string or not.
        // It returns a boolean value true if the specified characters are substring of a given string and returns false otherwise.
        // It can be directly used inside the if statement.
        System.out.println("Does iPhone Model List Contain 12 Pro Max? : "+iPhoneModel.contains("12 Pro Max")); // Prints true or false [is "12 pro max" in the list?]
        System.out.println("********************************************************************************");



        // 1. Calling the TreeSet Class, We Want To Add String Value To The TreeSet<String>
        // 2. We are giving the ReferenceName mobileBrand
        // 3. Calling the Constructor of TreeSet Class
        TreeSet<String> mobileBrand= new TreeSet<>(); // <-- How To Make A TreeSet

        //How To Add To A TreeSet: referenceName.add("add value");
        mobileBrand.add("iPhone");
        mobileBrand.add("google");
        mobileBrand.add("nokia");
        mobileBrand.add("blackBerry");
        mobileBrand.add("samsung");
        mobileBrand.add("condor");
        System.out.println("Mobile Brand List : "+mobileBrand); // Print This List
        System.out.println("********************************************************************************");

    }
}

