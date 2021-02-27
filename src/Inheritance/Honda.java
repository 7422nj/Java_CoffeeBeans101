package Inheritance;

public class Honda extends BMW implements Car {

    // Constructor of BMW Class and the Parameters from BMW
    // As you can see after assigning value to these parameters they are no longer in white
    public Honda(String brand, String seatNumber, int carQuantity, int numberOfHeadLights, boolean drivable, boolean airBagIncluded) {
        super("Honda", "4", 500, 4, true, true);
    }

    // This method was newly made in BMW Class
    @Override
    public void bluetoothSupported() {
        super.bluetoothSupported();
    }

    // This method was newly made in BMW Class
    @Override
    public void motionSensor() {
        super.motionSensor();
    }

    @Override
    public void gearChanging() {
        super.gearChanging();
        System.out.println("Honda has gear changing feature");
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("Honda has steering feature");
    }

    public Honda() {
        super();
    }

    @Override
    public void carMoving() {
        super.carMoving();
        System.out.println("Honda has moving feature");
    }

    @Override
    public void acceleration() {
        super.acceleration();
        System.out.println("Honda has acceleration feature");
    }

    @Override
    public void deceleration() {
        super.deceleration();
        System.out.println("Honda has deceleration feature");
    }

    @Override
    public void carWorks() {
        super.carWorks();
        System.out.println("Honda works 100%");
    }

        //Variables assigned new value
        String brand = "Honda";
        String seatNumber = "4";
        int carQuantity = 500;
        int numberOfHeadLights = 4;
        boolean drivable = true;
        boolean airBagIncluded = true;
        // new variable
        double dateOfCreation = 11-23-21;
    }


