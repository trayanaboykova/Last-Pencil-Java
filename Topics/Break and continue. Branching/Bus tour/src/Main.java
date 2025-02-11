import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // Read the height of the bus and the number of bridges
        int busHeight = scanner.nextInt();
        int numBridges = scanner.nextInt();

        // Read the heights of the bridges
        int[] bridgeHeights = new int[numBridges];
        for (int i = 0; i < numBridges; i++) {
            bridgeHeights[i] = scanner.nextInt();
        }

        // Check if the bus will crash into any bridge
        for (int i = 0; i < numBridges; i++) {
            if (busHeight >= bridgeHeights[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                return;  // Exit the program once the crash is detected
            }
        }

        // If no crash, print "Will not crash"
        System.out.println("Will not crash");
    }
}