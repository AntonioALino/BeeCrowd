import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float MEDIA = ((float) (A * 3.5 + B * 7.5) / 11);

        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }
}