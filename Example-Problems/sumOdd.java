//Q-10: WAP that displays the sum of n odd natural numbers
import java.util.Scanner;
public class sumOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of odd terms(n): ");
        int n = sc.nextInt();

        int sum =0;
        int count =0;
        int num =1;

        while (count<n) {
            sum = sum+ num;
            num = num + 2;
            count++;
        }

        System.out.println("Sum of first " + n + " odd natural no.s: " + sum);
    }
}
