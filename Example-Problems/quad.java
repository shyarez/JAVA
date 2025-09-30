//Q-1: WAP to solve quadratic equations
import java.util.Scanner;
public class quad {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double D = b*b - 4*a*c; //D

        if (D>0) {
            double root1 = (-b + Math.sqrt(D))/(2*a);
            double root2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("real and distinct roots:");
            System.out.println("root 1 = " + root1);
            System.out.println("root 2 = " + root2);
        } else if (D==0) {
            double root = -b/(2*a);
            System.out.println("real & equal roots:");
            System.out.println("root = " + root);
        } else {
            double realPart = -b/(2 * a);
            double imgPart = Math.sqrt(-D)/(2 * a);
            System.out.println("Complex roots:");
            System.out.println("root 1 = "+ realPart + " + " + imgPart + "i");
            System.out.println("root 2 = "+ realPart + " - " + imgPart + "i");
        }
        sc.close();
    }
}
