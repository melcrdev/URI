import java.util.Locale;
import java.util.Scanner;

public class URI1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int dist = sc.nextInt();

        int calc = dist * 2;

        System.out.println(calc + " minutos");
    }
}
