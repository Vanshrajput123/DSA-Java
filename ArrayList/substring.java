package ArrayList;
import java.util.Scanner;

public class substring{

    public static void printSubstrings(String str) {

        for (int len = 1; len <= str.length(); len++) {

            for (int j = len; j <= str.length(); j++) {

                int i = j - len;

                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("Substrings by Length:");

        printSubstrings(str);

        sc.close();
    }
}