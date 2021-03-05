package Challenges.FizzBuzz;

public class FizzBuzzChallenge {

    public static String fizzBuzz(int number) {
        // It Checks If My Number Meets Any Of The Below Conditions
        // Than Returns The Related Condition
        if (number % 15 == 0) {
        return "FizzBuzz";
    } else if (number % 5 == 0) {
        return "Buzz";
    } else if (number % 3 == 0) {
        return "Fizz";
    }
    return String.valueOf(number);
    }
    public static void main(String[] args) {
        // My Number Is Checked
        System.out.println(fizzBuzz(90)); // First Step
    }

}