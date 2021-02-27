package Inheritance;

public class BMW implements Car{

    // Created some variables
    String brand="BMW";
    String seatNumber="2";
    int carQuantity=390;
    int numberOfHeadLights=4;
    boolean drivable=true;
    boolean airBagIncluded=true;


    public BMW(String brand, String seatNumber, int carQuantity, int numberOfHeadLights, boolean drivable, boolean airBagIncluded) {
        this.brand = brand;
        this.seatNumber = seatNumber;
        this.carQuantity = carQuantity;
        this.numberOfHeadLights = numberOfHeadLights;
        this.drivable = drivable;
        this.airBagIncluded = airBagIncluded;
    }

    @Override
    public void gearChanging() {
        System.out.println("BMW has gear changing feature");
    }

    @Override
    public void steering() {
        System.out.println("BMW has steering feature");
    }

    public BMW() {
    }

    @Override
    public void carMoving() {
        System.out.println("BMW has moving feature");
    }

    @Override
    public void acceleration() {
        System.out.println("BMW has acceleration feature");
    }

    @Override
    public void deceleration() {
        System.out.println("BMW has deceleration feature");
    }

    @Override
    public void carWorks() {
        System.out.println("BMW does work");
    }
    public void bluetoothSupported(){
        System.out.println("BMW has bluetooth supported feature");
    }
    public void motionSensor(){
        System.out.println("BMW has motion sensor feature");
    }
}

