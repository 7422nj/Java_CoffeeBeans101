package Challenges.MinutesToSeconds;

public class HoursToMinsAndSeconds {

    static void ConvertHours(int n){

        int minutes = n*60;

        int seconds = n*3600;

        System.out.println("Minutes = "+minutes+" , Seconds = "+seconds);
    }
    public static void main(String[] args) {

        ConvertHours(345);

    }
}
