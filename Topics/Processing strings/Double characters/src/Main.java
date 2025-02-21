import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read input string

        StringBuilder doubledString = new StringBuilder();

        // Loop through each character and append it twice
        for (char ch : input.toCharArray()) {
            doubledString.append(ch).append(ch);
        }

        // Print the resulting string
        System.out.println(doubledString);
    }
}