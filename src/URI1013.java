import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        int form1 = ((A + B) + (Math.abs(A - B))) / 2;
        int form2 = ((form1 + C) + (Math.abs(form1 - C))) / 2;

        System.out.println(form2 + " eh o maior");
    }
}
