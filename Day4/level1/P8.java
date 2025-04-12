
import java.util.*;

public class P8 {

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest, largest;

        if (n1 < n2 && n1 < n3) {
            smallest = n1;
        } else if (n2 < n1 && n2 < n3) {
            smallest = n2;
        } else {
            smallest = n3;
        }
        if (n1 > n2 && n1 > n3) {
            largest = n1;
        } else if (n2 > n1 && n2 > n3) {
            largest = n2;
        } else {
            largest = n3;
        }
        int arr[] = {smallest, largest};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int res[] = P8.findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest " + res[0] + " Largest " + res[1]);
    }
}
