
public class P11 {

    public int[][] createValues() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) ((Math.random() * (10000 - 1000)) + 1000);
            data[i][1] = (int) (Math.random() * 11);
        }
        return data;
    }

    public double[][] calcSal(int[][] data) {
        double newData[][] = new double[10][2];
        for (int i = 0; i < 10; i++) {
            if (data[i][1] >= 5) {
                newData[i][1] = 0.05 * data[i][0];
            } else {
                newData[i][1] = 0.02 * data[i][0];
            }
            newData[i][0] = data[i][0] + newData[i][1];
        }
        return newData;
    }

    public void sums(int[][] data, double[][] newData) {
        double totalOldSal = 0;
        double totalNewSal = 0;
        double totalBonusAmount = 0;
        for (int i = 0; i < 10; i++) {
            totalOldSal += data[i][0];
            totalNewSal += newData[i][0];
            totalBonusAmount += newData[i][1];
        }
        System.out.println("Total Old Salary\tTotal New Salary\tTotal Bonus Amount");
        System.out.println(totalOldSal + "\t\t\t" + totalNewSal + "\t\t\t" + totalBonusAmount);
    }

    public static void main(String[] args) {
        P11 obj = new P11();
        int[][] data = obj.createValues();
        double[][] newData = obj.calcSal(data);
        obj.sums(data, newData);
    }
}
