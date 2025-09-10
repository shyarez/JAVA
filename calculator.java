import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // Variables defined ——
    int n;
    String operator;
    double output;

    System.out.printf("Enter amount of inputs (n):");
    n = sc.nextInt();
    
    double[] numbers = new double[n];
    System.out.printf("Enter %d numbers:", n);
    for(int i=0; i<n; i++){
        numbers[i] = sc.nextDouble();
    }

    //Choose ur OPERATOR —
    System.out.printf("Which Operation to perform (+, - , *, /, %% , ^, ²(S), √(R), AVG(A), MAX(M)) ?:");
    operator = sc.next();


    // OPERATIONS PERFORMED —
     if(operator.equals("²")|| operator.equals("S") || operator.equals("s")) {    //square
            for(int i=0; i<n; i++) {
                System.out.println(numbers[i] + "²= " + Math.pow(numbers[i], 2));
            }
        } else if(operator.equals("√")|| operator.equals("R") || operator.equals("r")) {   //square root
            for(int i=0; i<n; i++) {
                if(numbers[i]<0) {
                    System.out.println("CANT PERFORM sqrt of negative number: " + numbers[i]);
                }else {
                    System.out.println("√" + numbers[i] + " = " + Math.sqrt(numbers[i]));
                }
            }
        } else if(operator.equals("A")) { //Average
            double sum = 0;
            for(int i=0; i<n; i++) {
                sum += numbers[i];
            }
            output = sum / n;
            System.out.println("Average: " + output);
        } else if(operator.equals("M")) {  //Maximum
            output = numbers[0];
            for(int i=1; i<n; i++) {
                if(numbers[i] > output) {
                    output = numbers[i];
                }
            }
            System.out.println("Maximum: " + output);
        }
         else{
             output = numbers[0];
             for(int i=1; i<n; i++){

              switch(operator){
        case "+" -> output += numbers[i];
        case "-" -> output -= numbers[i];
        case "*" -> output *= numbers[i];
        case "/" -> output /= numbers[i];
        case "%" -> output %= numbers[i];
        case "^" -> output = Math.pow(output, numbers[i]);
        default -> System.out.println("Invalid operator!!");
    }
  } 
  System.out.println("Output: " + output);
}
    sc.close();
    return;
    }
}
