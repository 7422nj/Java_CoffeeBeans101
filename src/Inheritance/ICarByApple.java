package Inheritance;

// Class ICarByApple Inherited Honda Class and Implemented Car Interface and Airplane Interface
public class ICarByApple extends Honda implements Car.Airplane {

    // Constructor of Honda Class
    // Now we can use these as a guideline to follow up and make a create our ICAR made by APPLE
    public ICarByApple(String brand, String seatNumber, int carQuantity, int numberOfHeadLights, boolean drivable, boolean airBagIncluded) {
        super("Apple", "4", 400, 4, true, true);
    }

    // Methods from the Car Interface
    @Override
    public void bluetoothSupported() {
        super.bluetoothSupported();
        System.out.println("ICar is bluetooth supported");
    }

    @Override
    public void motionSensor() {
        super.motionSensor();
        System.out.println("ICar has motion sensor feature");
    }

    @Override
    public void gearChanging() {
        super.gearChanging();
        System.out.println("ICar has gear changing feature");
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("ICar does not have steering wheel, sold separately at Apple Store");

    }

    @Override
    public void carMoving() {
        super.carMoving();
        System.out.println("ICar does move");
    }

    @Override
    public void acceleration() {
        super.acceleration();
        System.out.println("ICar has acceleration feature");
    }

    @Override
    public void deceleration() {
        super.deceleration();
        System.out.println("ICar has deceleration feature");
    }

    @Override
    public void carWorks() {
        super.carWorks();
        System.out.println("ICar has works after charging it for 1000 hours, lasts 4 hours");
    }

    // New methods made
    public void touchScreenDisplay() {
        System.out.println("ICar has touch screen display");
    }

    public void builtInSpeakers() {
        System.out.println("ICar has built in tiny airpods everywhere that act as speakers");
    }
    // Remember how i made an Airplane interface inside of the Car interface
    // Now we are using the Airplane interface's methods
    @Override
    public void musicSystem() {
        System.out.println("ICar has music system");

    }

    @Override
    public void leatherSeats() {
        System.out.println("ICar has leather seat");

    }
    public ICarByApple(String brand,String seatNumber,int carQuantity,int numberOfHeadLights,boolean drivable, boolean airBagIncluded,double dateOfCreation, char carSize,double softwareVersion, long carsInShop) {
    }

    //Variables assigned new value
    String brand = "ICar";
    String seatNumber = "4";
    int carQuantity = 400;
    int numberOfHeadLights = 4;
    boolean drivable = true;
    boolean airBagIncluded = true;
    double dateOfCreation = 11-25-21;

    // variables from the Airplane Interface
    String distributionLocation="New York";
    int distributionZipCode=18273;
    boolean isInternationallySold=true;
    double priceOfCar=11000.00;

    // New Variables made
    char carSize='l';
    double softwareVersion=1.0;
    long carsInShop=100;



}
