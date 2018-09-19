// Fig. 7.7: RollDie.java
// Die-rolling program using arrays instead of switch.
import java.util.Random;

public class RollDie1 
{
   public static void main( String[] args )
   {
      Random randomNumbers = new Random(); // random number generator
      int[] frequency = new int[ 6 ]; // array of frequency counters

      // roll die 6,000,000 times; use die value as frequency index
      for ( int roll = 1; roll <= 6000000; roll++ ) 
         ++frequency[ randomNumbers.nextInt( 6 ) ];  

      System.out.printf( "%s%10s\n", "Face", "Frequency" );
   
      // output each array element's value
      for ( int face = 1; face <= frequency.length; face++ )
         System.out.printf( "%4d%10d\n", face, frequency[ face-1 ] );
   } // end main
} // end class RollDie
