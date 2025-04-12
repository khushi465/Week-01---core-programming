
import java.util.*;

public class P10 {

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

    public char[] calcGrades(double values[][]) {
        char grade[] = new char[values.length];
        // total, average, percentage
        for (int i = 0; i < values.length; i++) {

            if (values[i][2] >= 80) {
                grade[i] = 'A';
            } else if (values[i][2] >= 70 && values[i][2] <= 79) {
                grade[i] = 'B';
            } else if (values[i][2] >= 60 && values[i][2] <= 69) {
                grade[i] = 'C';
            } else if (values[i][2] >= 50 && values[i][2] <= 59) {
                grade[i] = 'D';
            } else if (values[i][2] >= 40 && values[i][2] <= 49) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }
        return grade;
    }

    public void display(int marks[][], double values[][], char grade[]) {
        System.out.print("Student Physics Chemistry  Maths ");
        System.out.println("Total  Average  Percentage  Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + " \t" + marks[i][0] + "  \t" + marks[i][1] + "    \t   " + marks[i][2]);
            System.out.println("  \t " + values[i][0] + " \t" + values[i][1] + " \t " + values[i][2] + "\t\t" + grade[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int num = sc.nextInt();
        P10 obj = new P10();
        int marks[][] = obj.generateMarks(num, 50);
        double values[][] = obj.calcValues(marks, 50);
        char grade[] = obj.calcGrades(values);
        obj.display(marks, values, grade);
    }
}
