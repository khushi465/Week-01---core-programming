
import java.util.*;

public class P12 {

    public int[][] generateMarks(int num, int totalmarks) {
        int[][] marks = new int[num][3];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * (totalmarks + 1));
            }
        }
        return marks;
    }

    public double[][] calcValues(int marks[][], int totalmarks) {
        double values[][] = new double[marks.length][3];
        // total, average, percentage
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < 3; j++) {
                values[i][0] += (double) marks[i][j];
            }
            values[i][1] = Math.round(values[i][0] / 3);
            values[i][2] = Math.round(values[i][1] / totalmarks * 100);
        }
        return values;
    }

    public void display(int marks[][], double values[][]) {
        System.out.print("Student \t Physics \t Maths ");
        System.out.println("  Total \t  Average: \t  Percentage: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2]);
            System.out.println("\t" + values[i][0] + "\t" + values[i][1] + "\t" + values[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int num = sc.nextInt();
        P12 obj = new P12();
        int marks[][] = obj.generateMarks(num, 50);
        double values[][] = obj.calcValues(marks, 50);
        obj.display(marks, values);
    }
}
