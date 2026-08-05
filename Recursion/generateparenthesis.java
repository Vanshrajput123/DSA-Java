
    

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generateparenthesis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();

        List<String> result = new ArrayList<>();

        generateParentheses(n, 0, 0, "", result);

        System.out.println("Valid Parentheses:");
        System.out.println(result);

        sc.close();
    }

    public static void generateParentheses(int n, int open, int close, String ans, List<String> result) {

        if (open == n && close == n) {
            result.add(ans);
            return;
        }

        if (close < open) {
            generateParentheses(n, open, close + 1, ans + ")", result);
        }

        if (open < n) {
            generateParentheses(n, open + 1, close, ans + "(", result);
        }
    }
}