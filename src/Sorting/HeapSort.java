package Sorting;

public class HeapSort {

    // Definition of Heap Sort:
    // HeapSort is similar to selection sort.
    // First we find the maximum element
    // Then place the maximum element at the end.
    // We repeat the same process for the remaining elements.

    //**************************************************************************************************************//
    //Example:
    //     Index: 0  1   2  3  4
    //Input data: [4], [10], 3, 5, 1 <- We Built A Heap
    //
    //     Our Max Heap: 10 is Greater Than 4 so we Swap
    //         (10)
    //        /   \
    //     (4)   (3)
    //    /   \
    // (5)    (1)
    //
    //     Index: 0    1   2   3   4
    //Input data: 10, [4], 3, [5], 1
    //
    //     Our Max Heap: 5 is Greater Than 4 so we Swap
    //         (10)
    //        /   \
    //    (5)    (3)
    //    /   \
    // (4)    (1)
    //
    //     Index: 0    1   2   3   4
    //Input data:[1],  5,  3,  4, [10]
    //
    //Applying heapify procedure to index 0: So we Swap 10 and 1
    //        (1)
    //        /  \
    //     (5)  (3)
    //    /   \
    // (4)    (10)
    //
    //The heapify procedure calls itself recursively to build heap
    // in top down manner.
    //
    //           Index: 0    1   2    3    4
    //    //Input data: 1,   5, [3], [4],  10
    //
    //     Our Max Heap: 4 is Greater Than 3 so we Swap
    //         (1)
    //        /  \
    //     (5)   (4)
    //    /   \
    // (3)    (10)
    //
    //
    //           Index: 0    1    2    3    4
    //    //Input data: 1,  [3], [5],  4,  10
    //     Our Max Heap: 5 is Greater Than 3 so we Swap
    //         (4)
    //        /   \
    //     (10)   (3)
    //    /   \
    //  (5)   (1)
    //
    //           Index: 0    1    2    3    4
    //    //Input data: 1,   3,  [5], [4],  10
    //     Our Max Heap: 5 is Greater Than 4 so we Swap
    //         (5)
    //        /   \
    //     (10)   (3)
    //    /   \
    //  (4)   (1)
    //
    // Now Our Heap is Sorted: 1,3,4,5,10
    //************************************************************************************************************//

    // Java program for implementation of Heap Sort
        public void sort(int arr[]) {
            int n = arr.length;

            // Build Heap (ReArrange Array)
            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);

            // One by one extract an element from Heap
            for (int i = n - 1; i > 0; i--) {
                // Move current root to end
                // Swapping
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // call max heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }

        // To heapify a subtree rooted with node i which is
        // an index in arr[]. n is size of heap
        void heapify(int arr[], int n, int i) {
            int largest = i; // Initialize largest as root
            int l = 2 * i + 1; // left = 2*i + 1
            int r = 2 * i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest])
                largest = l;

            // If right child is larger than largest so far
            if (r < n && arr[r] > arr[largest])
                largest = r;

            // If largest is not root than swap
            if (largest != i) {
                //swapping
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // Recursively heapify the affected sub-tree
                heapify(arr, n, largest);
            }
        }

        /* A utility function to print array of size n */
        static void printArray(int arr[]) {
            // int n = array length
            int n = arr.length;
            // i = 0; if i is less than n, then print i
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code
        public static void main(String args[]) {
            // Our Array
            int arr[] = {12, 11, 13, 5, 6, 7};
            int n = arr.length;

            // Made an object of the class
            HeapSort ob = new HeapSort();
            // Used the reference of the class to call the Sort Method and the array made inside the method
            ob.sort(arr);

            // Print the array
            System.out.println("HeapSorted Array is : ");
            printArray(arr);
        }
    }
