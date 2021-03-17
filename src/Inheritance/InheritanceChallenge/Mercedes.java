package Inheritance.InheritanceChallenge;

public class Mercedes extends BMW { // Son Class

    // Variables Assigned New Value
    String brand="Mercedes";
    String model="G-Class";
    int numberOfDoors=4;
    boolean isAvailable=true;
    String color="Blue";
    boolean isAutomatic=true;
    int speedOfVehicle=95;
    char axleOfVehicle='r';
    long dobCarCompany=11-22-2021;
    String engineType="Electric";

    // New Variables
    int tankSize=50;
    String steeringPosition="Left";



    // Constructor from BMW Class
    public Mercedes(String brand, String model, int numberOfDoors, boolean isAvailable, String color, boolean isAutomatic, int speedOfVehicle, char axleOfVehicle) {
        super("Mercedes", "G-Class", 4, true, "Blue", true, 95,'r');
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("Mercedes has steering feature");
    }

    @Override
    public void changingGears() {
        super.changingGears();
        System.out.println("Mercedes has changing gear feature");
    }

    @Override
    public void moving() {
        super.moving();
        System.out.println("Mercedes has moving feature");
    }

    @Override
    public void acceleration() {
        super.acceleration();
        System.out.println("Mercedes has acceleration feature");
    }

    @Override
    public void deceleration() {
        super.deceleration();
        System.out.println("Mercedes has deceleration feature");
    }

    @Override
    public void honkingCar() {
        super.honkingCar();
        System.out.println("Mercedes does have honking feature");
    }

    @Override
    public void turnRightAndLeft() {
        super.turnRightAndLeft();
        System.out.println("Mercedes has left and right turning feature");
    }
    public void musicSystem(){
        System.out.println("Mercedes has music system");
    }
}

