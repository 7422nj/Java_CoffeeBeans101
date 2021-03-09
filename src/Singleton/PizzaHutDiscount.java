package Singleton;

public class PizzaHutDiscount {
    String pizzaName="Soft Crust Pizza";
    String toppingName="Peperoni";
    int qty=2;
    double price=6.75;

    // Default constructor
    public PizzaHutDiscount(){

    }
    // Main Method
    public static void main(String[] args) {

        // 2 Ways to Make An object of Singleton Class
        LearnSingleton learn= LearnSingleton.getInstance(); // Option 1 <-- Make the constructor private
        System.out.println("*******************************************************************************");
        System.out.println("Private Constructor : "+learn.collegeName);
        System.out.println("Private Constructor : "+learn.favoriteActivity);
        System.out.println("*******************************************************************************");
        LearnSingleton lear=new LearnSingleton(); // Option 2 <-- Make the constructor default
        System.out.println("Default Constructor : "+lear.collegeName);
        System.out.println("Default Constructor : "+lear.favoriteActivity);
        System.out.println("*******************************************************************************");



    }
}
