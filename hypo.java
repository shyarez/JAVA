// program to calc hypotenuse of a 🔺

import java.util.Scanner;
public class hypo {
    public static void main(String[] args){
        //HYPOTENUSE C = Math.sqrt(a^2 + b^2)
 
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("enter a:");
         a = sc.nextDouble();
        System.out.println("enter b:");
        b = sc.nextDouble();
        c = (int) Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.println("Hypotenuse is: " + c);
                sc.close();
    }
}
