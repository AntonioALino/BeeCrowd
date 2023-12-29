import java.io.IOException;
import java.util.*;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int averageSpeed = scanner.nextInt();

        double litersNeeded = (double) (time * averageSpeed) / 12;

        System.out.printf("%.3f\n", litersNeeded);

    }

}