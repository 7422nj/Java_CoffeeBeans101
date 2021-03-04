package Challenges.RoomComposition;

public class Wall {

    // Variables
    private double wallHeight;
    private double wallWidth;

    // Getter for Total Area of Room
    public double getArea() {
        return wallHeight * wallWidth;
    }

    // Constructor
    public  Wall(double wallHeight, double wallWidth) {
        this.wallHeight = wallHeight;
        this.wallWidth = wallWidth;

    }
    // Methods
    public void wallColor(){
        System.out.println(" Wall color is red ");
    }
    public void wallWiringInspection(){
        System.out.println(" Wall wiring has been inspected and approved ");
    }
    public String myWall(double wallHeight, double wallWidth) {
        String myWall = null;
        // If wallHeight & wallWidth Meets Within The Condition
        if (wallHeight < 15 || wallWidth < 15) {
            // Print Small if Less Than 15
            myWall = " Room Is Small ";
        }else{
            // Print Big if More Than 15
            myWall = " Room Is Big Enough ";
                }

        // Return Value of myWall
        return myWall;
    }

}
