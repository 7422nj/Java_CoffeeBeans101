package Java101;

public class Day2 {
    public static void main(String[] args) {

         //How to Make an Object: className reference = new constructorOfClass();
        //AccessModifiers lol = new AccessModifiers(); // without making a constructor in class
       //AccessModifiers l = new AccessModifiers(); // with default constructor in class

        Day1 day1 = new Day1(26,"Sami Sheikh","Cheese"); // constructor with parameters
        day1.pizzaName();
        day1.myAgeIs();
        day1.myNameIs();

        //When you want to Retreive a Variable that has Getter and Setter in Previous class
        // #1 is Setter
       day1.setFullName("Azadeh"); // Set Value - Setter
        // #2 is Getter
        System.out.println(day1.getFullName()); // Get Value - Getter

        // Single comment

        /**
         * Document commenting
         *
         */


    }
}
