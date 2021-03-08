package Challenges.RoomComposition.PracticeRoom;

public class Shark {

    private String name;
    private int age;
    public int sleep;

    public Shark(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void favoriteFood(){
        System.out.println("Shark's favorite food is humans+parrots");
    }
    public void hoursOfSleep(int sleep){ //MethodOverloading: Using Same Method With Parameters
        System.out.println(" Shark sleeps for " +sleep+ " hours ");


    }
}
