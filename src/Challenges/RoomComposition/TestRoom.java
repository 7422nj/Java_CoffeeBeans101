package Challenges.RoomComposition;



public class TestRoom {
    public static void main(String[] args) {

        Sofa sofa = new Sofa("Therapeutic", 'm', "beige");
        Television tv = new Television("MTV Music", true);
        Wall wall = new Wall(30.5, 45.5);
        WorkoutArea workoutArea = new WorkoutArea("dumbbells", 10);
        Bed bed = new Bed("Therapeutic", 'l');

        Room room=new Room(tv, sofa, wall, workoutArea, bed);

        System.out.println("************************************************");

        // List Of Menu Options in Television
        //RoomClass.tvClass.MethodOfTVClass
        room.tv.displayTvMenu();

        System.out.println("************************************************");

        // Total Area of The Room
        System.out.println(" Total Area of Room : "+wall.getArea());
        // Inspection of Wiring in Room
        room.wall.wallWiringInspection();
        // I Practiced If Else
        // If wallHeight and wallWidth Matches The Condition Than We Will Know If Room Is Big Or Small
        System.out.println(" According to Height & Length : "+wall.myWall(31,35));

        System.out.println("************************************************");

        // List of The Exercise Equipments Available
        room.workoutArea.equipmentAvailable();

        System.out.println("************************************************");

        // Is The Sofa Comfortable?
        room.sofa.isComfortable();

        System.out.println("*************************************************");

        // Description of Bed
        room.bed.bedDescription();

        System.out.println("*************************************************");


    }

}