package ExtraExercises;

public class CalculateSalary {


    public static void main(String[] args) {

        CalculateSalary cs = new CalculateSalary();

        System.out.println(cs.calculateSalary(23 * 8 * 10));

    }
     int hours = 0;
     int biWeekly = 0;
     int hourlyPay = 0;
     int i;

    public int calculateSalary(int TotalSalary) {

        int Salary = hourlyPay * hours * biWeekly;

        while (i == Salary) {

            TotalSalary++;
        }

        return TotalSalary;
    }
}
