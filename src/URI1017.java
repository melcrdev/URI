import java.util.Locale;
import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tg = sc.nextInt();
        int vm = sc.nextInt();

        double km = tg * vm;
        double litros = km / 12;

        System.out.printf("%.3f%n", litros);
    }
}
