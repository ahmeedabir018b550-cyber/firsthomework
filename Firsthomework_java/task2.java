import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();
        double price = sc.nextDouble();

        double area = length * width;
        double totalCost = area * 1.05 * price;

        System.out.println(totalCost);

        sc.close();
    }
}