
import java.util.*;

public class P4 {

    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] store(int num, int count) {
        int arr[] = new int[count];
        int temp = num;
        int i = count - 1;
        while (temp != 0) {
            arr[i] = temp % 10;
            temp /= 10;
            i--;
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int reverse[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[arr.length - i - 1] += arr[i];
        }
        return reverse;
    }

    public static boolean compare(int arr1[], int arr2[]) {
        boolean equal = true;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        } else {
            equal = false;
        }
        return equal;
    }

    public static boolean checkPalindrome(int arr[]) {
        return compare(arr, reverseArray(arr));
    }

    public static boolean checkDuck(int[] arr) {
        boolean k = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                k = true;
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int count = P4.countDigits(num);
        int[] arr = P4.store(num, count);
        System.out.println("Count: " + count);
        System.out.println("Number Array: ");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
        int[] reverse = P4.reverseArray(arr);
        System.out.println("Reverse digits array: ");
        for (int i = 0; i < reverse.length; i++) {
            System.out.println(reverse[i]);
        }

        boolean equal = P4.compare(arr, arr);
        System.out.println("Both arrays are equal: " + equal);

        boolean palindrome = P4.checkPalindrome(arr);
        System.out.println("Number is palindrome: " + palindrome);

        boolean duck = P4.checkDuck(arr);
        System.out.println("Duck number: " + duck);
        sc.close();
    }
}
