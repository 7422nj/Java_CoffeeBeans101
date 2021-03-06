package Sorting;

import java.util.Arrays;

public class InsertionSort {

     // Insertion Sort is One of the Simpler Sorting Algorithms
    // It Works Considerably Faster on Nearly Sorted and Small Collections (~10 Elements)
   // Example: You have an Array of 4,3,2,1
  // First It Looks At 4, Than It Looks At 3 And See's That 3 is Less Than 4 So 4 will swapped with 3
 // Now our array is 3,4,2,1...
     // Now The Program looks at 2 and Sees that 2 is less than 4 so it swaps 2 with 4
    // Now Our Array is 3,2,4,1
   // The Program than sees that 2 is Also Less Than 3, so it Swaps 2 and 3
  // Now our array is 2,3,4,1
      // Than The Program looks at 1 and than looks the previous number which is 4 so it Swaps 1 and 4
     // Now our array is 2,3,1,4
    // Than The Program looks at the 3 and sees that 1 is less than 3 so it swaps 1 and 3
   // Now our array is 2,1,3,4
  // Than Our Program looks at 2 and sees that it is greater than 1 so it swaps 1 and 2
 // Now our array is 1,2,3,4 <--- Now Our Array Is Sorted ... This Is Insertion Sort

    public static void main(String[] args) {

        // This is Our Array
        int[] array = new int[]{1, 7, 5, 6, 9, 4, 2, 3, 8}; // First It Looks At Our Numbers

        // This Is How Insertion Sort Works:
        // 1. Selects The First Unsorted Element
        // 2. Swaps Other Elements To The Right To Create The Correct Position And Shift The Unsorted Element
        // 3. Advance The Marker To The Right One Element

        insertionSort(array); // Than The Array Is Sent Here To Verify The Operation We Want To Run
        System.out.println(Arrays.toString(array));
    }
    public static void insertionSort(int array[]) {

        // This Condition Let's You Know If The Current Number is Less Than The Previous Number(s)
        for (int j = 1; j < array.length; j++) {


           int current = array[j]; // Selects The First Unsorted Element
            int i = j - 1; // Checks If i is Less Than j

            // This Loop Shifts All The Elements To The Right To Create The Position For Unsorted Element
            while ((i > -1) && (array[i] > current)) { // Looks At If The Current Number Meets The Condition
                array[i + 1] = array[i];
                i--;
            }
            // This Inserts The Unsorted Element To It's Correct Position
            array[i + 1] = current;
        }
    }
}

