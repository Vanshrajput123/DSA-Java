import java.util.Scanner;

public class transpose {

    public static void transpose(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr[0].length; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        transpose(arr);

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}