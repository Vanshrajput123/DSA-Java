package ArrayList;
import java.util.Scanner;

public class CbNumber {

    public static int countCbNumbers(String str) {

        int count = 0;
        boolean[] visited = new boolean[str.length()];

        for (int len = 1; len <= str.length(); len++) {

            for (int j = len; j <= str.length(); j++) {

                int i = j - len;

                String sub = str.substring(i, j);
                long num = Long.parseLong(sub);

                if (isCbNumber(num) && isValid(visited, i, j)) {

                    count++;

                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }

        return count;
    }

    public static boolean isValid(boolean[] visited, int start, int end) {

        for (int i = start; i < end; i++) {

            if (visited[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isCbNumber(long num) {

        if (num == 0 || num == 1) {
            return false;
        }

        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        for (int p : prime) {
            if (num == p) {
                return true;
            }
        }

        for (int p : prime) {
            if (num % p == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numeric string: ");
        String str = sc.next();

        System.out.println("Number of CB Numbers: " + countCbNumbers(str));

        sc.close();
    }
}