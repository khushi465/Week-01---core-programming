
import java.util.*;

public class P4 {

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

    public int[] getShortestAndLongest(String[][] words) {
        int shortest = Integer.parseInt(words[0][1]);
        int longest = Integer.parseInt(words[0][1]);
        // String short1=words[0][0];
        // String long1=words[0][0];
        for (int i = 0; i < words.length; i++) {
            if (shortest > Integer.parseInt(words[i][1])) {
                // short1=words[i][0];
                shortest = Integer.parseInt(words[i][1]);
            }
            if (longest < Integer.parseInt(words[i][1])) {
                longest = Integer.parseInt(words[i][1]);
                // long1=words[i][0];
            }
        }
        // String arr[]={short1,long1};
        int arr[] = {shortest, longest};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        P4 obj = new P4();
        String[][] words = obj.splitWords(str);
        System.out.println("Word\tLength");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i][0] + "\t" + words[i][1]);
        }
        // String shortestLongest[]=obj.getShortestAndLongest(words);
        int shortestLongest[] = obj.getShortestAndLongest(words);
        System.out.println("Shortest: " + shortestLongest[0]);
        System.out.println("Longest: " + shortestLongest[1]);
    }
}
