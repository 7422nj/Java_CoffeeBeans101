package Sorting;

//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
//if they are in wrong order.

//Example:
//First Pass:
//( [5]?[1] 4 2 8 ) –>   ( [1]<->[5] 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
//( 1 [5]?[4] 2 8 ) –>   ( 1 [4]<->[5] 2 8 ), Compares Again than Swap since 5 > 4
//( 1 4 [5]?[2] 8 ) –>   ( 1 4 [2]<->[5] 8 ), Compare Again than Swap since 5 > 2
//( 1 4 2 [5]?[8] ) –>   ( 1 4 2 [5]<->[8] ), Now, since these elements are already in order (8 > 5), algorithm stops
//
//Algorithm Checks if array is sorted and if not sorted than it swaps
//
//Second Pass:
//( [1] [4] 2 5 8 ) –>  ( [1] [4] 2 5 8 )
//( 1 [4]?[2] 5 8 ) –>  ( 1 [2]<->[4] 5 8 ), Swap since 4 > 2
//( 1 2 [4] [5] 8 ) –>  ( 1 2 [4] [5] 8 )
//( 1 2 4 [5] [8] ) –>  ( 1 2 4 [5] [8] )
//
//Now, the array is already sorted, but our algorithm does not know if it is completed.
// The algorithm needs one whole pass without any swap to know it is sorted.
//
//Third Pass:
//( [1] [2] 4 5 8 ) –> ( [1] [2] 4 5 8 )
//( 1 [2] [4] 5 8 ) –> ( 1 [2] [4] 5 8 )
//( 1 2 [4] [5] 8 ) –> ( 1 2 [4] [5] 8 )
//( 1 2 4 [5] [8] ) –> ( 1 2 4 [5] [8] )

public class BubbleSort {

    // Main Method
    public static void main(String[] args) {

        //Array
        int[] num = {54, 93, -32, 106, 17, 3, 42, 81, 167, 10};

        int[] sortedArray = sortArray(num);

        // use x to identify the numbers in the array
        for (int x : sortedArray) {

            //print list by using x
            System.out.print(x + "\t");
        }
    }

    // Bubble Sort
    public static int[] sortArray(int[] array) {
        int temp;

        // i equals 0, if i is less than the length of the array than print
        for (int i = 0; i < array.length; i++) {

            // j equals i plus 1; if j less than array length than print
            for (int j = i+1; j < array.length; j++) {

                // if array[1] is greater than array[j]
                if (array[i] > array[j]) {

                    // than temp equals array[i]
                    temp = array[i];

                    // array[i] equals array[j]
                    array[i] = array[j];

                    // now our array is swapped and everything is moved into temp
                    array[j] = temp;
                }
            }
        }
        // return/print the array
        return array;
    }
}
