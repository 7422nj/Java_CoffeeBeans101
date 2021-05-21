package Java101;

import java.util.Date;

public class Day1 {

    //There are Four Types of Java Access Modifiers:

    //Private: The access level of a private modifier is only within the class.
    // It cannot be accessed from outside the class.

    //Example: private int age=26;

    //Default: The access level of a default modifier is only within the package.
    // It cannot be accessed from outside the package. If you do not specify any access level
    // it will be the default.

    //Example: int age=26;

    //Protected: The access level of a protected modifier is within the package and outside the package
    // through child class. If you do not make the child class, it cannot be accessed from outside the package.

    //Example: protected int age=26;

    //Public: The access level of a public modifier is everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.

    //Example: public int age=26;

    // Different Access Modifiers
    private int age = 20; // private variable - only inside this class
    public int myAge = 20; // public variable - everywhere
    protected int age1 = 20; // protected variable - inside the package, to reach outside of package you need childCLass
    int num = 20; // default variable - only inside the package
    private String fullName = "Pritam Das";
    private String pizzaTopping = "No toppings";
    private int numOfToppings = 3;

    //Different DataTypes     Total Limit:
    int getNum = 1234567891;      //10
    short number = 5555;          //4
    double cash = 12348.978;      //No Limit
    float randomNum = 78.97f;     //No Limit must end with f
    boolean isTrueOrFalse = true; //True or False
    char oneCharacter = 'l';      //Only 1 Character 'l' or '3'
    String say = "Hello World";   //String Value
    long superLong = 123711188l;  //19

    //Getter for PizzaToppings
    public String getPizzaTopping() {
        return pizzaTopping;
    }

    public void setPizzaTopping(String pizzaTopping, int numOfToppings) {
        this.pizzaTopping = pizzaTopping;
        this.numOfToppings = numOfToppings;
    }

    //How To Make Getters And Setters:
    // #1 Step is Getter
    public String getFullName() {
        return fullName;
    }

    // #2 Step is  Setter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    //Constructor
    public Day1(int age, String fullName, String pizzaTopping) { // When we call it we can ReAssign Value

        //This. allows private variables to be made public
        this.age = age;
        this.fullName = fullName;
        this.pizzaTopping = pizzaTopping;
    }
    public Day1(){

}



    public static void main(String[] args) {

        //className referenceName = new constructorOfClass(paramters from constructor of class)
        Day1  day1 = new Day1();
        System.out.println(day1.pizzaTopping);
        //First You Set Value
//        day1.setPizzaTopping("Pepporoni",2);
//        //Get Value
//        day1.getPizzaTopping();
//        System.out.println(day1.pizzaTopping+" "+day1.numOfToppings);
        day1.getFullName();
        System.out.println(day1.fullName);
        day1.setFullName("Beenish Bajwa");
        System.out.println(day1.fullName);

        //Created Variables
        String firstName = "Pritam ";
        String lastName = " Das";
        int age = 25;

        //How to Add 2 Strings Together??
        String fullName = firstName + lastName;

        //How To Do Concatenation: System.out.println(variableName + " need space " + variableName);
        //System.out.println("my first name is" +firstName); = my first name isPritam
        //System.out.println(" my first name is " +firstName); = my first name is Pritam

        System.out.println(fullName + " is " + age + " years old"); // Pritam Das is 25 years old
    }

    public void pizzaName() {
        System.out.println("Soft crust pizza with " + pizzaTopping + " as topping");
    }

    public void myNameIs() {
        System.out.println("My full name is " + fullName);
    }

    public void myAgeIs() {
        System.out.println("My age is " + age);
    }

}
