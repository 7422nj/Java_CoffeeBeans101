package Inheritance;

public interface Car {
       // Guideline / proto type that other companies can follow to develop their product
        public static void main(String[] args) {

            // Variables
            String brand;
            String seatNumber;
            int carQuantity;
            int numberOfHeadLights;
            boolean drivable;
            boolean airBagIncluded;


        }
        // An interface inside of an interface
        interface Airplane{
            // Airplane Methods
            public void musicSystem();
            public void leatherSeats();

            // Variables
            String distributionLocation="London";
            int distributionZipCode=12123;
            boolean isInternationallySold=true;
            double priceOfCar=7000.00;



        }
    // steering, changing gears, and moving (acceleration/deceleration)
        public void gearChanging();
        public void steering();
        public void carMoving();
        public void acceleration();
        public void deceleration();
        public void carWorks();
    }


