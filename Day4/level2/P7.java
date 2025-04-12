
import java.util.*;

public class P7 {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of 10 students");
        int age[] = new int[10];
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }
        P7 obj = new P7();
        for (int i = 0; i < 10; i++) {
            boolean res = obj.canStudentVote(age[i]);
            System.out.println(age[i] + " can vote: " + res);
        }

    }
}
