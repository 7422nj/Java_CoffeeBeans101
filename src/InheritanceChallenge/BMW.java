package InheritanceChallenge;

public class BMW extends Car{ // Father Class

    // Protected Variables
        String brand="BMW";
        String model="sportsCar";
        int numberOfDoors=4;
        boolean isAvailable=true;
        String color="Red";
        String rightOrLeft;
        String trafficLight;

        // New Variables
        boolean isAutomatic=true;
        int speedOfVehicle=90;
        char axleOfVehicle='f';


        // Constructor to access Protected Variables in other Classes inside the Package
    public BMW(String brand,String model,int numberOfDoors, boolean isAvailable, String color, boolean isAutomatic, int speedOfVehicle,char axleOfVehicle) {
        super("BMW", "sportsCar", 4, true, "Red"); // Super Class Inheritance of Variables

        // This. allows the Protected Variables to become Public
        this.brand = brand;
        this.color = color;
        this.isAvailable = isAvailable;
        this.numberOfDoors = numberOfDoors;
        this.model = model;

    }

    public void steering() {
        super.steering();
        System.out.println("BMW has steering feature");
    }

    public void changingGears() {
        super.changingGears();
        System.out.println("BMW has changing gear feature");
    }

    public void moving() {
        super.moving();
        System.out.println("BMW has moving feature");
    }

    public void acceleration() {
        super.acceleration();
        System.out.println("BMW has acceleration feature");
    }

    public void deceleration() {
        super.deceleration();
        System.out.println("BMW has deceleration feature");
    }
    public void honkingCar(){
        System.out.println("BMW does honk");
    }

    // Method overloading is having same method with different number
    // of parameters or different dataTypes of parameters or different positions of parameters
    public void turnRightAndLeft(){
        System.out.println("BMW turns right and left");

    }
    public void turnRightAndLeft(String trafficLight, String rightOrLeft, String color){ // Adding parameters

    }
    public void turnRightAndLeft(int numberOfDoors, String trafficLight){ // Different types of DataTypes of Parameters

    }
    public void turnRightAndLeft(String trafficLight, int numberOfDoors){ // Different Order of Parameters

    }
}
