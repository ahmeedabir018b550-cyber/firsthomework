import java.util.Scanner;

public class DigitalClockTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for hours, minutes, and seconds
        System.out.print("Enter hours (0-23): ");
        int h = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int m = scanner.nextInt();

        System.out.print("Enter seconds (0-59): ");
        int s = scanner.nextInt();

        // Increment the time by 1 second
        s++;

        // Handle seconds rollover
        if (s == 60) {
            s = 0;
            m++;
        }

        // Handle minutes rollover
        if (m == 60) {
            m = 0;
            h++;
        }

        // Handle hours rollover (24-hour format)
        if (h == 24) {
            h = 0;
        }

        // Display the output format
        System.out.printf("Time one second later: %02d:%02d:%02d\n", h, m, s);

        scanner.close();
    }
}
