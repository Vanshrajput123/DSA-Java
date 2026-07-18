    /*
 * Topic : Minimum Element in Array
 * Problem : Find the smallest element in an array
 * Language : Java
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */


import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element: " + min);

        sc.close();
    }
}
    

