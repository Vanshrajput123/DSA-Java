import java.util.Scanner;

public class book_allocation {

    public static int minPages(int[] pages, int students) {

        int low = pages[0];
        int high = 0;

        for (int i = 0; i < pages.length; i++) {
            low = Math.max(low, pages[i]);
            high += pages[i];
        }

        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(pages, students, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static boolean isPossible(int[] pages, int students, int maxPages) {

        int currentPages = 0;
        int studentCount = 1;

        for (int i = 0; i < pages.length; i++) {

            if (currentPages + pages[i] <= maxPages) {
                currentPages += pages[i];
            } else {
                studentCount++;
                currentPages = pages[i];
            }

            if (studentCount > students) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] pages = new int[n];

        System.out.println("Enter pages in each book:");

        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.println("Minimum Possible Maximum Pages: " + minPages(pages, students));

        sc.close();
    }
}