package ExtraExercises;

public class Final {
    //Using the final keyword means that the value can't be modified in the future.

    // Final with Value Assigned
    static final int num=4;

    // Final Without Value, Than Later on Assigning Value
    static final int data;

    static{data=3;}

    public static void main(String[] args) {
        System.out.println(data);
        System.out.println(num);
    }
}
