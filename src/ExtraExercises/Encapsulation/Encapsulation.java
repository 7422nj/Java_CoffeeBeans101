package ExtraExercises.Encapsulation;

public class Encapsulation {

    //private variables <- only accessed in the class
    private String name="John";
    private int age=4;

    //constructor of defaut variable
    public Encapsulation(int x) {
        this.x = x;
    }

    // constructor of private and protected variables
    public Encapsulation(String name, int age, String favFood) {
        this.name = name;
        this.age = age;
        this.favFood = favFood;
    }

    // How To Make Getters And Setter
    // 1. Create Getter
    // 2. Create Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //public variable <- available everywhere
    public boolean isAvailable;

    //protected variable <- inside the package, but you can reach it in outside package by making child class
    protected String favFood;

    //default variable <- inside the package
    int x;
}
