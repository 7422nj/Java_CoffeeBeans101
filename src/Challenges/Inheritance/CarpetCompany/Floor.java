package Challenges.Inheritance.CarpetCompany;

public class Floor {

    // Variables
    double width;
    double length;


    // Getter for getArea Multiplying Width And Length
    public double getArea() {
        return width * length;
    }

    // Constructor Of Class
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;


        // If Width is Less Than 0, Than Value is 0
        if (width<0){
            this.width=0;
        }
        // If Length is Less Than 0, Than Value is 0
        if (length<0){
            this.length=0;
        }

    }
}

