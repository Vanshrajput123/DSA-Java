

import java.util.Scanner;

public class FirstOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int index = firstOccurrence(arr, 0, target);

        System.out.println("First Occurrence Index: " + index);

        sc.close();
    }

    public static int firstOccurrence(int[] arr, int index, int target) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return firstOccurrence(arr, index + 1, target);
    }
}