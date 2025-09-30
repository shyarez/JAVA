import java.util.Scanner;
public class compInt {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter principal amount $:-");
    double principal = sc.nextDouble();

    System.out.println("Enter interest rate (%):-");
    double rate= sc.nextDouble()/100;

    System.out.println("No. of times compunded/yr:-");
    int timeComp= sc.nextInt();

    System.out.println("Years:-");
    int years= sc.nextInt();


    double amount;

    amount = principal * Math.pow(1+rate/timeComp, timeComp*years);
    
    System.out.printf("The amount after %d years is: $ %.2f", years, amount);
    sc.close();
    }
}
