package lastpencil;

public class Main {
    public static void main(String[] args) {
        // Number of pencils on the table
        int numberOfPencils = 7;

        // Print pencils using vertical bar symbols
        for (int i = 0; i < numberOfPencils; i++) {
            System.out.print("|");
        }

        // Print the next line for "Your turn!" prompt
        System.out.println();
        System.out.println("Your turn!");
    }
}
