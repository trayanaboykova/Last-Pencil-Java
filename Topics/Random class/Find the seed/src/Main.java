import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int optimalSeed = A;
        int minMaxValue = Integer.MAX_VALUE;

        for (int seed = A; seed <= B; seed++) {
            Random random = new Random(seed);
            int currentMax = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                int num = random.nextInt(K);
                currentMax = Math.max(currentMax, num);
            }

            if (currentMax < minMaxValue) {
                minMaxValue = currentMax;
                optimalSeed = seed;
            }
        }

        System.out.println(optimalSeed);
        System.out.println(minMaxValue);
    }
}