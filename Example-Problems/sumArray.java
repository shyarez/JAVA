//Q1- WAP to read find the sum of array element

import java.util.Scanner;
public class sumArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.print("Array elements: ");
        for (int i=0; i<n;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nSum of array elements: " + sum);
        sc.close();
    }
}
