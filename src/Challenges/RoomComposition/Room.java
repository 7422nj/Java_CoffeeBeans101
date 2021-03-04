package Challenges.RoomComposition;

public class Room {

    // classType reference;
    Television tv;
    Sofa sofa;
    Wall wall;
    WorkoutArea workoutArea;
    Bed bed;

    // Constructor
    public Room(Television tv, Sofa sofa, Wall wall, WorkoutArea workoutArea, Bed bed) {
        this.tv = tv;
        this.sofa = sofa;
        this.wall = wall;
        this.workoutArea = workoutArea;
        this.bed = bed;
    }
}
