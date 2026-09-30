import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int n = sc.nextInt();

        double k = (v * 12.0) / n;

        System.out.println(k);

        sc.close();
    }
}