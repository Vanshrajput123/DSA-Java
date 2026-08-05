

import java.util.Scanner;

public class CountSubsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int count = printSubsequences(str, "");

        System.out.println("\nTotal Subsequences: " + count);

        sc.close();
    }

    public static int printSubsequences(String str, String ans) {

        if (str.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }

        char ch = str.charAt(0);

        int exclude = printSubsequences(str.substring(1), ans);

        int include = printSubsequences(str.substring(1), ans + ch);

        return exclude + include;
    }
}