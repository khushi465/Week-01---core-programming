
import java.util.*;

public class P10 {

    public boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double m1 = (double) (y2 - y1) / (x2 - x1);
        double m2 = (double) (y3 - y2) / (x3 - x2);
        double m3 = (double) (y3 - y1) / (x3 - x1);
        if (m1 == m2 && m1 == m3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if (area == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of 3 points");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        P10 obj = new P10();
        boolean check = obj.checkCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Slope: " + check);
        boolean check1 = obj.checkCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Area: " + check1);
    }
}
