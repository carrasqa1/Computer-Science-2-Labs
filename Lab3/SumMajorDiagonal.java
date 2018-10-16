import java.util.Scanner;
public class SumMajorDiagonal {
  
   public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimension n of nxn matrix:");
        int n = in .nextInt();
        double[][] myArray = new double[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter row " + i + ":");
            for (int j = 0; j < n; j++) {
                myArray[i][j] = in .nextDouble();
            }
        }
        System.out.println(sumMajorDiagonal(myArray));
    }
}