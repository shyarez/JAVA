//Q-4:WAP that takes three numbers from the user & print the greatest number.
import java.util.Scanner;
public class greatest {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
    
        System.out.println("Enter num1:");
        int num1=s.nextInt();
        
        System.out.println("Enter num2:");
        int num2=s.nextInt();

        System.out.println("Enter num3:");
        int num3=s.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Num1 is greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Num2 is greatest");
        }
        else{
            System.out.println("Num3 is greatest");
        }
    }
}
