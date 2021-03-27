package FridayPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Arrays {

    public static void main(String[] args) {

        Queue<String> Names = new LinkedList <>();

        Names.add("Beenish");
        Names.add("Taniya");
        Names.add("Pritam");


        System.out.println("List of names: "+Names);

        System.out.println(Names.element()); //Looks at the head of the list. Throws exception if list is empty
        System.out.println(Names.peek()); //Looks at the head of the list and returns null if empty
        Names.remove("Pritam"); //Removes head of the queue, returns throws exception if it is empty
        Names.poll(); //Removes head of the queue, returns null if it is empty
        System.out.println(Names.contains("Beenish"));  //Checks if element in the list exists, returns true or false

        Names.add("Pritam");
        Names.add("Beenish");


        System.out.println(Names.size());


    }


}
