package DoEnum;

public class TestLevel {
    public static void main(String[] args) {
        Level lvl = Level.Low;

        // If you want to doSomething with Enum or Store it, We Can turn into a String
        String en = lvl.toString(); // <-- Converts this to a String

        // Now if I want print all the Levels:
        // 1. I have to turn it into an Array
        // 2. Than do a simple For Loop to print all Levels
        // values() Returns an Array containing the constants of this enum type in the order they're declared
        Level[] array = Level.values();

        // Now We Can Set & Get Levels
        lvl.setLvl(5); // Created A Setter & Set A New Value
        System.out.println(lvl.getLvl()); // Created A Getter

        // Calling A Method with Parameter
        // Tells us Level of Urgency
        lvl.fixDisplay(2);

        // Called A Variable
        System.out.println(lvl.lvl);

        // Loops Through All Of The Levels By Using A For Loop
        for (Level e : array){
            System.out.println(e); // Prints all the Levels
        }

        if (lvl == Level.Low){
            System.out.println(lvl);
        }else if (lvl == Level.Medium) {
            System.out.println(lvl);
        }else{
            System.out.println(lvl);

        }
    }
}
