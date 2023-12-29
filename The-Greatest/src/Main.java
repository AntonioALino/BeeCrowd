import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int MaiorAB = (A + B + Math.abs(A - B)) / 2;
        int MaiorC = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;

        System.out.printf("%d eh o maior\n", MaiorC);

    }
}