
import java.util.*;

public class P10 {

    public static int[] findChocolates(int s, int c) {
        int chocolatePerStudent = s / c;
        int remaining = s % c;
        int arr[] = {chocolatePerStudent, remaining};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students and chocolates");
        int students = sc.nextInt();
        int chocolates = sc.nextInt();
        int res[] = P10.findChocolates(students, chocolates);
        System.out.println("Chocolates Per student " + res[0] + " Remaining Chocolates " + res[1]);
    }
}
