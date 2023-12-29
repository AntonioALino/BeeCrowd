import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int distanceInMinutes = (60 * distance) / 30;

        System.out.println(distanceInMinutes + " minutos");
    }

}