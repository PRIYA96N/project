import java.util.Scanner;
 public class Vowel {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    System.out.print("the input character is ");
    char ch= in.nextLine().charAt(0);
    if(ch =='A' || ch =='E' || ch =='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    { 
        System.out.println("It is a vowel");
        }
    else 
    { 
        System.out.println("It is a consonant");
    }
   }
   }
