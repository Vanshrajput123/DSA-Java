package String;


import java.util.Scanner;

public class PrintAllSubstrings {

    public static void printSubstrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("All Substrings:");

        printSubstrings(str);

        sc.close();
    }
}