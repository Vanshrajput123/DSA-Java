/*
 * Topic : Maximum Element in Array
 * Language : Java
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element: " + max);

        sc.close();
    }
}