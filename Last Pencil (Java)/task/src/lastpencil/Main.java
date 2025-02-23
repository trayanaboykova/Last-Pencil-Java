package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencils = 0;
        System.out.println("How many pencils would you like to use:");
        while (true) {
            String input = scanner.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("The number of pencils should be numeric");
            } else {
                pencils = Integer.parseInt(input);
                if (pencils == 0) {
                    System.out.println("The number of pencils should be positive");
                } else {
                    break;
                }
            }
        }

        String player1 = "John";
        String player2 = "Jack";
        System.out.println("Who will be the first (" + player1 + ", " + player2 + "):");
        String currentPlayer = scanner.nextLine();
        while (!currentPlayer.equals(player1) && !currentPlayer.equals(player2)) {
            System.out.println("Choose between '" + player1 + "' and '" + player2 + "'");
            currentPlayer = scanner.nextLine();
        }

        while (pencils > 0) {
            System.out.println("|".repeat(pencils));
            System.out.println(currentPlayer + "'s turn!");

            int removal = 0;
            if (currentPlayer.equals("Jack")) { // Bot's turn
                if (pencils == 1) {
                    removal = 1;
                } else if (pencils % 4 == 1) {
                    // Losing position: choose any valid move (here we always choose 1)
                    removal = 1;
                } else if (pencils % 4 == 0) {
                    removal = 3;
                } else if (pencils % 4 == 3) {
                    removal = 2;
                } else if (pencils % 4 == 2) {
                    removal = 1;
                }
                System.out.println(removal);
            } else { // Human's turn
                while (true) {
                    String removalInput = scanner.nextLine();
                    if (!removalInput.matches("\\d+")) {
                        System.out.println("Possible values: '1', '2' or '3'");
                        continue;
                    }
                    removal = Integer.parseInt(removalInput);
                    if (removal < 1 || removal > 3) {
                        System.out.println("Possible values: '1', '2' or '3'");
                        continue;
                    }
                    if (removal > pencils) {
                        System.out.println("Too many pencils were taken");
                        continue;
                    }
                    break;
                }
            }

            pencils -= removal;
            if (pencils == 0) {
                // The player who takes the last pencil loses.
                String winner = currentPlayer.equals(player1) ? player2 : player1;
                System.out.println(winner + " won!");
                break;
            }
            // Swap turns
            currentPlayer = currentPlayer.equals(player1) ? player2 : player1;
        }

        scanner.close();
    }
}
