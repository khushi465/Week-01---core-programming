
import java.util.*;

public class P5 {

    public static boolean isPrime(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static boolean isNeon(int num) {
        double sq = Math.pow(num, 2);
        double sum = 0;
        while (sq != 0) {
            sum += sq % 10;
            sq /= 10;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSpy(int num) {
        int temp = num;
        int sum = 0;
        int product = 1;
        while (temp != 0) {
            sum += temp % 10;
            product *= temp % 10;
            temp /= 10;
        }
        if (sum == product) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAutomorphic(int num) {
        double sq = Math.pow(num, 2);
        if (sq % 10 == num) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isBuzz(int num) {
        if (num % 7 == 0 || num % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        boolean prime = P5.isPrime(num);
        System.out.println("Number is Prime: " + prime);
        boolean neon = P5.isNeon(num);
        System.out.println("Number is neon: " + neon);
        boolean spy = P5.isSpy(num);
        System.out.println("Number is spy: " + spy);
        boolean automorphic = P5.isAutomorphic(num);
        System.out.println("Number is automorphic: " + automorphic);
        boolean buzz = P5.isBuzz(num);
        System.out.println("Number is buzz: " + buzz);

        sc.close();
    }
}
