import java.util.Scanner;
import java.util.Random;

public class number_guesser {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Random r = new Random();

      String playAgain;

      do{
      int guess;
      int attempts = 0;
      int maxAttempts = 5;
      int random_number = r.nextInt(10) + 1;
      System.out.println("🌟WELCOME TO NUMBER GUESSER!🌟");
      System.out.println("Guess any no. between 1 - 10, " + " You have only " + maxAttempts +" attempts!");

      while(attempts < maxAttempts){
        System.out.printf("Enter your guess:");
        guess = sc.nextInt();
        attempts++;

      if(guess == random_number)
      {
        System.out.println("YOU WIN!!🤩🥳");
        System.out.println("No.of attempts taken:" + attempts);
        break;
      } 
      else if(guess < random_number)
      {
       System.out.println("ITS Too LOW! Try again 🥲");
      }
      else
      {
      System.out.println("ITS Too HIGH! Try again 🥲");
      }
    } 
      
      System.out.println("YOU WIN!");
      if (attempts == maxAttempts) {
      System.out.println("GAME OVER!💀 The correct number: " + random_number);
            }
            System.out.print("🔁 Play again? (yes/no): ");
            playAgain = sc.next().toLowerCase();
        }while (playAgain.equals("yes"));
        System.out.println("👋 Thanks for playing!");       
        sc.close();
      }
    }

