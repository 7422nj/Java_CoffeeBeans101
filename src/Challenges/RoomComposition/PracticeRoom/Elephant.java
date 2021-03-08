package Challenges.RoomComposition.PracticeRoom;

public class Elephant {

    private String name="Azadeh";
    private int age;

    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void height(){
        System.out.println("Elephant is tall");
    }
    public  void habits(){
        System.out.println(name+ " likes to bully parrots ");
    }

}
