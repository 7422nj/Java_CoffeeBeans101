package Challenges.RoomComposition;

public class Sofa {

    // Variables
    private String sofaBrand;
    private char sofaSize;
    private String color;

    // Constructor
    public Sofa(String sofaBrand, char sofaSize, String color) {
        this.sofaBrand = sofaBrand;
        this.sofaSize = sofaSize;
        this.color=color;
    }

    // Getters
    public String getSofaBrand() {
        return sofaBrand;
    }

    public double getSofaSize() {
        return sofaSize;
    }

    public String getColor(){
        return color;
    }

    // Methods
    public void isComfortable(){
        System.out.println(" Sofa is very comfy");
    }
    public void sofaWeight(){
        System.out.println(" Sofa is lightweight");
    }
}
