import java.util.Scanner;

public class LC42_TrappingRainWater {

    public static int trap(int[] height) {

        int n = height.length;

        int[] left = new int[n];
        left[0] = height[0];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        int[] right = new int[n];
        right[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int water = 0;

        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter height array:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("Trapped Water: " + trap(height));

        sc.close();
    }
}
