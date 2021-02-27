package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    // Declared a static int variable
    static int menu; // what we want the name of menu
    // Static String variable
    static String juice; // what we have in the restaurant

    // main method
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("Enter What Kind Of Juice You Want: ");
        menu = in.nextInt();
        switch (menu) { // switch menu;
            case 1: // cases
                juice = "Cranberry"; // String juice;
                break;
            case 2:
                juice = "Apple";
                break;
            case 3:
                juice = "Strawberry";
                break;
            case 4:
                juice = "Orange";
                break;
            case 5:
                juice = "Pineapple";
                break;
            case 6:
                juice = "Grape";
                break;
            case 7:
                juice = "Tomato Juice";
                break;
            default: // default in case no valid juice was selected
                juice = "Not A Valid Juice";
                break;
        }
        System.out.println("Item You Selected Is: " + juice);
    }

}
