import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.nextLine(); // Read the shape type

        double area = 0.0;

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2; // Semi-perimeter
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
                break;

            case "rectangle":
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                area = length * width;
                break;

            case "circle":
                double r = scanner.nextDouble();
                area = 3.14 * r * r; // Using 3.14 instead of π
                break;

            default:
                System.out.println("Invalid shape type");
                return;
        }

        System.out.println(area);
    }
}