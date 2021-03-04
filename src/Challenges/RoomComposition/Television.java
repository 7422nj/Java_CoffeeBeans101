package Challenges.RoomComposition;

public class Television {

    // Variables
    private String channels;
    private boolean isSmartTv;

    // Constructor
    public Television(String channels, boolean isSmartTv) {
        this.channels = channels;
        this.isSmartTv = isSmartTv;
    }

    // Methods
    public String[] tvMenu(){
       return displayTvMenu();


    }
    public String[] displayTvMenu() {
        // Made String Array
        String[] displayTvMenu = {"Channels", "Display", "Settings", "Help", "SmartView"};
        System.out.println(" TV Menu Display : ");
        // For Loop
        for (String s:displayTvMenu) {
            // Print List
            System.out.println(" \t " + s);
        }
      return displayTvMenu;
    }
    public void powerOn(){
        System.out.println(" Television powers on");

    }
    public void powerOff(){
        System.out.println(" Television powers off");

    }

    // Getters
    public String getChannels() {
        return channels;
    }

    public boolean isSmartTv() {
        return isSmartTv;
    }
}
