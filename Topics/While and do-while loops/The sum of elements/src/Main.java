import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberInput = scanner.nextInt();
        int sum = 0;

        while (numberInput > 0) {
            sum += numberInput;
            numberInput = scanner.nextInt();
        }
        System.out.println(sum);
    }
}