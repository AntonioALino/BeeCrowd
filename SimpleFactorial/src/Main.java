import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
        int factorial = scanner.nextInt();

        if (factorial > 0 && factorial < 13){
            for (int i = 0; i < factorial; i++){
                N *= factorial - i;
            }
        }   System.out.println(N);
    }
}