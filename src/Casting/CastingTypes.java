package Casting;

//Casting is the act of converting one of the variables into another.
//
//There are two types of casting in Java:
//1. Implicit
//Implicit casting is when you assign the value of the old variable, to the new variable, without any additional code.
//However, this is only valid if a narrower variable is being converted into a wider one (e.g. converting int into double).
//Polymorphism, when an object of a child (narrower) class is referred to by a reference variable of the parent (wider) class.
//
//FOR EXAMPLE:
//byte i = 10;
//long newType = i;
//
//2. Explicit
//Explicit casting is the opposite of implicit casting.
//It is used when we have to convert a wider variable to a narrower one;
//But this time, we have to explicitly write the type we are converting to in (). Otherwise, a compile-time error will occur.
//
//FOR EXAMPLE:
//double d = 50;
//int x = (int)d;

//Type Casting:
//The process of converting the value of one data type (int, float, double, etc.) to another data type
//is known as typecasting.
//
//We will focus on the major 2 types:
//1. Widening Type Casting
//2. Narrowing Type Casting

public class CastingTypes {

    public static void main(String[] args) {

    //********************************************************************************************************//

        // -> Widening Type Casting <- //

        // Create int type variable
        int num = 10;
        System.out.println("The integer value: " + num);

        // Convert into double type
        double data = num;
        System.out.println("The double value: " + data);
        System.out.println("************************************************************");

        //In the above example, we are assigning the int type variable named num to a double type variable named Data.
        //
        //Here, the Java first converts the int type Data into the double type. And then assign it to the double variable.
        //
        //In the case of Widening Type Casting, the lower Data type (having smaller size) is converted into the higher Data type (having larger size).
        //Hence there is no loss in Data.
        //This is why this type of conversion happens automatically.
        //
        //Note: This is also known as Implicit Type Casting.

    //*******************************************************************************************************//

        // -> Narrowing Type Casting <- //

        //In Narrowing Type Casting, we manually convert one Con type into another using the parenthesis.

        // create double type variable
        double numb = 10.99d;
        System.out.println("The double value: " + numb);

        // convert into int type
        int Data = (int)numb;
        System.out.println("The integer value: " + Data);
        System.out.println("************************************************************");

        //In the above example, we are assigning the double type variable named numb to an int type variable named Data.
        //
        //Notice the line -> int Con = (int)nums;
        //Here, the int keyword inside the parenthesis indicates that that the nums variable is converted into the int type.
        //
        //In the case of Narrowing Type Casting, the higher Con types (having larger size) are converted into lower Con types (having smaller size).
        //Hence there is the loss of Con. This is why this type of conversion does not happen automatically.
        //
        //Note: This is also known as Explicit Type Casting.

    //*******************************************************************************************************//

        // -> Type conversion from int to String <- //

        // create int type variable
        int nums = 10;
        System.out.println("The integer value is: " + nums);

        // converts int to string type
        String Con = String.valueOf(nums);
        System.out.println("The string value is: " + Con);
        System.out.println("************************************************************");

        //In the above program, notice the line -> String data = String.valueOf(num);
        //
        //Here, we have used the valueOf() method of the Java String class to convert the int type variable into a string.


    //*******************************************************************************************************//

        // -> ParseInt() <- //

        //String to Integer <- "123" into 123
        String someString = "123";// String Variable Assigned Value "123"

        //1. Use the Integer wrapper class
        //2. parseInt() Method Converts the string argument into integer
        int i = Integer.parseInt(someString);

        System.out.println("After Conversion : "+i); //Print after Coversion
        System.out.println("************************************************************");

   //**********************************************************************************************************//

        // -> ParseInt() <- //

        //1. Convert String to Integer <- "10" into 10
        //2. Add Integer 20 to String "10" After Conversion <- "10" = 10 + 20 = 30
        String tenString = "10";
       Integer result = 20 + Integer.parseInt(tenString);
        System.out.println(result);
        System.out.println("************************************************************");

    //*******************************************************************************************************//

        // -> Automatic Type Conversion <- //

        int o = 100; // Integer variable

        // Automatic Type Conversion <- Integer to Long
        long l = o;

        // Automatic Type Conversion <- Long to Float
        float f = l;

        // Automatic Type Conversion <- Float to Double
        double d = f;

        //explicit Type Conversion <-
        char e = (char)d;

        String u = String.valueOf(0);

        int v = Integer.parseInt(u);

        String p = String.valueOf(v);

        String ok = "Beenish is learning";
        int ox = Integer.parseInt(ok);

        Object obj = (Object)ox;

        System.out.println("Int value "+o);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
        System.out.println("************************************************************");

    //****************************************************************************************************//

        // -> Explicit Type Casting <- //
        double du = 100.04;

        //explicit type casting
        long n = (long)du;

        //explicit type casting
        int k = (int)n;
        System.out.println("Double value "+d);

        //fractional part lost
        System.out.println("Long value "+n);

        //fractional part lost
        System.out.println("Int value "+k);
        System.out.println("************************************************************");

    //***************************************************************************************************//

        // -> Conversion to Byte <- //
        byte b;
        int j = 257;
        double h = 323.142;
        System.out.println("Conversion of int to byte.");

        //Conversion of Integer to Byte
        b = (byte) j;
        System.out.println("j = " + j + " b = " + b);
        System.out.println("\nConversion of double to byte.");

        //Conversion of Double to Byte
        b = (byte) h;
        System.out.println("h = " + h + " b= " + b);
        System.out.println("************************************************************");

    //***************************************************************************************************//
    }
}




