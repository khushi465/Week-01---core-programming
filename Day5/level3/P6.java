
import java.util.*;

public class P6 {

    public String[] createArrays(String str) {
        char ch[] = str.toCharArray();
        int freq[] = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    freq[i] = 0;
                    ch[i] = '0';
                    freq[j]++;
                }
            }
        }
        String str1[] = new String[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                str1[i] = String.valueOf(ch[i]) + ": " + String.valueOf(freq[i]);
            }
        }
        return str1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P6 obj = new P6();
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Character and Frequency");
        String str1[] = obj.createArrays(str);
        // obj.createArrays(str);
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
