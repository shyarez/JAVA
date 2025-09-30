//Q-6: Write a Java program that reads two floating-point numbers 
// & tests whether they are the same up to three decimal places.

import java.util.Scanner;
public class threeplaces{
    public static void main( String args[]){
        Scanner  s = new Scanner(System.in);

        System.out.println("enter number 1:");
        float num1= s.nextFloat();
        
        System.out.println("enter number 2:");
        float num2= s.nextFloat();
        
        int a= (int) (num1*1000);
        int b= (int) (num2*1000);
        
        if(a==b){
        System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
