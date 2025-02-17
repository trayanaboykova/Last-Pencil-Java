import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSunny = scanner.nextBoolean();
        boolean isRainy = scanner.nextBoolean();
        boolean isCold = scanner.nextBoolean();

        // Calculate and print decision
        boolean canGoToBeach = isSunny && !isRainy && !isCold;

        // Print the result
        System.out.println(canGoToBeach);

        scanner.close();
    }
}