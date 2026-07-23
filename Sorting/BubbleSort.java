package Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int turn = 1; turn < arr.length; turn++) {

            for (int i = 0; i < arr.length - turn; i++) {

                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
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

        bubbleSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}