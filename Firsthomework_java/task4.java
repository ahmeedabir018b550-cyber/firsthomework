import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double q = (a + b + c) / 2.0;

        double s = Math.sqrt(q * (q - a) * (q - b) * (q - c));

        System.out.println(s);

        sc.close();
    }
}