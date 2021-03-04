package Challenges.Inheritance.CarpetCompany;

public class Carpet {

    // Variable
    private double cost;

    // Constructor Of Class
    public Carpet(double cost) {

        // If Cost is Less Than 0, Than The Value is 0
        if (cost < 0) {
            this.cost = 0;
        }

        this.cost = cost;
    }

    // Getter for getCost
    public double getCost() {

        // We Want To Return Cost
        return cost;
    }
}
