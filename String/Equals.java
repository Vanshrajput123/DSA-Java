package String;
import java.util.Scanner;

public class Equals {

    public static boolean equals(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        System.out.println("Built-in equals(): " + s1.equals(s2));
        System.out.println("Custom equals(): " + equals(s1, s2));

        sc.close();
    }
}
