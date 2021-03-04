package Challenges.Inheritance.CarpetCompany;

public class TestCC {
    public static void main(String[] args) {

        // Object of Floor Class
        Floor floor = new Floor(25, 10);
        // Object of Carpet Class
        Carpet carpet = new Carpet(10);
        // Object of Calculator Class
        Calculator calculator = new Calculator(floor, carpet);

        // From The Calculator Class We Want To Print Return Value Of getTotalCost
        // return floor.getArea() * carpet.getCost();
        System.out.println("TOTAL COST: $" + calculator.getTotalCost()); //$2500
    }
}
