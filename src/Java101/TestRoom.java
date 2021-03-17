package Java101;

import java.util.Scanner;

public class TestRoom {

     static int menu; // assigned what our switch <- 1. step
     static String iceCream; // declared what our case will contain <- 2. step

    public static void main(String[] args) {

        //How to make an object of Scanner class
        Scanner ice = new Scanner(System.in); //<-Scanner 3. step

        System.out.println("Pick a ice cream flavor : "); // gave a question to ask to start the switch case

        menu = ice.nextInt(); //Scan the iceCream menu and pick one by the integer entered
        // picked by integer values <- 4. step


        switch (menu){ // this is what we want to switch / choices <- 5. step

            case 1: // <- pick your own bag of chips according to it's assiged number <- 6. step

                iceCream = "Vanilla FLavor"; // <- assign flavor to iceCream <- 7. step

                break; // is used to break loop or switch statement <- 8. step

            case 2:
                iceCream = "Chocolate Flavor";
                break;
            case 3:
                iceCream = "Strawberry Flavor";
                break;
            default:
                iceCream = "Coffee Flavor";
        }
        System.out.println(" Choice of Ice Cream is : "+iceCream);

    }

}
