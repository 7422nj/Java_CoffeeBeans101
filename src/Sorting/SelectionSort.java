package Sorting;

public class SelectionSort {

    //The selection sort algorithm sorts an array by repeatedly finding the minimum
    // element (considering ascending order) from unsorted part and putting it at the beginning.

    // The algorithm maintains two subArrays in a given array.
    //1) The subArray which is already sorted.
    //2) Remaining subArray which is unsorted.

    //In every iteration of selection sort, the minimum element (considering ascending order) f
    // rom the unsorted subArray is picked and moved to the sorted subArray.

    // Given This Array
    //arr[] = 64 25 12 22 11

    //// 1. Find the minimum element in arr[0...4]
    //// 2.  Place Minimum at beginning
     // (11) 25 12 22 (64)
    //
    //// 1. Find the minimum element in arr[1...4]
    //// 2. Place it at beginning of arr[1...4]
     // 11 (12) 25 22 (64)
    //
    //// 1. Find the minimum element in arr[2...4]
    //// 2. Place it at beginning of arr[2...4]
     // 11 12 (22) 25 (64)
    //
    //// 1. Find the minimum element in arr[3...4]
    //// 2. Place it at beginning of arr[3...4]
     // 11 12 22 (25) (64)


    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subArray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("SelectionSorted Array : ");
        ob.printArray(arr);
    }
}
