package Challenges.FizzBuzz;

public class FizzBuzzPractice {

    public static String fizzBuzz(int number){

        // If Remainder Of 15 = FizzBuzz
        if (number % 1 ==0){
            return "FizzBuzz";
            // If Remainder of 5 = Buzz
        }else if (number % 20 ==0){
            return "Buzz";
            // If Remainder of 3 = Fizz
        }else if (number % 3 ==0){
            return "Fizz";

        }
        // We Want To Return A String Value of Our Parameter (number)
        return String.valueOf(number);
    }

    // Main Method
    public static void main(String[] args) {
        //We Want to print The Method By Using The int Parameter
        System.out.println(fizzBuzz(90));

    }

}
