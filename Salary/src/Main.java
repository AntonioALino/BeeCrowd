import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        float salary = scanner.nextFloat();
        float totalSalary = hoursWorked * salary;

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.02f\n", totalSalary);
    }
}