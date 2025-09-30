//Q-9: WAP that takes a year from the user & prints whether it is a leap year or not.

import java.util.Scanner; 
public class leapYr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: "); 
        int year = sc.nextInt(); 
        boolean isLeapYear;
        // conditions:
        // Divisible by 400 
        // Divisible by 4 but not by 100 

        if ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))) {
            isLeapYear =true;
        } else {
            isLeapYear =false;
        }

        if (isLeapYear) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " NOT a leap year");
        }
        sc.close(); 
    }
}