package ExtraExercises;

public class Singleton {

    private static Singleton single=new Singleton();

    Singleton() {
    }
    public static Singleton getInstance(){
        return getInstance();
    }
}
