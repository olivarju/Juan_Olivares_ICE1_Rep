/* Juan Olivares 
9915935776
*/

package card;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
            System.out.println(c);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a value (1-13): ");
        int uValue = scanner.nextInt();
        
        System.out.println("Enter the suit of the card (Hearts, Diamonds, Spades, Clubs):");
        scanner.nextLine(); 
        String uSuit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(uValue);
        userCard.setSuit(uSuit);
        
        for (Card card : magicHand) {
        if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
        
        System.out.println("You found your card in the magic hand!");
        return; 
    }
}


        System.out.println("Sorry, your card is not in the magic hand.");

    Card luckyCard = new Card();
    luckyCard.setValue(2);
    luckyCard.setSuit("Clubs");
    System.out.println(luckyCard);  

          } 
}
    
