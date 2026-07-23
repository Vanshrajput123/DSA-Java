
import java.util.Scanner;

public class insertion_sort {

    public static void insertion_sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int item = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = item;
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

        insertion_sort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}