/**
   Alex Waters
   Chapter 7 #19
   The LoShuMagicSquare class
*/

public class LoShuMagicSquare
{
   // Fields.
   private final int SIZE = 3;
   private int[][] magicSquare = new int[SIZE][SIZE];
   
   /**
      Constructor
      @param magicSquare
   */
   
   public LoShuMagicSquare(int[][] magicSquare)
   {
      this.magicSquare = magicSquare;
   }
   
   /**
      setMagicSquare method
      @param magicSquare
   */
   
   public void setMagicSquare(int[][] magicSquare)
   {
      this.magicSquare = magicSquare;
   }
   
   /**
      getMagicSquare method
      @return magicSquare
   */
   
   public int[][] getMagicSquare()
   {
      return magicSquare;
   }
   
   /**
      checkMagicSquare method
      @return magic True or false depending
              If Square sums 15 in rows,
              columns, and diagnolly.  
   */
   
   public boolean checkMagicSquare(int[][] magicSquare)
   {
      boolean magic = false;  // Flag variable
      int sum;   // Accumulator
      
      
      // Check each row, column, and diagnolly
      // sum to equal 15.
      for(int row = 0; row < magicSquare.length; row++)
      {
         sum = 0;
         for(int col = 0; col < magicSquare[row].length; col++)
         {
            sum += magicSquare[row][col];
         }
         if(sum == 15)
         {
            magic = true;
         }
         else
         {
            magic = false;
         break;
         }
      }
      // Check each row, column, and diagnolly
      // sum to equal 15.
      for(int col = 0; col < magicSquare.length; col++)
      {
         sum = 0;
         for(int row = 0; row < magicSquare[col].length; row++)
         {
            sum += magicSquare[row][col];
         }
         if(sum == 15)
            magic = true;
         else
         {
            magic = false;
         break;
         }
      }
      sum = 0;
      // Check each row, column, and diagnolly
      // sum to equal 15.
      for(int row = 0; row < magicSquare.length; row++)
      {
         for(int col = 0; col < magicSquare[row].length; col++)
         {
            if(row == col)
               sum += magicSquare[row][col];
         }
      }
      if(sum == 15)
         magic = true;
      else
         magic = false;
      
      sum = 0;
      // Check each row, column, and diagnolly
      // sum to equal 15.
      for(int row = 0; row < magicSquare.length; row++)
      {
         for(int col = 0; col < magicSquare[row].length; col++)
         {
            if(row == 0 && col == 2 ||
               row == 1 && col == 1 ||
               row == 2 && col == 0)
               sum += magicSquare[row][col];
         }
      }
      if(sum == 15)
         magic = true;
      else
         magic = false;
     
      return magic;
   }
}