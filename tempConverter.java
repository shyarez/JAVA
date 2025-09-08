import java.util.Scanner;
public class tempConverter {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double temp;
    double new_temp;
    String unit;

    System.out.println("Enter temperature:-");
    temp = sc.nextDouble();
    
    System.out.println("Choose the Mode of Conversion>> CELSIUS/FAHRENHEIT (C/F):-");
    unit = sc.next().toUpperCase();  //method chaining

    new_temp= (unit.equals("C")) ? (temp - 32) *5/9 : (temp *5/9) + 32;
    System.out.printf("The new temperature is: %.2f %s°",new_temp,unit);
    //System.out.println(unit);
    sc.close();
}
}
