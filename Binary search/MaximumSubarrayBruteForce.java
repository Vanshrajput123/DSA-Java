import java.util.Scanner;

public class MaximumSubarrayBruteForce {

    public static int maxSubarraySum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {

                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));

        sc.close();
    }
}