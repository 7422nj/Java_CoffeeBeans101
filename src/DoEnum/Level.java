package DoEnum;

public enum Level {

    // In Enum We Don't Need To Write public static int or declare any dataTypes

    // These Elements Can Only Be in String Value
    Low(1), Medium(2), High(3); // Created are 3 Levels with parameters rating it from 1-3 of urgency

    //Variables
    static String lvl = "Very Much Needed";
    static int age = 4;

    //Method With A Parameter
    public void fixDisplay(int num) {
        System.out.println("This is Display has an Urgency Level of : " + num);

    }

    private int lvlNum; // Created a private variable


    Level(int num) { // Created a private constructor <-- you cannot make "public" constructors in Enum
        this.lvlNum = num;
    }
    //In Order To Reach This Data And Set New Value I Need To Create Getters and Setters for Private Variables

    // 1. Getter for private int lvlNum
    public int getLvl() {
        return this.lvlNum;
    }

    // 2. Setter for private int lvlNum
    public void setLvl(int num) {
        this.lvlNum = num;
    }

    //Enum inside an Enum <-- Urgency Enum inside Level Enum
    public enum Urgency {
        Low, Medium, High, Urgent;

        static int lv;
    }

    enum fastTest {
        Alm, Jira, IntelliJ
    }
    void fixNow(){

}
    Level(){

}


}
