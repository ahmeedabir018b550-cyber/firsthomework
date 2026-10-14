import java.util.Scanner;

public class OlympicGamesTracker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (1896 or later) and follows the 4-year cycle
        if (year >= 1896 && (year - 1896) % 4 == 0) {
            // Calculate the Olympic edition number
            int edition = ((year - 1896) / 4) + 1;
            System.out.println(year + " is an Olympic year! It is edition number: " + edition);
        } else {
            System.out.println(year + " is not an Olympic year.");
        }

        // Close the scanner resource
        scanner.close();
    }
}
