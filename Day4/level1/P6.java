
import java.util.*;
public class P6 {
    boolean isSpring(int m, int d) {
        if ((m > 3 && m < 6) || (m == 3 && d >= 20) || (m == 6 && d <= 20)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month and day");
        int month = sc.nextInt();
        int day = sc.nextInt();
        P6 obj = new P6();
        boolean res = obj.isSpring(month, day);
        System.out.println(res);
    }
}
