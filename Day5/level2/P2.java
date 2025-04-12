
import java.util.*;

public class P2 {

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

    public String[] splitWords(String str) {
        int spaces = 1;
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }
        String words[] = new String[spaces];
        int j = 0;
        str = str + " ";
        String str1 = "";
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                words[j] = str1;
                j++;
                str1 = "";
            } else {
                str1 += str.charAt(i);
            }
        }
        return words;
    }

    public boolean isEqualsString(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isEqual(String[] s1, String[] s2) {
        if (s1.length == s2.length) {
            for (int i = 0; i < s1.length; i++) {
                if (!(isEqualsString(s1[i], s2[i]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        P2 obj = new P2();
        String[] words = obj.splitWords(str);
        System.out.println("Using method");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        String[] words1 = str.split(" ");
        System.out.println("Using built in method");
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i]);
        }
        boolean equal = obj.isEqual(words, words1);
        System.out.println("Equal: " + equal);

    }
}
