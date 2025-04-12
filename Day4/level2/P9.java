
import java.util.*;

public class P9 {

    public boolean isPositive(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int numArr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            numArr[i] = sc.nextInt();
        }
        P9 obj = new P9();
        for (int i = 0; i < 5; i++) {
            if (obj.isPositive(numArr[i])) {
                if (obj.isPositive(numArr[i])) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        int res = obj.compare(numArr[0], numArr[4]);
        if (res == 1) {
            System.out.println(numArr[0] + " is greater than " + numArr[4]);
        } else if (res == 0) {
            System.out.println(numArr[0] + " is equal to " + numArr[4]);
        } else {
            System.out.println(numArr[0] + " is less than " + numArr[4]);
        }

    }
}
