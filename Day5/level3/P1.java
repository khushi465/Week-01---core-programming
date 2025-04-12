
import java.util.*;

public class P1 {

    public String[][] calculateStatus(String data[][]) {
        for (int i = 0; i < 3; i++) {
            double weight = Double.parseDouble(data[i][0]);
            double height = Double.parseDouble(data[i][1]);
            data[i][1] = String.valueOf(height / 100);
            height = Double.parseDouble(data[i][1]);

            data[i][2] = String.valueOf(weight / (height * height));
            System.out.println(height * height);
            System.out.println(weight / (height * height));
        }
        for (int i = 0; i < 3; i++) {
            //System.out.println(BMI);
            if (Double.parseDouble(data[i][2]) <= 18.4) {
                data[i][3] = "Underweight";
            } else if (Double.parseDouble(data[i][2]) >= 18.5 && Double.parseDouble(data[i][2]) <= 24.9) {
                data[i][3] = "Normal";
            } else if (Double.parseDouble(data[i][2]) >= 18.5 && Double.parseDouble(data[i][2]) <= 24.9) {
                data[i][3] = "Overweight";
            } else {
                data[i][3] = "Obese";
            }
            // data[i][1] = String.valueOf(Double.parseDouble(data[i][1])*100);
        }

        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 3;
        String data[][] = new String[num][4];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter weight in kg and height in cm of person " + (i + 1));
            data[i][0] = String.valueOf(sc.nextDouble());
            data[i][1] = String.valueOf(sc.nextDouble());
            if (Double.parseDouble(data[i][0]) < 0 || Double.parseDouble(data[i][1]) < 0) {
                System.out.println("Retry. Negative value found");
                i--;
            }
        }
        P1 obj = new P1();
        data = obj.calculateStatus(data);

        for (int i = 0; i < num; i++) {
            System.out.println("Person " + i + ": Weight=" + data[i][0] + "kg, Height=" + data[i][1] + "cm, BMI=" + data[i][2] + " and Status=" + data[i][3]);
        }
    }
}
