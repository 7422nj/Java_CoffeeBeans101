package Challenges.Inheritance.CarpetCompany;

public class Calculator {

    // Variables
    Floor floor;
    Carpet carpet;

    // Constructor Of Class
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    // Getter for getTotalCost
    public double getTotalCost(){
        // Return The Total Area Multiplied By Total Cost
        return floor.getArea() * carpet.getCost();
    }
}
