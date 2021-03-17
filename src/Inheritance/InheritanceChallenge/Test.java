package Inheritance.InheritanceChallenge;

public class Test {
    public static void main(String[] args) {

        // Creating an Object
         // How to make an object: className objectName=new className();
        Car c=new Car("Car","basic",4,true,"Red");
        c.acceleration();
        System.out.println(c.brand);

        BMW bmw=new BMW("BMW","sportsCar",4,true,"Red",true,90,'f');
         bmw.acceleration();
        System.out.println(bmw.brand);


        Mercedes m = new Mercedes("BMW", "sportsCar", 4, true, "Red", true, 90, 'f');
        m.acceleration();
        System.out.println(m.brand);



    }}


