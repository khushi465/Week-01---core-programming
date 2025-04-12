
import java.util.*;

public class P3 {

    public int findLength(String str) {
        int i = 0;
        char ch;
        while (true) {
            try {
                ch = str.charAt(i);
                i++;
            } catch (Exception e) {
                break;
            }
        }
        return i;
    }

    public String[][] splitWords(String str) {
        int spaces = 1;
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }
        String words[][] = new String[spaces][2];
        int j = 0;
        str = str + " ";
        String str1 = "";
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                words[j][0] = str1;
                words[j][1] = String.valueOf(findLength(str1));
                j++;
                str1 = "";
            } else {
                str1 += str.charAt(i);
            }
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        P3 obj = new P3();
        String[][] words = obj.splitWords(str);
        System.out.println("Word\tLength");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i][0] + "\t" + Integer.parseInt(words[i][1]));
        }

    }
}
