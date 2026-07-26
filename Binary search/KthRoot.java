
import java.util.Scanner;

public class KthRoot {

    public static int kthRoot(int n, int k) {

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (Math.pow(mid, k) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        System.out.println("K-th Root: " + kthRoot(n, k));

        sc.close();
    }
}