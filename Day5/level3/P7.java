
import java.util.*;

public class P7 {

    public boolean checkPalindrome1(String str) {
        int k = 1;
        for (int i = 0; i < str.length(); i++) {
            int start = i;
            int end = str.length() - 1 - i;
            if (str.charAt(start) != str.charAt(end)) {
                k = 0;
                break;

            }
        }
        if (k == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPalindrome2(String str, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                return checkPalindrome2(str, start + 1, end - 1);
            }
        }
    }

    public char[] reverseString(String str) {
        char[] reverse = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse[str.length() - i - 1] = str.charAt(i);
        }
        return reverse;
    }

    public boolean checkPalindrome3(String str) {
        char[] ch = str.toCharArray();
        char reverse[] = reverseString(str);
        int k = 1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != reverse[i]) {
                k = 0;
                break;
                // return false;
            }
        }
        if (k == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P7 obj = new P7();
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Check palindrome by index: " + obj.checkPalindrome1(str));
        System.out.println("Check palindrome by recursion: " + obj.checkPalindrome2(str, 0, str.length() - 1));
        System.out.println("Check palindrome by reverse array: " + obj.checkPalindrome3(str));
    }
}
