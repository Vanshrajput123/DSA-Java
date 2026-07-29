package String;


import java.util.Scanner;

public class CompareTo {

    public static int compareTo(String s1, String s2) {


        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return s1.length() - s2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        System.out.println("Built-in compareTo(): " + s1.compareTo(s2));
        System.out.println("Custom compareTo(): " + compareTo(s1, s2));

        sc.close();
    }
}