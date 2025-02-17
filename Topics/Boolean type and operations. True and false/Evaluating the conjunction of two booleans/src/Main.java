import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object to read the input
        Scanner in = new Scanner(System.in);

        // Read two boolean inputs
        boolean bool1 = in.nextBoolean();
        boolean bool2 = in.nextBoolean();

        // Logic to find the AND operation of 2 booleans goes here
        boolean result = bool1 && bool2;

        // Print the result
        System.out.println(result);

        // Close the scanner
        in.close();
    }
}