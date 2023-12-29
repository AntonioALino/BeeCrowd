import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double pi =  3.14159;
        int radius = scanner.nextInt();

        double volum =  (4.0/3) * pi * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volum);

    }
}