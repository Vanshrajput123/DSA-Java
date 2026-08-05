
import java.util.Scanner;

public class CoinToss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tosses: ");
        int n = sc.nextInt();

        System.out.println("Possible Outcomes:");

        printCoinToss(n, "");

        sc.close();
    }

    public static void printCoinToss(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        printCoinToss(n - 1, ans + "H");
        printCoinToss(n - 1, ans + "T");
    }
}