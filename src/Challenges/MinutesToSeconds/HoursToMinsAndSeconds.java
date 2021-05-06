package Challenges.MinutesToSeconds;


final class HoursToMinsAndSeconds {

    static void ConvertHours(int n){

        //-> 60 seconds in a minute
        int minutes = n*60;

        //-> 3600 seconds in in an hour
        int seconds = n*3600;

        System.out.println("Minutes = "+minutes+" , Seconds = "+seconds);
    }
    public static void main(String[] args) {

        ConvertHours(345);

    }
}
