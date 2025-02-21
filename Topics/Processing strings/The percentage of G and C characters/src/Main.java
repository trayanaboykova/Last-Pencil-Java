import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine().toUpperCase(); // Convert input to uppercase

        int gcCount = 0;
        int totalLength = sequence.length();

        // Count occurrences of G and C
        for (char nucleotide : sequence.toCharArray()) {
            if (nucleotide == 'G' || nucleotide == 'C') {
                gcCount++;
            }
        }

        // Calculate percentage
        double gcPercentage = (double) gcCount / totalLength * 100;

        // Print result without formatting
        System.out.println(gcPercentage);
    }
}