package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class AddTwoNumber {

    public static void addNumbers(int[] arr1, int[] arr2) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {

            int sum = arr1[i] + arr2[j] + carry;

            result.add(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        while (i >= 0) {

            int sum = arr1[i] + carry;

            result.add(sum % 10);
            carry = sum / 10;

            i--;
        }

        while (j >= 0) {

            int sum = arr2[j] + carry;

            result.add(sum % 10);
            carry = sum / 10;

            j--;
        }

        if (carry > 0) {
            result.add(carry);
        }

        System.out.print("Sum: ");

        for (int k = result.size() - 1; k >= 0; k--) {
            System.out.print(result.get(k) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter first array elements:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        addNumbers(arr1, arr2);

        sc.close();
    }
}