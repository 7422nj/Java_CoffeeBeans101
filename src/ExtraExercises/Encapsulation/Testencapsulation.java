package ExtraExercises.Encapsulation;

public class Testencapsulation {
    public static void main(String[] args) {

        Encapsulation cap = new Encapsulation(5); //String name, int age, String favFood

        //How to Create Getters And Setter
        // 1. Getter <- Get Value
        // 2. Setter <- Set Value
        //How to Receieve Getters And Setters
        // 1. Setter <- set a value <- ReAssign Value
        // 2. Getter <- get value

        //Private String Name
         cap.setName("Pizza Pizza");// how to write setter <- reference.setVariableName("ReAssign Value");
        System.out.println("The Name Is : "+cap.getName());// how to write getter <- System.out.println(reference.getVariableName);

        //Private Int Age
        cap.setAge(2);
        System.out.println("My Age Is : "+cap.getAge());

    }
}
