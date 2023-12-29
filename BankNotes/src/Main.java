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

        int money = scanner.nextInt();

        int current = money;
        int bankNotes100 = current / 100;
        current -= bankNotes100 * 100;
        int bankNotes50 = current/50;
        current -= bankNotes50 * 50;
        int bankNotes20 = current/20;
        current -= bankNotes20 * 20;
        int bankNotes10 = current / 10;
        current -= bankNotes10 * 10;
        int bankNotes5 = current / 5;
        current -= bankNotes5 * 5;
        int bankNotes2 = current / 2;
        current -= bankNotes2 * 2;
        int bankNotes1 = current;

        System.out.println(money);
        System.out.println(bankNotes100 + " nota(s) de R$ 100,00");
        System.out.println(bankNotes50 + " nota(s) de R$ 50,00");
        System.out.println(bankNotes20 + " nota(s) de R$ 20,00");
        System.out.println(bankNotes10 + " nota(s) de R$ 10,00");
        System.out.println(bankNotes5 + " nota(s) de R$ 5,00");
        System.out.println(bankNotes2 + " nota(s) de R$ 2,00");
        System.out.println(bankNotes1 + " nota(s) de R$ 1,00");

    }

}