import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed

        // Add your while loop or do-while loop here to process input temperatures
        while (true) {
            int currentTemperature = scanner.nextInt(); // Read the next temperature value

            // Check if the current temperature is 100 or more
            if (currentTemperature >= 100) {
                break; // Exit the loop
            }

            // Update maxTemperature if the currentTemperature is higher
            if (currentTemperature > maxTemperature) {
                maxTemperature = currentTemperature;
            }
        }

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}