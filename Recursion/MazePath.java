
public class MazePath {

    public static void main(String[] args) {

        int rows = 4;
        int cols = 5;

        System.out.println("\n" + printPath(0, 0, rows - 1, cols - 1, ""));
    }

    // cc -> current column, cr -> current row
    // ec -> end column, er -> end row
    public static int printPath(int cc, int cr, int ec, int er, String path) {

        if (cr == er && cc == ec) {
            System.out.println(path);
            return 1;
        }

        if (cr > er || cc > ec) {
            return 0;
        }

        int horizontal = printPath(cc + 1, cr, ec, er, path + "H");
        int vertical = printPath(cc, cr + 1, ec, er, path + "V");

        return horizontal + vertical;
    }
}