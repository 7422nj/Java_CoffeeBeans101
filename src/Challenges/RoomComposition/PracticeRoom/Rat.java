package Challenges.RoomComposition.PracticeRoom;

public class Rat {

    private String name;
    private int age;

    public Rat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void bestFriend(){
        System.out.println("Rat's best friend is parrot");
    }
    public void isOld(){
        System.out.println(" Rat is "+age+ " years old ");

    }
}
