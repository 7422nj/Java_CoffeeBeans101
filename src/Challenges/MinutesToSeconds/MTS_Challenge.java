package Challenges.MinutesToSeconds;

import java.util.Scanner;

public class MTS_Challenge {

    public static void ConvertSeconds(int Seconds){ //Method that return the int of seconds of Seconds

      int minutes = Seconds*60; //multiply int sec(total # of Seconds) to 60 seconds in a Seconds

        System.out.println("Total Number of Seconds = " +minutes); // print "seconds=" print value of totalNumberOfMinutes*60seconds
    }
    public static void main(String[] args) {

        ConvertSeconds(5); // calling the method to convert
    }

}

