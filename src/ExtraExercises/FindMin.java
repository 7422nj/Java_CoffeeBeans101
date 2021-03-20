package ExtraExercises;

import java.util.Arrays;

public class FindMin {



    public static void main(String[] args) {

        int[] a = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] b = {18, 25, 41, 47, 17, 36, 14, 19};

        // determines length of firstArray
        int a1 = a.length;
        // determines length of secondArray
        int b1 = b.length;
        // resultant array size
        int c1 = a1 + b1;
        // create the resultant array
        int[] c = new int[c1];
        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        // prints the resultant array
        System.out.println(Arrays.toString(c));
        // Calling getMin() method for getting min value
        int min = getMin(c);
        System.out.println("Minimum Value is: "+min);
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}


