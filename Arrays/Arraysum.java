/*
 * Topic : Sum of Array Elements
 * Problem : Find the sum of all elements in an array
 * Language : Java
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

import java.util.Scanner;

public class Arraysum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of Array Elements: " + sum);

        sc.close();
    }
}