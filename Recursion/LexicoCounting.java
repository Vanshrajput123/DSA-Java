
    

public class LexicoCounting {

    public static void main(String[] args) {
        int n = 1000;
        printCounting(0, n);
    }

    public static void printCounting(int curr, int n) {

        if (curr > n) {
            return;
        }

        System.out.println(curr);

        int start = 0;
        if (curr == 0) {
            start = 1;
        }

        for (int i = start; i <= 9; i++) {
            printCounting(curr * 10 + i, n);
        }
    }
}