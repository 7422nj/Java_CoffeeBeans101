package Java101;

public class exampleDay {

    //Default Constructor = Which comes already built into your class
    //To make a standard constructor you type public className(){
//    public exampleDay(){ }
    //Constructor with Parameter
    public exampleDay(String roomObject){}
    //Constructor overloading
    public exampleDay(String roomObject,String roomColor){}


    //Variable
    String roomObject = "sofa";
    String roomColor = "red";

    //Method
    public int roomSize(int length,int width){
        int roomSize = length*width;
        return roomSize; }


    public static void main(String[] args) {
        exampleDay example = new exampleDay("tv","black");
        example.roomSize(20,50);
        System.out.println("Room Size is : "+example.roomSize(20,50));


    }
}
