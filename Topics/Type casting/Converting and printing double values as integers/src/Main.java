import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        double number = Double.parseDouble(scanner.nextLine());

        // Convert and print the number to an integer.
        int convertedNumber = (int) number;

        System.out.println(convertedNumber);

        scanner.close();
    }
}