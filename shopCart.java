 // SHOPPING CART PROGRAM
import java.util.Scanner;

public class shopCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = sc.nextLine();

        System.out.print("Price for each?: ");
        double price = sc.nextDouble();

        System.out.print("How many?: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Currency symbol to display (e.g. ₹, $, ¥): ");
        String currency = sc.nextLine(); 

        double total = price * quantity;
        System.out.println("You bought: " + item);
        System.out.println("Total Cost: "+currency+total);

        sc.close();
    }
}
