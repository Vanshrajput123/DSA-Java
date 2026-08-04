
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Number: " + fibonacci(n));

        sc.close();
    }

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int first = fibonacci(n - 1);
        int second = fibonacci(n - 2);

        return first + second;
    }
}