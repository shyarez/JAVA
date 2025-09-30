//Q6- Wap to read a 2 dimensional array from the user and find its transpose
import java.util.Scanner;
public class transpose {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        System.out.println("Enter elem of matrix:");
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                b[j][i] = a[i][j]; 
            }
        }
        System.out.println("initial matrix:");
        for (int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("transpose:"); //transpose
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}

