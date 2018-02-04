/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadeck;





/**
 *
 * @author sergen
 */
public class Main {
    
    public static void main(String[] args) {
        
        Card cards[] = new Card[4];
        cards[0] = new Card(Card.CARD_NUMBER_A, Card.CARD_SUIT_HEART);
        cards[1] = new Card(Card.CARD_NUMBER_5, Card.CARD_SUIT_DIAMOND);
        cards[2] = new Card(Card.CARD_NUMBER_K, Card.CARD_SUIT_SPADE);
        cards[3] = new Card(Card.CARD_NUMBER_10, Card.CARD_SUIT_CLUB);
        
        
        Deck deck = new Deck(cards);
       
        printDeck(deck);
     
        deck.reshuffle();
        
        System.out.println("\n -------------------Re-Shuffeled----------------");
        printDeck(deck);
        deck.reshuffle();
        
        System.out.println("\n -------------------Re-Shuffeled----------------");
        printDeck(deck);
        deck.reshuffle();
        
        System.out.println("\n -------------------Re-Shuffeled----------------");
        printDeck(deck);
        
        

    }
    
    public static void printDeck(Deck deck) {
        Card[] cards = deck.getCards();
          for(int i=0;i<cards.length;i++)
        {
            System.out.print(cards[i].getCard()[0] + cards[i].getCard()[1] + "    " );
            if((i+1)%13 == 0 )
                System.out.println();
        }
        
    }
    
}
