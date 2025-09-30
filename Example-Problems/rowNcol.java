//Q7-WAP to read a matrix and find the row sum and column sum
import java.util.Scanner;

public class rowNcol{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Row sums:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Column sums
        System.out.println("Column sums:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        sc.close();
    }
}

