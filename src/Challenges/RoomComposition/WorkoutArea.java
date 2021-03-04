package Challenges.RoomComposition;

public class WorkoutArea {

    // Variables
    private String equipmentType;
    private int numberOfEquipments;

    // Constructor
    public WorkoutArea(String equipmentType, int numberOfEquipments) {
        this.equipmentType = equipmentType;
        this.numberOfEquipments = numberOfEquipments;
    }
    // Getters
        public String getEquipmentType() {
            return equipmentType;
        }

        public int getNumberOfEquipments() {
            return numberOfEquipments;
        }

        // Methods
    public void workoutHours(){
        System.out.println(" Exercise for at least 1-2 hours");
    }


    public void equipmentAvailable(){
        // Made a String Array
        String[] equipmentAvailable={"Dumbbells","Elastic Rope Board","Push Up Roller"};
        System.out.println("Equipments Available : ");
        // For Loop
        for (String s:equipmentAvailable){
            // Print List
            System.out.println("\t" + s);
        }

    }
}
