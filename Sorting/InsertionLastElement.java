import java.util.Scanner;

public class InsertionLastElement {

    public static void insertLastElement(int[] arr, int index) {

        int item = arr[index];
        int j = index - 1;

        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = item;
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

        // Assumption: arr[0...n-2] is already sorted.
        insertLastElement(arr, n - 1);

        System.out.println("Array after inserting last element:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}