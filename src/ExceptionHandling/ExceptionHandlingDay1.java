package ExceptionHandling;

public class ExceptionHandlingDay1 {

    public static boolean isAgeValid(int age) {

        try {
            if (age < 25) {
                System.out.println(isAgeValid(age));
                age++;
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println(isAgeValid(age));

        }
        return isAgeValid(age);
    }

    public static void main(String[] args) {
        isAgeValid(22);
    }

    //-> single line comment

    /*
     multi-line comment
     */

    /**
     * Document comment
     */


}
