package Challenges.RoomComposition;

public class Bed {

    // Variables
    private String bedBrand;
    private char bedSize;

    // Getters
    public String getBedBrand() {
        return bedBrand;
    }

    public char getBedSize() {
        return bedSize;
    }

    // Constructor
    public Bed(String bedBrand, char bedSize) {
        this.bedBrand = bedBrand;
        this.bedSize = bedSize;
    }
    // Methods
    public void bedFeels(){
        System.out.println(" Bed feels comfy ");
    }
    public void bedDescription(){
        System.out.println(" Bed has a red cover with black lines design");
    }
}
