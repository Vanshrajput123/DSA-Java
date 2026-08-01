package String;
import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        s1 = s1 + s2;

        String str1 = new String("hello");
        String str2 = new String("bye");

        str1 = str1 + str2;

        s2 = s2 + "okay";

        String s = "hey" + "bye";

        System.out.println("s1: " + s1);
        System.out.println("str1: " + str1);
        System.out.println("s2: " + s2);
        System.out.println("s: " + s);

        sc.close();
    }
}