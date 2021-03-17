package Loops;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) throws Exception {

        // The Advantage of the ForEachLoop: 1. Eliminates the possibility of bugs 2. Makes the code more readable.
        // It is known as the ForEachLoop because it performs operations on each the elements one by one.

        //Java ArrayList class uses a dynamic array for storing the elements.
        // It is like an array, but there is no size limit. We can add or remove elements anytime.
        // So, it is much more flexible than the traditional array. It is found in the java.util package.
        //The ArrayList in Java can have the duplicate elements also.
        // It implements the List interface so we can use all the methods of List interface here.
        // The ArrayList maintains the insertion order internally.

        //How to Make Object: className reference=new className
        //typeOfClass<dateType> reference=new constructorOfClass<dateType>
        ArrayList<String> list = new ArrayList<String>(); // First We Made An ArrayList

        // Adding To The List
        list.add("George");    //  s=George-prints #0
        list.add("Beenish");  //   s=Beenish-prints #1
        list.add("Syeda");   //    s=Syeda-prints  #2
        list.add("Pritam"); //     s=Pritam-prints #3

        list.remove("Pritam");

        list.add("Azadeh");
        list.add("Pritam");

        //Accessing Every Object Stored In ArrayList and Performing Some Operations
        // 1. So This ForEachLoops See's That There Are 4 Names In The List
        // 2. Than It Prints Names In The List 1 by 1
        for (String s : list) {  // Checks The List 1 by 1

            //Print List 1 by 1
            System.out.println(s);

//===========================================================================================================//

            // How To Get Total Using ForEachLoop
            // ForEachLoop is Performing an Operation 1 by 1
            // Created an Array
            // int arr[]={12,13,14,44};

            // Said total=0;
            // int total=0;

            // Here We Are Telling Them We Want The Total
            // for (int i=arr){
            //for(int i:arr){
            // Add The Numbers in Array 1 by 1
            //total=total+i;

            // Printing The Total
            //System.out.println("Total: "+total);

//=============================================================================================================//

            //How To Print Using ForEachLoop
            //declaring an array
            // ForEachLoop Runs A Operation On a Array One by One
//            int array[] = {12, 13, 14, 44}; // First The Array is Viewed
//            //i=12-prints//i=13-prints//i=14-prints//i=44-prints// 1 by 1
//
//            // Performing Operations in This Instance Verifying All Numbers Inside The Array
//            for (int i : array) {
//
//                //Printing All The Numbers In The Array
//                System.out.println(i);
            }}}
//
//    public static class ForLoopExample {
//            /*
//            For-Loops
//            we use For-Loops only when we know exactly how many times we would like the program to run
//             */
//            public static void main(String[] args) {
//                String firstName="Azadeh ";
//                String lastName=" Tolo";
//                String fullName=firstName+" "+lastName;
//
//                //Initilization; Boolean Condition; increment;
//                for (int i=0;i<10; i++){
//                    System.out.println ("Full Name is : "+fullName);
//                }
//            }
//        }
//}




