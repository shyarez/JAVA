// simple program to calc area
import java.util.Scanner;
public class areaRect{

    public static void main(String[] args) {

        //AREA OF A RECTANGLE
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        area = width * height;

        System.out.print("Area: " + area + "cm");

        sc.close();
    }
}


