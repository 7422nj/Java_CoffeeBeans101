package Java101;



public class Day7 {

    //Create Variables
    String name;
    int age = 4;
    boolean isAlive;
    int salary = 4;


    public Day7() {
    }

    //Constructor Overloading
    public Day7(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }
    //Method Overloading: Using the same method over and over

    //Original Method
    public void aPerson() {
        System.out.println("I am a person");
    }

    //3 Ways of Achieving Method Overloading

    //1. Adding Parameters
    public int aPerson(int age) {
        return age + salary;

    }

    //2. Different Parameters
    public void aPerson(int age, boolean isAlive) {
        System.out.println(" My age is " + "Am I alive? " + isAlive);
    }

    //3. Different Order Of Parameters
    public void aPerson(boolean isAlive, String name) {
        System.out.println(" Is beenish alive? " + isAlive + " her age is");
    }
    //+ (used with numerical data types vs Strings)
    //= (used as assignment operator)
    //== (comparison operator)
    //|| (logical or)
    //&& (logical and)

    int x = 6;
    int y = 5;
    int total = x + y; // + addition = equals


    public void numbers() { //void returns nothing but allows all dataTypes to return something
        String x = "okay";
        String y = "Cool";
        String total = x + y;
        System.out.println(total);

        int xx = 7;
        int yy = 8;
        int total1 = xx * yy;
        System.out.println(total1);

    }
}
        //Ctrl+Alt+L


