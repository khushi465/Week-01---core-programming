
import java.util.*;

public class P4 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P4 obj = new P4();
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Frequency of each character");
        int[][] freq = obj.findFrequency(str);
        for (int i = 0; i < 256; i++) {
                System.out.println((char) freq[i][0] + ": " + freq[i][1]);
        }
    }
}
