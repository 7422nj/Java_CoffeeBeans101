package Loops;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

        // The Advantage of the ForEachLoop: 1. Eliminates the possibility of bugs 2. Makes the code more readable.
        // It is known as the ForEachLoop because it performs operations on each the elements one by one.


        //Creating A ArrayList
        ArrayList<String> list=new ArrayList<String>();

        // Adding To The List
        list.add("George");  // List #0
        list.add("Muniba"); // List #1
        list.add("Syeda"); // List #2

        //Accessing Every Object Stored In ArrayList and Performing Some Operations
        // 1. So This ForEachLoops See's That There ARe 3 Names In The List
        // 2. Than It Prints Names In The List 1 by 1
        for(String s:list){

            // Print List
            System.out.println(s);
        }

    }
//===========================================================================================================//

    // How To Get Total Using ForEachLoop
        // Created an Array
       // int arr[]={12,13,14,44};

         // Said total=0;
        // int total=0;

        // Here We Are Telling Them We Want The Total
        // Add Numbers in Array 1 by 1
        //for(int i:arr){
           // total=total+i;
        }
        // Printing The Total
       // System.out.println("Total: "+total);

//=============================================================================================================//

         // How To Print Using ForEachLoop
        //declaring an array
       //  int arr[]={12,13,14,44};

        //Performing Operations in This Instance Verifying All Numbers Inside The Array
       // for(int i:arr){

       // Printing All The Numbers In The Array
      // System.out.println(i);


