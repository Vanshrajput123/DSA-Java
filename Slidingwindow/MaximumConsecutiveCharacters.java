package Slidingwindow;

import java.util.Scanner;

public class MaximumConsecutiveCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum flips: ");
        int k = sc.nextInt();

        System.out.print("Enter the string: ");
        String str = sc.next();

        int flipA = maxLength(str, 'a', k);
        int flipB = maxLength(str, 'b', k);

        System.out.println("Maximum Length: " + Math.max(flipA, flipB));

        sc.close();
    }

    public static int maxLength(String str, char ch, int k) {

        int si = 0;
        int ei = 0;
        int ans = 0;
        int flip = 0;

        while (ei < str.length()) {

            if (str.charAt(ei) == ch) {
                flip++;
            }

            while (flip > k && si <= ei) {

                if (str.charAt(si) == ch) {
                    flip--;
                }

                si++;
            }

            ans = Math.max(ans, ei - si + 1);
            ei++;
        }

        return ans;
    }
}