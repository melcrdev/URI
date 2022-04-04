import java.util.Locale;
import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int horasTrab = sc.nextInt();
        double horasRec = sc.nextDouble();
        double s = horasTrab * horasRec;

        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f%n", s);

        sc.close();

    }
}
