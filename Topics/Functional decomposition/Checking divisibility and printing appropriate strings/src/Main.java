import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isDivisibleByBoth(number)) {
            System.out.println("FizzBuzz");
        } else if (isDivisibleByThree(number)) {
            System.out.println("Fizz");
        } else if (isDivisibleByFive(number)) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }

        scanner.close();
    }

    // Method to check divisibility by 3
    public static boolean isDivisibleByThree(int num) {
        return num % 3 == 0;
    }

    // Method to check divisibility by 5
    public static boolean isDivisibleByFive(int num) {
        return num % 5 == 0;
    }

    // Method to check divisibility by both 3 and 5
    public static boolean isDivisibleByBoth(int num) {
        return isDivisibleByThree(num) && isDivisibleByFive(num);
    }
}