import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double fixedSalary = scanner.nextDouble();
        double salesTotalMade = scanner.nextDouble();

        double totalSalary = fixedSalary + (salesTotalMade * ((double) 15 / 100) );

        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);

    }
}