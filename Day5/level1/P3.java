
import java.util.*;

public class P3 {

    public char[] getChars(String s1) {
        char ch[] = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            ch[i] = s1.charAt(i);
        }
        return ch;
    }

    public boolean isEqual(char ch[], char ch1[]) {
        if (ch.length == ch1.length) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != ch1[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str1 = sc.next();

        P3 obj = new P3();
        // int start=1, end=3;
        char ch[] = obj.getChars(str1);
        char ch1[] = str1.toCharArray();
        System.out.println("Chars by getChars(): " + ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        System.out.println("Chars by built in method: " + ch1);
        for (int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);
        }
        boolean equal = obj.isEqual(ch, ch1);
        System.out.println("Equal by method: " + equal);

    }
}
