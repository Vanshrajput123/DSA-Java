// package RecursionOne;
import java.util.Scanner;
public class PrintInc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printIncreasing(n);

        sc.close();
    }

    public static void printIncreasing(int n) {

        if (n == 0) {
            return;
        }

        printIncreasing(n - 1);

        System.out.println(n);
    }
}