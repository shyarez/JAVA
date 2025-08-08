//MADLIBS Program
import java.util.Scanner;
public class madLibs{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an adjective(description): ");
         String adjective1 = sc.nextLine();
    
        System.out.println("Enter a noun(obj/place/thing): ");
         String noun1 = sc.nextLine();

        System.out.println("Enter an adjective(description): ");
         String adjective2 = sc.nextLine();

        System.out.println("Enter a verb(action, use -ing ones): ");
         String verb1 = sc.nextLine();

        System.out.println("Enter an adjective(description)");
         String adjective3 = sc.nextLine();
        
        System.out.println("\nTomorrow i'll go to a "+ adjective1 + " amusement park. ");
        System.out.println("while passing by, I encountered a  " + noun1 + ".");
        System.out.println( noun1 + " was" + adjective2 + "and"+ verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        sc.close();
    }
}


