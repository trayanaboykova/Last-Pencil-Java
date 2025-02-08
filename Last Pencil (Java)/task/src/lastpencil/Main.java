package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pencils would you like to use?");
        int number = scanner.nextInt();
        String firstUser = "John";
        String secondUser = "Jack";
        System.out.println("Who will be the first (John, Jack)");
        String userInput = scanner.next();

        // Print pencils using vertical bar symbols
        for (int i = 0; i < number; i++) {
            System.out.print("|");
        }

        // Print the next line for "Your turn!" prompt
        System.out.println();
        if (firstUser.equals(userInput)) {
            System.out.printf("%s is going first\n", firstUser);
        } else {
            System.out.printf("%s is going first\n", secondUser);
        }
    }
}
