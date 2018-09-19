import java.util.Random;

public class RollDie1 
{
   public static void main( String[] args )
   {
      Random randomNumbers = new Random();
      int[] frequency = new int[ 6 ]; 

      for ( int roll = 1; roll <= 6000000; roll++ )
      {
         ++frequency[ randomNumbers.nextInt( 6 ) ];
      }

      System.out.printf( "%s%10s\n", "Face", "Frequency" );
    
      for ( int face = 1; face <= frequency.length; face++ )
      {
         System.out.printf( "%4d%10d\n", face, frequency[ face-1 ] );
      }
   }
}

//Edited by Chinedu