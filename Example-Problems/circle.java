//Q-3: WAP to print the area and perimeter of a circle.

import java.util.Scanner;
public class circle {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter r:");
        
        double r = s.nextDouble();
        
        double area = Math.PI*r*r;
        double perimeter = 2*Math.PI*r;

        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);
    }
}