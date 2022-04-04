import java.util.Locale;
import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double PI = 3.14159;
        double area = PI * Math.pow(R, 2);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
