import java.util.Scanner;

public class LC26_RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int length = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + length);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
