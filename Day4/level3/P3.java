
import java.util.*;

public class P3 {

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

    public static int sumDigits(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 2);
        }
        return sum;
    }

    public static boolean checkHarshad(int arr[], int num) {
        boolean k = false;
        int sum = sumDigits(arr);
        if (num % sum == 0) {
            return true;
        }
        return k;
    }

    // eg 238030291
    public static int[][] findFreq(int arr[]) {
        int[][] freq = new int[10][2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i]);
            int k = 0;
            if (index > 0) {
                for (int j = 0; j < index; j++) {
                    if (freq[j][0] == arr[i]) {
                        freq[j][1]++;
                        k = 1;
                    }
                }
            }
            if (k == 0) {
                freq[index][0] = arr[i];
                freq[index][1]++;
                index++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int count = P3.countDigits(num);
        int[] arr = P3.store(num, count);
        System.out.println("Count: " + count);
        System.out.println("Number Array: " + arr);
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
        int sum = P3.sumDigits(arr);
        System.out.println("Sum of digits of number: " + sum);
        int sumOfSquares = P3.sumOfSquares(arr);
        System.out.println("Sum of squares of digits of number: " + sumOfSquares);

        boolean harshad = P3.checkHarshad(arr, num);
        System.out.println("Harshad number: " + harshad);

        int[][] freq = P3.findFreq(arr);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][0] > 0) {
                System.out.println(freq[i][0] + ": " + freq[i][1]);
            }
        }
    }
}
