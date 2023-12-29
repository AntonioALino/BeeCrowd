import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codeProduct1 = scanner.nextInt();
        int qntProduct1 = scanner.nextInt();
        double priceProduct1 = scanner.nextDouble();

        int codeProduct2 = scanner.nextInt();
        int qntProduct2 = scanner.nextInt();
        double priceProduct2 = scanner.nextDouble();

        double totalToPay = (qntProduct1 * priceProduct1) + (qntProduct2 * priceProduct2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalToPay);
    }
}