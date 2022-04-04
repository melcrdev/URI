import java.util.Locale;
import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dif1 = x2 - x1;
        double dif2 = y2 - y1;

        double diferenca = Math.sqrt((dif1 * dif1) + (dif2 * dif2));

        System.out.printf("%.4f%n", diferenca);

    }
}
