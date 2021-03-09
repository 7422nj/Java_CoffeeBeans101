package Java101;

import java.util.Arrays;

public class Day5 {
    public static void main(String[] args) throws Exception {

        //How Make Arrays:
        int x;
        //Option 1
        int[] nums = new int[5]; // Array with 5 Rows
        nums[0] = 5; // Index 0=5
        nums[1] = 4; // Index 1=4
        nums[2] = 3; // Index 2=3
        nums[3] = 2; // Index 3=2
        nums[4] = 1; // Index 4=1

        // We Want To Pick And See Value of Something in Our Array
        System.out.println("Length of the Array is " + nums.length); // This Will Print The Length of The Array
        System.out.print("Index 2's Value is " + nums[2]); // This Will Print Index 2 of The Array
        System.out.println();
        System.out.println("Max Number is " + Arrays.stream(nums).max()); // This Will Print Maximum Number in Array
        System.out.println("Lowest Number is " + Arrays.stream(nums).min()); // This Will Print Lowest Number in Array
        System.out.println("Object's Memory Address is " + nums.hashCode()); // This Gives a Distinct Hash Code Which is This Code's Unique ID Address

        //Option 2
        int[] num = {12, 3, 41, 30, 23, 8}; // Created an Array

        System.out.println("Index 1's Value is " + num[1]);


    }

}
