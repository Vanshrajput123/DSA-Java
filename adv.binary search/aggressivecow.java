import java.util.Arrays;
import java.util.Scanner;

public class aggressivecow {

    public static int maxMinimumDistance(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(stalls, cows, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static boolean isPossible(int[] stalls, int cows, int minDistance) {

        int lastPosition = stalls[0];
        int placedCows = 1;

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - lastPosition >= minDistance) {
                placedCows++;
                lastPosition = stalls[i];
            }

            if (placedCows == cows) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stalls: ");
        int n = sc.nextInt();

        int[] stalls = new int[n];

        System.out.println("Enter stall positions:");

        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }

        System.out.print("Enter number of cows: ");
        int cows = sc.nextInt();

        System.out.println("Maximum Minimum Distance: " + maxMinimumDistance(stalls, cows));

        sc.close();
    }
}