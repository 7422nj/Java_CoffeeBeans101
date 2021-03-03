package Challenges.Inheritance;

import Inheritance.BMW;

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


    // New Constructor For Mercedes Class


    public Mercedes(String brand, String seatNumber, int carQuantity, int numberOfHeadLights, boolean drivable, boolean airBagIncluded, String model, int numberOfDoors, boolean isAvailable, String color, boolean isAutomatic, int speedOfVehicle, char axleOfVehicle, long dobCarCompany, String engineType, int tankSize, String steeringPosition) {
        super(brand, seatNumber, carQuantity, numberOfHeadLights, drivable, airBagIncluded);
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.isAvailable = isAvailable;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.speedOfVehicle = speedOfVehicle;
        this.axleOfVehicle = axleOfVehicle;
        this.dobCarCompany = dobCarCompany;
        this.engineType = engineType;
        this.tankSize = tankSize;
        this.steeringPosition = steeringPosition;
    }

    // Constructor From BMW Class
    public Mercedes(String brand, String model, int numberOfDoors, boolean isAvailable, String color, boolean isAutomatic, int speedOfVehicle, char axleOfVehicle) {
        super("Mercedes", "G-Class", 4, true, "Blue", true, 95,'r');
    }


    // Overriding BMW Class's Method
    @Override
    public void gearChanging() {
        super.gearChanging();
        System.out.println("Mercedes has gear changing feature");
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("Mercedes has steering feature");
    }

    public Mercedes() {
        super();
    }

    @Override
    public void carMoving() {
        super.carMoving();
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
    public void carWorks() {
        super.carWorks();
        System.out.println("Mercedes does work 100%");
    }

    @Override
    public void bluetoothSupported() {
        super.bluetoothSupported();
        System.out.println("Mercedes has bluetooth supported system");
    }

    @Override
    public void motionSensor() {
        super.motionSensor();
        System.out.println("Mercedes has motion sensor feature");
    }
    // New Method
    public void musicSystem(){
        System.out.println("Mercedes has bluetooth supported music system");
    }
}

