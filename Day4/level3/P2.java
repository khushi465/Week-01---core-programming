
import java.util.*;

public class P2 {

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

    public static boolean checkArmstrong(int arr[], int num) {
        boolean k = false;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], arr.length);
        }
        if (num == sum) {
            k = true;
        }
        return k;
    }

    public static int[] findLandSL(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        int arr1[] = {largest, secondLargest};
        return arr1;
    }

    public static int[] findSandSS(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        int arr1[] = {smallest, secondSmallest};
        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int count = P2.countDigits(num);
        int[] arr = P2.store(num, count);
        System.out.println("Count: "+count);
        System.out.println("Number Array: "+arr);
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
        boolean duck = P2.checkDuck(arr);
        System.out.println("Duck number: " + duck);
        boolean armstrong = P2.checkArmstrong(arr, num);
        System.out.println("Armstrong number: " + armstrong);

        int arr1[] = P2.findLandSL(arr);
        System.out.println("Largest: " + arr1[0]);
        System.out.println("Second Largest: " + arr1[1]);

        int arr2[] = P2.findSandSS(arr);
        System.out.println("Smallest: " + arr2[0]);
        System.out.println("Second Smallest : " + arr2[1]);
    }
}
