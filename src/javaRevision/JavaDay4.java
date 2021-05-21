package javaRevision;

import java.util.*;

public class JavaDay4 {

    public static void main(String[] args) {

//        //Queue -> a line
//        Queue<String> names = new LinkedList<>();
//        names.add("Beenish");
//        names.add("Anaam");
//        names.add("Nabila");
//        names.add("Anjuman");
//        names.add("Taniya");
//        names.add("Pritam");
//
//        for (String stName : names){
//            System.out.println("Student's Name is : "+stName);
//        }
//
//        //How to Remove A Element from the Queue or Head of Queue -> throws exceptions if empty
//        names.remove("Pritam");
//        System.out.println(names+" -> After Remove");
//
//        //Removes the first element from the queue -> returns null if empty
//        names.poll();
//        System.out.println(names+" -> After poll");
//
//        //Checks first one in the queue -> returns null if empty
//        System.out.println(names.peek()+" -> After Peek");
//
//        //Checks first one in the queue -> if empty throws an exception
//        System.out.println(names.element()+ " -> After Element");
//
//        //Offer also allows you to add an element to the queue -> throws exception if not able to add
//        names.offer("Sami"); //-> throws class cast exception if not able to add
//        names.add("Sheikh"); //-> illegal statement exception if not able to add
//        System.out.println(names+ " -> After Offer + Add");

        //PriorityQueue
//        PriorityQueue<String> productList = new PriorityQueue<>();
//        productList.add("t-shirts");
//        productList.add("shoes");
//        productList.add("pants");
//        productList.add("belts");
//        productList.add("suits");
//        productList.add("jacket");
//
//        System.out.println(productList.peek());
//        productList.remove("shoes");
//        System.out.println(productList+" -> After Remove");

        ////////////////////////////////////////////////////////////////////////////////////

//        PriorityQueue<Integer> productId = new PriorityQueue<>();
//        productId.add(201);
//        productId.offer(202);//allows to add into the queue -> if capacity is allowing it to
//        productId.add(203);
//        productId.add(204);
//
//        //How to Look at head of queue
//        System.out.println(productId.element()+ " -> After Element");//-> throws exception if empty
//        System.out.println(productId.peek()+ " -> After Peek");//-> returns null if empty
//
//        //How to remove element from queue
//        //returns exception if empty
//        productId.remove(202); //-> removes head of queue -> to remove one particular element place data in ()
//        productId.poll();//-> only removes head of queue -? return null if empty
//
//        //Checks size of the queue
//        System.out.println(productId.size()+ " -> Size of Queue");

        ///////////////////////////////////////////////////////////////////////////////////////////

        //Stack
//        Stack<String> clothingList = new Stack<>();
//        clothingList.push("t-shirts"); //-> adds to head of queue
//        clothingList.add("suits"); //-> adds to tail of queue
//        clothingList.push("hat");
//        clothingList.push("gloves");
//        clothingList.push("boots");
//        clothingList.push("newItems");
//
//        //Removes head of queue
//        clothingList.pop();
//        System.out.println(clothingList+ " -> After Pop");
//
//        //Removes element of choice or else head of queue
//        clothingList.remove("hat");
//        System.out.println(clothingList+ " -> After Remove");
//
//        clothingList.addElement("news");
//        clothingList.search(3);

        ///////////////////////////////////////////////////////////////////////////////////////////////

        //Stack example #2
//        Stack<String> fruits = new Stack<>();
//        fruits.add("apple");//-> adds on  bottom of list
//        fruits.push("pineapple");//-> adds to head of list
//        fruits.addElement("grapes");//-> adds to bottom of list
//        fruits.add(2,"oranges");//-> adds to a certain index of the list
//
//        //removes a certain element from list or else the head of queue
//        fruits.remove("grapes");
//        fruits.pop(); //-> removes head of queue
//
//        //looks at head of stack
//        fruits.peek();
//        fruits.search(1);//-> search according to index

        ///////////////////////////////////////////////////////////////////////////////////////////////

        //Set
//        Set<String> mobileBrands = new HashSet<>();
//        mobileBrands.add("Apple");
//        mobileBrands.add("Samsung");
//        mobileBrands.add("Nokia");
//        mobileBrands.add("LG");
//        mobileBrands.add("Google");
//        mobileBrands.add("Google"); //set can not have duplicate items
//        mobileBrands.add(""); // set can only have one null value
//        mobileBrands.add("");
//
//        System.out.println(mobileBrands);
//        //checks if item is in the set -> returns true or false
//        System.out.println(mobileBrands.contains("Google")+" : Contains item");

        /////////////////////////////////////////////////////////////////////////////////////

        //TreeSet
//        TreeSet<String> iphoneModel = new TreeSet<>();
//        iphoneModel.add("12 pro");
//        iphoneModel.add("12");
//        iphoneModel.add("11 pro");
//        iphoneModel.add("12 pro max");
//
//        System.out.println(iphoneModel);
//        iphoneModel.remove("12");//->removes certain item or head of treeset
//        iphoneModel.pollFirst();//->removes first in set
//        iphoneModel.pollLast();//->removes last in set

        //////////////////////////////////////////////////////////////////////////////////////

        //Union Set/Merging Two Sets or Arrays
        int[] num1 = {1,4,5,6,36,7,12,66,24};
        int num2[] = {2,7,4,8,12,79,44,102};

        Set<Integer> number1 = new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[] {1,4,5,6,36,7,12,66,24}));

        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[] {2,7,4,8,12,79,44,102}));

        //To do union set
        Set<Integer> union = new HashSet<>(number1);
        union.addAll(number2);

        System.out.println("Union of set : "+union);

        //Difference of Set
        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2);//-> removes not common values in the two sets
        System.out.println("Difference is : "+difference);

        //To Do Intersection
        Set<Integer> intersection = new HashSet<>(number1);
        intersection.retainAll(number2);//->removes all values that are commmon in the two sets
        System.out.println("Intersection is : "+intersection);







    }
}
