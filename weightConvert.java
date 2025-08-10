// WEIGHT CONVERSION 
import java.util.Scanner;
public class weightConvert {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    // Variable Declarations:-
        double weight;
        double newWt;
        int choice;
        
        System.out.println("WEIGHT CONVERTER");

        System.out.println("OPT1: LBS TO KGS");
        System.out.println("OPT2: KGS TO LBS");
    

       System.out.println("Select your choice:");
       choice = sc.nextInt();


        // opt1- LBS TO KGS
        if(choice == 1){
            System.out.print("Enter weight in LBS: ");
            weight = sc.nextDouble();
            newWt= weight * 0.453592;
            System.out.printf("New Weight in KGS: %.2f kgs",newWt);
        }

        // opt2- KGS TO LBS
        else if(choice == 2){
            System.out.print("Enter weight in KGS: ");
            weight = sc.nextDouble();
            newWt= weight * 2.20462;
            System.out.printf("New Weight in LBS: %.2f lbs",newWt);
        }

        else{
            System.out.println("INVALID CHOICE!");
        }
        
        sc.close();

    }
    
}
