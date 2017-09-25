import java.util.Scanner;  // Needed for Scanner class

/**
   Alex Waters
   Chapter 7 #19
   The LoShuMagicSquareApp program
*/

public class LoShuMagicSquareApp
{
   public static void main(String[] args)
   {
      // Introduce the user to
      // LoShuMagicSquare App.
      welcome();
      
      // Create LoShuMagicSquare object and pass
      // fillMagicSquare return type to its constructor.
      LoShuMagicSquare game = new LoShuMagicSquare(fillMagicSquare());
      
      // Display users Box with results.
      displayBox(game);
      
      // Exit System
      System.exit(0);
   }   
   
   /**
      welcome method 
   */
   
   public static void welcome()
   {
      System.out.println("\n\t\t\tWELCOME TO\n\n<>Lo Shu Magic Square App<>");
      System.out.println();
      System.out.println("---------------------------------");
      System.out.println("\n\t\tEnter 1 - 9\n\n\tGood luck <><><><><><><>\n");
   }
   /**
      fillMagicSquare method gets user input
      for 2d array and creates LoShuMagicSquare
      object.
      @return magicSquare users keyboard input.
   */
      
   public static int[][] fillMagicSquare()
   {
      final int SIZE = 3;  // Total rows and columns
      int[][] magicSquare = new int[SIZE][SIZE];
      int index;  // Accumulator.
      
      // Create Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      index = 0;  // Starts count.
      // Get users numbers for magic square double array.
      for(int row = 0; row < magicSquare.length; row++)
      {
         for(int col = 0; col < magicSquare[row].length; col++)
         {
            System.out.print("Enter Number #" + (index + 1) + ": ");
            magicSquare[row][col] = keyboard.nextInt();
            
            // Check user input for keyboard input 1 - 9.
            if(inputValidation(magicSquare[row][col]))
               index += 1; // Add for next entry
            else
               --col;   // Subtract so user repeats entry
         }
      }
      
      // Create LoShuMagicSquare object and pass
      // magic square double array to constructor.
      LoShuMagicSquare game = new LoShuMagicSquare(magicSquare);
      
      // Get CheckMagicSquare results and if true
      // display winner.
      if(game.checkMagicSquare(magicSquare))
      {
         System.out.println("\nPerfect Magic Square!!!");
         System.out.println("\n<><><><><><><><><><><><><><><>\n");
      }
      else
         System.out.println("\n Better Luck Next Time!!!");
      
      return magicSquare;
   }
   
   /**
      displayBox method 
      @param LoShuMagicSquare game;
   */
   
   public static void displayBox(LoShuMagicSquare game)
   {
      // Display users magic square box.
      for(int row = 0; row < game.getMagicSquare().length; row++)
      {
         for(int col = 0; col < game.getMagicSquare()[row].length; col++)
         {
            if(row == 0 && col < 3)
            {
               System.out.print(" | " + (game.getMagicSquare()[row][col]) + " | ");
               
               // Goes to next line.
               if(row == 0 && col == 2)
                  System.out.println();
            }
            else
            if(row == 1 && col < 3)
            {
               System.out.print(" | " + (game.getMagicSquare()[row][col]) + " | ");
               
               // Goes to next line
               if(row == 1 && col == 2)
                  System.out.println();
            }
            else
               System.out.print(" | " + (game.getMagicSquare()[row][col]) + " | ");
         } 
      }
      System.out.println("\n\nLook Forward To Seeing You Play\n\t\t  AGAIN!!!!!");
      System.out.println("\t\t\tBYE!!!");
   }
   /**
      inputValidation method
      @param num
      @return Correct if not less
              Than 1 or greater than
              9.
   */
   
   public static boolean inputValidation(int num)
   {
      boolean correct;   // Flag variable
      
      if(num < 1 || num > 9)
      {
         System.out.println("\t\t\tError\nOnly Enter Numbers 1 - 9!!!");
         correct = false;
      }   
      else
         correct = true;
      
      return correct;
   }
}
     