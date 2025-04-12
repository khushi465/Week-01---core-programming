
import java.util.*;

public class P5 {

    public char[] findUniqueCharacters(String str) {
        char[] res = new char[str.length()];
        int index = 0;
        res[0] = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            int k = 0;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                res[index] = str.charAt(i);
                index++;
            }
        }
        char[] temp = new char[index];
        for (int i = 0; i < index; i++) {
            temp[i] = res[i];
        }
        res = temp;
        return res;
    }

    public int[][] findFrequency(String str) {
        char[] res = findUniqueCharacters(str);
        int freq[][] = new int[res.length][2];
        for (int i = 0; i < res.length; i++) {
            freq[i][0] = (int) res[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == freq[i][0]) {
                    freq[i][1]++;
                }
            }

        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P5 obj = new P5();
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Unique characters and frequency");
        int freq[][] = obj.findFrequency(str);
        for (int i = 0; i < freq.length; i++) {
            System.out.println((char) freq[i][0] + ": " + freq[i][1]);
        }
    }
}
