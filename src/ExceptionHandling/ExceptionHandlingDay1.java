package ExceptionHandling;

public class ExceptionHandlingDay1 {

    public static void isAgeValid(int age) {

        //Try command indicates the start of the block
        try {
            if (age > 17) {
                System.out.println("Age is valid");
            } else if (age < 17) {
                System.out.println("Age is not valid");
            } else {
                System.out.println("*** Try Again ***");
            }

        //Catch is placed at the end of the try block, which helps to resolve the Exception.
        } catch (Exception u) {
            u.printStackTrace();
            System.out.println("Exception Was Caught");

        //It is the final code that helps you to executes irrespective of the occurrence of an exception
        } finally {//The finally block always executes.
            System.out.println("Operation is Complete");
        }
    }
    public static void main(String[] args) {
        isAgeValid(18);
    }

    //-> single line comment

    /*
     multi-line comment
     */

    /**
     * Document comment
     */


}
