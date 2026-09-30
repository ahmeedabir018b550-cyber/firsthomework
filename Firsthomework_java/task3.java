import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int width = x2 - x1;
        int height = y1 - y2;

        int s = width * height;
        int p = 2 * (width + height);

        System.out.println("s = " + s);
        System.out.println("p = " + p);

        sc.close();
    }
}