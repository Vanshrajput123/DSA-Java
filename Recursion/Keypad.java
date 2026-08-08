import java.util.*;

public class Keypad {

    static String[] code = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String ques = "23";
        List<String> ll = new ArrayList<>();

        printAnswer(ques, "", ll);

        System.out.println(ll);
    }

    public static void printAnswer(String ques, String ans, List<String> ll) {
        if (ques.length() == 0) {
            ll.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        String press = code[ch - '0'];

        for (int i = 0; i < press.length(); i++) {
            printAnswer(ques.substring(1), ans + press.charAt(i), ll);
        }
    }
}