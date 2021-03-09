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

class TreeSet102{
    public static void main(String args[]){

        // 1. Calling the TreeSet Class, We Want To Add Integer Value To The TreeSet<Integer>
        // 2 ReferenceName is set
        // 3. Calling the Constructor of TreeSet Class
        TreeSet<Integer> set=new TreeSet<Integer>();  // <--- How To Make A TreeSet

        //How To Add To A TreeSet: referenceName.add("add value");
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);

        //Retrieves and Removes First (Lowest) Element or Returns Null If Set is Empty
        System.out.println("Highest Value: "+set.pollFirst()); //Prints After pollFirst()

        //Retrieves and Removes Last (Highest) Element or Returns Null If Set is Empty
        System.out.println("Lowest Value: "+set.pollLast()); //Prints After pollLast()
    }
}
