// Exercise 7.30 Solution: Card.java
// Card class represents a playing card.

public class Card 
{
   private final String face; // face of card
   private final String suit; // suit of card

   // constructor
   public Card(String cardFace, String cardSuit)
   {
      face = cardFace; // initialize face of card
      suit = cardSuit; // initialize suit of card
   } 

   // return card face
   public String getFace()
   {
      return face;
   } 

   // return card suit
   public String getSuit()
   {
      return suit;
   }

   // return String representation of Card
   public String toString() 
   { 
      return face + " of " + suit;
   } 
} // end class Card


/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
