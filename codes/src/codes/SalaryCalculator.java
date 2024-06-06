package codes;
import java.util.Scanner;
public class SalaryCalculator {
    public static int calculateSal(int salary, int shifts) {
        if (salary > 8000) {
            System.out.println("Salary too large");
            return -1;
        } else if (salary < 0) {
            System.out.println("Salary too small");
            return -1;
        } else if (shifts < 0) {
            System.out.println("Shifts too small");
            return -1;
        }
        double foodExpense = 0.20 * salary;
        double travelExpense = 0.30 * salary;
        double extraEarnings = 0.02 * salary * shifts;
        double savings = salary - foodExpense - travelExpense + extraEarnings;
        return (int) savings;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter number of shifts: ");
        int shifts = scanner.nextInt();
        int savings = calculateSal(salary, shifts);
        if (savings != -1) {
            System.out.println("Savings: " + savings);
        }
        scanner.close();
    }
}
