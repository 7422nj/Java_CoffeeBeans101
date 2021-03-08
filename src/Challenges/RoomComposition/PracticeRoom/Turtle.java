package Challenges.RoomComposition.PracticeRoom;

public class Turtle {

    private String name;
    private int age;

    public Turtle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void favoriteActivity(){
        System.out.println("Turtle likes to swim");
    }
    public void favoriteFood(){
        System.out.println("Turtle's favorite food is lettuce");
    }


    }

