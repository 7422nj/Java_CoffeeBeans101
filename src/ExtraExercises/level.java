package ExtraExercises;

import java.util.HashMap;

public class level {
    public static void employeeJobLevel(HashMap<Integer,String> level) throws Exception{
        String x;

        HashMap<Integer, String> levels = new HashMap<>();

        levels.put(1, "Intern");
        levels.put(2, "Entry Level");
        levels.put(3, "Mid-Level");
        levels.put(4, "Manager");
        levels.put(5, "Boss");
        levels.put(6, "CEO");



        }



    public static void main(String[] args) {
        level l = new level();
        System.out.println(l.equals("Intern"));
    }
}


//        String arr[] = {"Intern", "Entry Level", "Mid Level", "Manager", "Boss", "CEO"};
//        for (String level : arr) {
//            System.out.println(level);
//            return level;
//        }
//
//        return null;



//
//    public static void main(String[] args) {
//        level l = new level();
//        l.employeeJobLevel();
//    }
//}
