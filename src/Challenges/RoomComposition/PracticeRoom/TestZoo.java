package Challenges.RoomComposition.PracticeRoom;

public class TestZoo {
    public static void main(String[] args) {

    //How to Make An Object: className reference = new constructorOfClass();
    // Example: Pizza pizza=new Pizza();

    //Lion
    Lion lion = new Lion("Lion",2);
    //Turtle
    Turtle turtle = new Turtle("Turtle",3);
    //Shark
    Shark shark = new Shark("Shark",4);
    //Elephant
    Elephant elephant = new Elephant("Elephant",5);
    //Rat
    Rat rat = new Rat("Rat",35);
    //Zoo
    Zoo zoo = new Zoo(lion,turtle,shark,elephant,rat);

        System.out.println("**************************************************************");
    //Lion
    zoo.lion.favoriteFood();
        System.out.println("**************************************************************");
    //Turtle
    zoo.turtle.favoriteActivity();
        System.out.println("**************************************************************");
    //Shark
    zoo.shark.hoursOfSleep(12);
        System.out.println("**************************************************************");
    //Elephant
    zoo.elephant.habits();
        System.out.println("**************************************************************");
    //Rat
    zoo.rat.isOld();
        System.out.println("**************************************************************");


    }
}
