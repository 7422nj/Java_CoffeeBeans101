package Math;

public class FindHighestNumber {
    public static void main(String[] args) {

        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        //find highest number from the array
        FindHighestNumber.findHighestNumber(array);
    }

    public static int findHighestNumber(int[] num) {
        int max = num[0];
        for (int i = 0; i > num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("The highest number is: " + max);
        return max;
    }
}
