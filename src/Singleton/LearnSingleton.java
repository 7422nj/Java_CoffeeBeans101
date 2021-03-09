package Singleton;

public class LearnSingleton {
    // Singleton class: we are allowed to create one instance of a class at a time.
    // Using private constructor we can ensure that no more than one object can be  created at a time.

    // Created a String Variable
    String collegeName="Queens College";
    String favoriteActivity="Sleep";

    // Private Constructor So No More Than One Object Can Be Created At A Time
    LearnSingleton(){

    }
    // Create a instance variable/ object
    public static LearnSingleton instance= new LearnSingleton();
    // Crate a return type of method
    public static LearnSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        LearnSingleton learn= new LearnSingleton();


    }
}
