package Math;

import java.util.Arrays;
import java.util.TreeSet;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4};
        int[] array2 = {4, 5, 6, 7, 8};

        mergeTwoArrays();
    }

    public static TreeSet<Integer> mergeTwoArrays(){
        TreeSet<Integer> num1 = new TreeSet<>();
        num1.addAll(Arrays.asList(new Integer[]{1, 3, 4}));

        TreeSet<Integer> num2 = new TreeSet<>();
        num2.addAll(Arrays.asList(new Integer[]{4, 5, 6, 7, 8}));

        // We use Union to Merge Two Arrays into A Single Array
        TreeSet<Integer> union = new TreeSet<>(num1);
        union.addAll(num2);

        System.out.println("The New Sorted Array After Merge Is: "+union);

        return  union;
    }
}
