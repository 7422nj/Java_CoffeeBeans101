package Java101;

public class Day3 {
    // Declare variable: Declare dataType with variable name
    int age;
    // Declare variable and Assign value
    int pizzaPrice = 25;



    public static String stName="Easha"; // Static global variable

    String stAddress="New York"; // non static global variable

    static String stFatherName;
    String stMotherName;


    public static void tvDisplay() {
        System.out.println("TV Dispaly is UHD");
    }


    public void display() {
        System.out.println("Display is good");
    }

    public static void main(String[] args) {
        // semicolon we use to complete a statement ;

        // How can we call a static variable inside main method?
        // Static variable/method call by class name as that variable/method in class level.

        Day3.stName="Kevin"; // ReAssign value
        Day3.stName="Arafat";
        System.out.println(Day3.stName);
        Day3.tvDisplay();
        Day3.stFatherName="Bob William";
        System.out.println("Student Father name is "+ Day3.stFatherName);
    }

}
