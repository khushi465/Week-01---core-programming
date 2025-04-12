
import java.util.*;

public class P8 {

    public int[] generateAge(int n) {
        int age[] = new int[n];
        for (int i = 0; i < n; i++) {
            age[i] = (int) ((Math.random() * (100 - 10)) + 10);
        }
        return age;
    }

    public String[][] checkArray(int[] age) {
        String[][] arr = new String[age.length][2];
        for (int i = 0; i < age.length; i++) {
            arr[i][0] = String.valueOf(age[i]);
            if (age[i] > 0) {
                if (age[i] >= 18) {
                    arr[i][1] = String.valueOf(true);
                } else {
                    arr[i][1] = String.valueOf(false);
                }
            } else {
                arr[i][1] = String.valueOf(false);
            }
        }
        return arr;
    }

    public void display(String arr[][]) {
        System.out.println("Age\tCan vote");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);

        }
    }

    public static void main(String[] args) {
        P8 obj = new P8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        int[] age = obj.generateAge(n);
        String[][] arr = obj.checkArray(age);
        obj.display(arr);
    }
}
