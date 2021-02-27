package Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        // Created object for BMW Class
        BMW b = new BMW();
        b.acceleration();
        System.out.println(b.airBagIncluded);
        System.out.println(b.brand);    // brand should be BMW
        System.out.println(b.drivable);
        System.out.println(b.seatNumber);  // seat number should be 2
        b.deceleration();
        b.gearChanging();
        b.carMoving();
        b.steering();
        b.carWorks();


        // Created object for Honda Class
        Honda h=new Honda("Toyota","6",1000, 4, true, true);
        System.out.println(h.brand);           // Brand should be honda
        System.out.println(h.airBagIncluded);
        System.out.println(h.drivable);
        System.out.println(h.seatNumber);     // Seat number should be 4
        h.acceleration();
        h.deceleration();
        h.gearChanging();
        h.carMoving();
        h.steering();
        h.carWorks();


        // Created object for ICar Class
        ICarByApple i=new ICarByApple("ICar","5",111,4,true,true,11-22-22,'l',1.1,12);
        System.out.println(i.brand);              // Brand name should ICar
        System.out.println(i.airBagIncluded);
        System.out.println(i.seatNumber);
        i.acceleration();
        i.carMoving();
        i.gearChanging();
        i.deceleration();
        i.touchScreenDisplay();
    }
}
