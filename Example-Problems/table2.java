//Q2: WAP to print the multiplication table of 2

import java.util.Scanner;
public class table2{
    public static void main( String args[]){
        Scanner  s = new Scanner(System.in);

        System.out.println("enter number:");
        int n= s.nextInt();
        for(int i=1; i<=10;i++)
        System.out.println("2 x 1: "+ 2*i);
    }
}
