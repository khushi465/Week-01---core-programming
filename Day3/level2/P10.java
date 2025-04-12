import java.util.*;

public class P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		int numArr[] = new int[10];
		int freq[] = new int[10];
		while (temp != 0) {
			temp /= 10;
			count++;
		}
		temp = num;
		int i = 0;
		while (temp != 0) {
			numArr[i] = temp % 10;
			temp /= 10;
			i++;
		}
		for (i = 0; i < count; i++) {
			freq[numArr[i]]++;
		}
		for (i = 0; i < 10; i++) {
			if (freq[i] > 0) {
				System.out.println(i + " frequency: " + freq[i]);
			}
		}
	}
}