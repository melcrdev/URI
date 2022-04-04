import java.util.Locale;
import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cd1 = sc.nextInt();
        int n1 = sc.nextInt();
        double v1 = sc.nextDouble();

        int cd2 = sc.nextInt();
        int n2 = sc.nextInt();
        double v2 = sc.nextDouble();

        double total = (n1 * v1) + (n2 * v2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
