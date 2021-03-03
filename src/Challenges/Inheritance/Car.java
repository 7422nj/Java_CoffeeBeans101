package Challenges.Inheritance;

// Guideline or proto type that other companies will follow to develop their own products

public class Car {  // Grandfather Class
    // Create Protected Variables
    String brand;
    String model;
    int numberOfDoors;
    boolean isAvailable;
    String color;

    // Create Constructor
    public Car(String brand,String model,int numberOfDoors, boolean isAvailable, String color) {

        // This. allows the protected variables to become public
        // this.variableName=variableName;
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.isAvailable=isAvailable;
        this.numberOfDoors=numberOfDoors;
    }


    // 4. You should be able to handle steering, changing gears, and moving (acceleration/deceleration)
    // Create methods
    public void steering(){
        System.out.println("Car has steering feature");
    }
    public void changingGears(){
        System.out.println("Car has changing gear feature");
    }
    public void moving(){
        System.out.println("Car has moving feature");
    }
    public void acceleration(){
        System.out.println("Car has acceleration feature");
    }
    public void deceleration(){
        System.out.println("Car has deceleration feature");
    }

}