//Q3- WAP to pass an array and return the position of an element you want to search.
import java.util.Scanner;

public class position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element you want to search: ");
        int b = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("Element " + b + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + b + " NOT found!");
        }

        sc.close();
    }
}
