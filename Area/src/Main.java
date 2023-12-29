import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14159;
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double triangleArea = A*C / 2;
        double radiusArea = pi * Math.pow(C, 2);
        double trapeziumArea = ((A + B) * C) / 2;
        double squareArea =  B * B ;
        double rectangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangleArea);
        System.out.printf("CIRCULO: %.3f\n", radiusArea);
        System.out.printf("TRAPEZIO: %.3f\n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f\n", squareArea);
        System.out.printf("RETANGULO: %.3f\n", rectangleArea);

    }
}