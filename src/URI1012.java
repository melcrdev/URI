import java.util.Locale;
import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTriR = (A * C) / 2;
        double areaC = 3.14159 * Math.pow(C, 2);
        double areaTrap = ((A + B) * C) / 2;
        double areaQ = Math.pow(B, 2);
        double areaR = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriR);
        System.out.printf("CIRCULO: %.3f%n", areaC);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
        System.out.printf("QUADRADO: %.3f%n", areaQ);
        System.out.printf("RETANGULO: %.3f%n", areaR);

        sc.close();

    }
}
