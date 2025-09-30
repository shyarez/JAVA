//Q-7: WAP to swap two variables using third variable and without using third variable.
import java.util.Scanner;
public class swap {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a:");
        int a= s.nextInt();
        System.out.println("Enter b:");
        int b= s.nextInt();

        int x=a;
        a =b;
        b =x;
    
        System.out.println("Swapped Number is:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}


