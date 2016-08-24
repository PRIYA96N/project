import java.util.Scanner;
 public class Alphabet {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    System.out.print("the input character is ");
    char ch= in.nextLine().charAt(0);
    if(ch>=65 && ch<=90|| (ch>=97 &&ch<=122))
    { 
        System.out.println("It is an alphabet");
        }
    else 
    { 
        System.out.println("It is not an alphabet");
    }
   }
   }
