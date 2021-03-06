package Sorting;

import java.util.Arrays;

public class QuickSort {

    // QuickSort picks an element as pivot and partitions the given array around the picked pivot.
    // There are many different versions of QuickSort that pick pivot in different ways.
    // 1. Always pick first element as pivot.
    // 2. Always pick last element as pivot (implemented below)
    // 3. Pick a random element as pivot.
    // 4. Pick median as pivot.

    // The key process in quickSort is partition().
    // Target of partitions is, given an array and an element x of array as pivot
    // put x at its correct position in sorted array and put all smaller elements (smaller than x) before x
    // and put all greater elements (greater than x) after x. All this should be done in linear time.


    //arr[] = {10, 80, 30, 90, 40, 50, 70}
    //Indexes:  0   1   2   3   4   5   6
    //
    //low = 0, high =  6, pivot = arr[h] = 70
    //Initialize index of smaller element, i = -1
    //
    //Traverse elements from j = low to high-1
    //j = 0 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
    //i = 0
    //arr[] = {10, 80, 30, 90, 40, 50, 70} // No change as i and j
    //                                     // are same
    //
    //j = 1 : Since arr[j] > pivot, do nothing
    //// No change in i and arr[]
    //
    //j = 2 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
    //i = 1
    //arr[] = {10, 30, 80, 90, 40, 50, 70} // We swap 80 and 30
    //
    //j = 3 : Since arr[j] > pivot, do nothing
    //// No change in i and arr[]
    //
    //j = 4 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
    //i = 2
    //arr[] = {10, 30, 40, 90, 80, 50, 70} // 80 and 40 Swapped
    //j = 5 : Since arr[j] <= pivot, do i++ and swap arr[i] with arr[j]
    //i = 3
    //arr[] = {10, 30, 40, 50, 80, 90, 70} // 90 and 50 Swapped
    //
    //We come out of loop because j is now equal to high-1.
    //Finally we place pivot at correct position by swapping
    //arr[i+1] and arr[high] (or pivot)
    //arr[] = {10, 30, 40, 50, 70, 90, 80} // 80 and 70 Swapped
    //
    //Now 70 is at its correct place. All elements smaller than
    //70 are before it and all elements greater than 70 are after it.

    public static void main(String[] args)
    {
        // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };

        // Let's sort using quick sort
        quickSort( array, 0, array.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(Integer[] arr, int low, int high)
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }

        // If low is greater than or equal to high
        if (low >= high){
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make Left <LESS Than Pivot and Right Greater> Pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values of i that are on left side of the array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //Check until all values of j that are on the left side of the array are greater than pivot
            while (arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
    }

    public static void swap (Integer array[], int x, int y)
    {
        // Swapping
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
