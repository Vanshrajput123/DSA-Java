import java.util.Scanner;

public class firstBadVersion {

    static int firstBad;

    public static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    public static int firstBadVersion(int n) {

        int low = 1;
        int high = n;
        int ans = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of versions: ");
        int n = sc.nextInt();

        System.out.print("Enter first bad version: ");
        firstBad = sc.nextInt();

        System.out.println("First Bad Version: " + firstBadVersion(n));

        sc.close();
    }
}