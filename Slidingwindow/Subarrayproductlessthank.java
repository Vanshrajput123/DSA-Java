package Slidingwindow;
import java.util.Scanner;
public class Subarrayproductlessthank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        System.out.println("Count of Subarrays: " + countSubarrays(arr, k));

        sc.close();
    }

    public static int countSubarrays(int[] arr, int k) {

        if (k <= 1) {
            return 0;
        }

        int si = 0;
        int ei = 0;
        int product = 1;
        int ans = 0;

        while (ei < arr.length) {

            product *= arr[ei];

           
            while (product >= k && si <= ei) {
                product /= arr[si];
                si++;
            }

           
            ans += (ei - si + 1);

            ei++;
        }

        return ans;
    }
}