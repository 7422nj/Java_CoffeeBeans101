package Java101;

public class Day6 {

    // Casting: Casting means converting data type
    // Primitive DataType to Primitive dataType
    // NonPrimitive to NonPrimitive

    public static void main(String[] args) {

//        //Casting double into int [narrowing casting:data loss]
//        double price = 35.99; // Start with 35.99
//        int discountePrice = (int) price; // After casting, value becomes 35
//
//        System.out.println(discountePrice);//Prints int value

        // How to Transfer Value from num1 & num2 into num3 than to get total num4
//        int num1 = 60; //num1 equals 60
//        int num2 = 40; //num2 equals 40
//        int num3 = num1; //num3 equals 60
//        int num4 = num3 + num2; //num4 equals num3+num2; (num4 equals 60+40 which is 100)
//        System.out.println("Total is " + num4);
//
        //Casting int to double [widening casting: no data loss] - small dataType into bigger dataType
//        int age = 24; // Starts value at 24
//        double newAge = (double) age; // After casting value is 24.0
//        System.out.println(newAge);
//
        //Casting int into byte dataType
        int number = 1200000; //int value is 1200000
        byte total = (byte) number; //converts into byte making the value -128
        // The Values that can be Stored in a Single Byte are minimum -128 to maximum 127.
        System.out.println("int to byte " + total);
//
//        String name = "Arafat";
//        String stName = name;
//        String ssn = "1234";
//        int newSsn = Integer.parseInt(ssn);
//        System.out.println(newSsn);
//        int newSsn1 = Integer.valueOf(ssn);
//
//        int salary = 2500;
//        String s = String.valueOf(salary);


    }
}
