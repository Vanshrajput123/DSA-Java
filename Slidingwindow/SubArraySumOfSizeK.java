package Slidingwindow;

import java.util.Scanner;

public class SubArraySumOfSizeK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        System.out.println("Maximum Sum: " + maxSumOfSizeK(arr, k));

        sc.close();
    }

    public static int maxSumOfSizeK(int[] arr, int k) {

        int sum = 0;

     
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int ans = sum;

        // Sliding the window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];       // Grow
            sum -= arr[i - k];   // Shrink
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}