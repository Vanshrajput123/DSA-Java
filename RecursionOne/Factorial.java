
import java.util.Scanner;
public class Factorial {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        int fn = factorial(n - 1);

        return n * fn;
    }
}