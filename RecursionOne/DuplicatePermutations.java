package RecursionOne;
import java.util.Scanner;

public class DuplicatePermutations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("Unique Permutations:");

        printPermutations(str, "");

        sc.close();
    }

    public static void printPermutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            boolean duplicate = false;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {

                String left = str.substring(0, i);
                String right = str.substring(i + 1);

                printPermutations(left + right, ans + ch);
            }
        }
    }
}