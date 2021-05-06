package Challenges.MathClass;

public class MathFunctionalities {

    public static void main(String[] args) {

        //Create variables
        int g = 7;
        int u = 78;

        //Get Max
        System.out.println("Max of g & u = " + Math.max(g, u));

        //Get Min
        System.out.println("Min of g & u = " + Math.min(g, u));

        //Get Random Number Starting from 1.0
        double f = Math.random() / Math.nextDown(1.0);

        //Get Max using getMax Method Below
        System.out.println("Max of x & c = " + getMax(3, 30));

        //Get Min using getMin Method Below
        System.out.println("Min of x & y = " + getMin(3, 30));
    }

    //Method to Get Max
    public static int getMax(int x, int c) {
        return Math.max(x, c);
    }

    //Method to Get Min
    public static int getMin(int x, int y) {
        return Math.min(x, y);
    }
}

