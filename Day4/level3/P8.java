
import java.util.*;

public class P8 {

    public String getMonth(int m) {
        String month[] = {"January", "February", "March", "April", 
            "May", "June", "July", "August",
            "September", "October", "November", "December"};
        return month[m - 1];
    }

    public int getDays(int m, int y) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (checkLeap(y)) {
            days[1] = 29;
        }
        return days[m - 1];
    }

    public boolean checkLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int getFirstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public void display(int m, int y) {
        String month = getMonth(m);
        int days = getDays(m, y);
        int d0 = getFirstDay(m, y);
        System.out.println(month + " " + y);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < d0; i++) {
            System.out.print("    ");
        }
        int i = 1;
        while (i <= days) {
            if (d0 == 0) {
                System.out.println();
            }
            if (i < 10) {
                System.out.print("   " + i);
            } else {
                System.out.print("  " + i);
            }
            d0 = (d0 + 1) % 7;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month and year");
        int m = sc.nextInt();
        int y = sc.nextInt();
        P8 obj = new P8();
        obj.display(m, y);

    }
}
