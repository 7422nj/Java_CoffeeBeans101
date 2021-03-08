package Challenges.RoomComposition.PracticeRoom;

public class Lion {

    private String name;
    private int age;

    public Lion(String name, int age) {
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
        System.out.println("Lion's favorite food is meat");
    }
    public void hoursOfSleep(){
        System.out.println("Lion sleeps for 10 hours");
    }

    }

