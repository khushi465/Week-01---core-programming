
import java.util.*;

public class P13 {

    public int[][] createMatrix(int rows, int cols) {
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }
        return arr;
    }

    public int[][] addMatrix(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int sum[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public int[][] subMatrix(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int diff[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return diff;
    }
// if cols of 1= rows of 2. rows 1x cols2

    public int[][] mulMatrix(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        if (c1 == r2) {
            int mul[][] = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += arr1[i][k] * arr2[k][j];
                        // mul[0][0]=mul[0][0]*arr2[0][0]+arr1[0][1]*arr2[1][0]+arr1[0][2]*arr2[2][0]
                        // mul[0][1]=mul[0][0]*arr2[0][1]+arr1[0][1]*arr2[1][1]+arr1[0][2]*arr2[2][1]
                        System.out.print(arr1[i][k] * arr2[k][j] + "+ ");
                    }
                }
            }
            return mul;
        } else {
            return null;
        }
    }
// row of 1st and col of 2nd. res[i][k]+=arr1[i][j]*arr2[j][k]
// transpose

    public int[][] calTranspose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int arr1[][] = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        return arr1;
    }

    public int determinant2(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int det = 0;
        if (rows == cols && rows == 2) {
            det = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
            return det;
        } else {
            return -99;
        }
    }

    public int determinant3(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == cols && rows == 3) {
            int det = arr[0][0] * ((arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]))
                    - arr[0][1] * ((arr[1][0] * arr[2][2]) - (arr[1][2] * arr[2][0]))
                    + arr[0][2] * ((arr[1][0] * arr[2][1]) - (arr[1][1] * arr[2][0]));
            return det;
        } else {
            return -99;
        }
    }

    public double[][] inverse2(int[][] arr) {
        double[][] inverse = new double[2][2];
        int det = determinant2(arr);
        inverse[0][0] = arr[1][1] / det;
        inverse[0][1] = -arr[0][1] / det;
        inverse[1][0] = -arr[1][0] / det;
        inverse[1][1] = arr[0][0] / det;
        return inverse;
    }

    public double[][] inverse3(int[][] arr) {
        double[][] inverse = new double[3][3];
        int[][] M = new int[3][3];
        int[][] C = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                C[i][j] = (arr[(i + 1) % 3][(j + 1) % 3] * arr[(i + 2) % 3][(j + 2) % 3]) - (arr[(i + 2) % 3][(j + 1) % 3] * arr[(i + 1) % 3][(j + 2) % 3]);
            }
        }
        display(C);
        int adjoint[][] = calTranspose(C);
        display(adjoint);
        int det = determinant3(arr);
        if (det != 0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    inverse[i][j] = (double) adjoint[i][j] / det;
                }
            }
        }
        return inverse;
    }

    public void display(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P13 obj = new P13();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix1[][] = obj.createMatrix(rows, cols);
        int matrix2[][] = obj.createMatrix(rows, cols);
        int sum[][] = obj.addMatrix(matrix1, matrix2);
        int diff[][] = obj.subMatrix(matrix1, matrix2);
        int transpose[][] = obj.calTranspose(matrix1);
        System.out.println("Matrix 1");
        obj.display(matrix1);
        System.out.println("Matrix 2");
        obj.display(matrix2);
        System.out.println("Sum");
        obj.display(sum);
        System.out.println("Diff");
        obj.display(diff);
        System.out.println("transpose of matrix 1");
        obj.display(transpose);

        System.out.println("Enter rows and columns for matrix 3");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter rows and columns for matrix 4");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int matrix3[][] = obj.createMatrix(r1, c1);
        int matrix4[][] = obj.createMatrix(r2, c2);
        int mul[][] = obj.mulMatrix(matrix3, matrix4);
        System.out.println("Matrix 3");
        obj.display(matrix3);
        System.out.println("Matrix 4");
        obj.display(matrix4);
        System.out.println("Mul");
        obj.display(mul);
        int matrix5[][] = obj.createMatrix(2, 2);
        obj.display(matrix5);
        int det = obj.determinant2(matrix5);
        System.out.println("Determinant 2: " + det);
        int matrix6[][] = obj.createMatrix(3, 3);
        obj.display(matrix6);
        int det1 = obj.determinant3(matrix6);
        System.out.println("Determinant 3: " + det1);
        int matrix7[][] = obj.createMatrix(2, 2);
        obj.display(matrix7);
        double[][] inverse2 = obj.inverse2(matrix7);
        System.out.println("Inverse 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(inverse2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int matrix8[][] = obj.createMatrix(3, 3);
        obj.display(matrix8);
        double[][] inverse3 = obj.inverse3(matrix8);
        System.out.println("Inverse 3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(inverse3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

// multiply, transpose, determinant 2 and 3, inverse 2 and 3. display
    }
}
