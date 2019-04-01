// Anirudh Prakash
// from December 2017

import java.util.*; // for Scanner

// Program to calculate best bet for Jeopardy
public class JeopardyBettingCalculator {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      System.out.println("This is a calculator meant to tell you");
      System.out.println("how to bet smartly before Final Jeopardy!");
      System.out.println();
      
      System.out.println("To do this, you must enter the amount of");
      System.out.println("money each player has after Double Jeopardy!");
      System.out.println("Assume that Player 1 is in 1st place, Player");
      System.out.println("2 is in 2nd place, and Player 3 is in 3rd");
      System.out.println("place. If there are ties, then order does");
      System.out.println("not matter as long as");
      System.out.println("\t Player 1 >= Player 2 >= Player 3.");
      System.out.println();
      
      System.out.print("Enter Player 1's money: $");
      int one = console.nextInt();
      System.out.print("Enter Player 2's money: $");
      int two = console.nextInt();
      System.out.print("Enter Player 3's money: $");
      int three = console.nextInt();
      System.out.println();
      
      // TODO: ask if want to redo
      // TODO: take care of negatives or 0
      
      int oneBet = 0;
      int twoBet = two;
      int threeBet = three - 3;
      
      int oneDouble = one * 2;
      int twoDouble = two * 2;
      int threeDouble = three * 2;
      
      if (one == two) {
         oneBet = one;
         if (two == three) {
            threeBet = three;
         }
      } else if (one < twoDouble) {
         oneBet = twoDouble + 1 - one;
         twoBet = 0;
         if (two == three) {
            twoBet = two;
            threeBet = three;
         } else if (two < threeDouble) {
            twoBet = threeDouble + 1 - two;
         } else if (two == threeDouble) {
            threeBet = three;
         }
      } else if (one == twoDouble) {
         if (two == three) {
            threeBet = three;
         }
      } else if (one > twoDouble) {
         if (two == three) {
            threeBet = three;
         } else if (two < threeDouble) {
            twoBet = threeDouble + 1 - two;
         } else if (two >= threeDouble) {
            twoBet = 0;
            if (two == threeDouble) {
               threeBet = three;
            }
         }
      }
      
      System.out.println("Player 1 should bet $" + oneBet);
      System.out.println("Player 2 should bet $" + twoBet);
      System.out.println("Player 3 should bet $" + threeBet);
   }
}