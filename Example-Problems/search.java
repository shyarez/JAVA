//Q2- Wap to search an element is present in an array or not.
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter no. ull search: ");
        int b = sc.nextInt();

        boolean isFound = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.printf("Element %d found at index: %d\n", a[i], i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element NOT found!");
        }

        sc.close();
    }
}
