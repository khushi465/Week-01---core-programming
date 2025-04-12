
import java.util.Scanner;

public class P8 {

    public int[][] findFrequency(String str) {
        int freq[][] = new int[256][2];
        int ch = 256;
        for (int i = 0; i < str.length(); i++) {
            freq[(int) str.charAt(i)][0] = (int) str.charAt(i);
            freq[(int) str.charAt(i)][1]++;
        }
        for (int i = 0; i < 256; i++) {
            freq[i][0] = i;
        }
        return freq;
    }

    public boolean compare(String str1, String str2) {
        if (str1.length() == str2.length()) {
            int[][] freq1 = findFrequency(str1);
            int[][] freq2 = findFrequency(str2);
            int k = 1;
            for (int i = 0; i < freq1.length; i++) {
                if (freq1[i][1] != freq2[i][1]) {
                    k = 0;
                    break;
                }
            }
            if (k == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P8 obj = new P8();
        System.out.println("Enter strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean anagram = obj.compare(str1, str2);
        if (anagram) {
            System.out.println("Both are anagrams");
        } else {
            System.out.println("Both are not anagrams");
        }
    }
}
