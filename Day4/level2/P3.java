
import java.util.*;

public class P3 {

    public boolean checkLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Invalid year");
            System.exit(0);
        }
        P3 obj = new P3();
        boolean check = obj.checkLeap(year);
        System.out.println(check);
    }
}
