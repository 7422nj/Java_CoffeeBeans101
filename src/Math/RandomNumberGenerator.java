package Math;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//Java provides three ways to generate random numbers using some built-in methods and classes as listed below:
//
// 1. java.util.Random class
// 2. Math.random method : Can Generate Random Numbers of double type.
// 3. ThreadLocalRandom class

// 1. java.util.Random class
// For using this class to generate random numbers, we have to first create an instance of this class
// Then invoke methods such as nextInt(), nextDouble(), nextLong() etc using that instance.
// We can generate random numbers of types integers, float, double, long, booleans using this class.
// We can pass arguments to the methods for placing an upper bound on the range of the numbers to be generated.
// For example, nextInt(6) will generate numbers in the range 0 to 5 both inclusive.

public class RandomNumberGenerator {
    public static void main(String args[])
    {
        // Create an Instance of Random Class
        Random rand = new Random();

        // Generate Random Integers in Range of 0 to 999
        int rand_int1 = rand.nextInt(1000);

        // Print Random Integers
        System.out.println("**********************************************************************************");
        System.out.println("Random Integers: "+rand_int1); //Prints Random Integers
        System.out.println("**********************************************************************************");

        //***********************************************************************************************************//

        //2) Math.random() : Can Generate Random Numbers of Double dataType.
        // The class Math contains various methods for performing various numeric operations
        // Such as, calculating exponentiation, logarithms etc.
        // One of these methods is random()
        // This method returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
        // The returned values are chosen (pseudorandom). This method can only generate random numbers of type Doubles.
        // A pseudorandom number generator, also known as a deterministic random bit generator
        // It is an algorithm for generating a sequence of numbers whose properties approximate the properties of sequences
        // Of random numbers.
        //
        // Below program explains how to use this method:

        // Generating Random Doubles
        System.out.println("Random doubles: " + Math.random());
        System.out.println("**********************************************************************************");

        //**************************************************************************************************************//

       // 3) java.util.concurrent.ThreadLocalRandom class
       // This class is introduced in java 1.7 to generate random numbers of type integers, doubles, booleans etc.
       // Below program explains how to use this class to generate random numbers:

        // Generate random integers in range 0 to 999
        int rand_int = ThreadLocalRandom.current().nextInt();

        // Print random integers
        System.out.println("Random Integers: " + rand_int);
        System.out.println("**********************************************************************************");


        // Generate Random doubles
        double rand_double = ThreadLocalRandom.current().nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: " + rand_double);
        System.out.println("**********************************************************************************");


        // Generate random booleans
        boolean rand_boolean = ThreadLocalRandom.current().nextBoolean();

        // Print random Booleans
        System.out.println("Random Booleans: " + rand_boolean);
        System.out.println("**********************************************************************************");

    }
}






