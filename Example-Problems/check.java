//Q-8:WAP that requires the user to enter a single character from the alphabet. Print Vowel or Consonant

import java.util.Scanner;
public class check {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word:");
        
        char ch = s.next().charAt(0);
        if(ch=='a' || ch== 'e'|| ch == 'i'|| ch == 'o'||ch=='u'||ch =='A'|| ch== 'E'|| ch == 'I'|| ch == 'O'||ch=='U')
        System.out.println("Vowel");
        else{
        System.out.println("Consonant");
        }
        sc.close();
    }
}