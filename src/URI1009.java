import java.util.Locale;
import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double salarioFinal = (vendas * 0.15) + salario;

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        sc.close();



    }
}
