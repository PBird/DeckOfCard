/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadeck;

import java.util.Random;

/**
 *
 * @author sergen
 */
public class Deck { 
    private Card[] cards;
    
    Deck(){
        defaultDeck();
    }
    Deck(Card[] cards)
    {
        this.cards = cards;
    }

    public void defaultDeck() {
 
        cards = new Card[52];
        int count=0;
        for(int j=0;j<4;j++)
            for(int i=0;i<13;i++)
            {
                cards[count] = new Card(i,j);
                count++;
            }

    }
    public void reshuffle() {
        Random randomGenerator = new Random();
        
        int shuffleTimes = randomGenerator.nextInt(75)+cards.length*2;
        
        for(int i=0; i<shuffleTimes ; i++ ){
            int random = randomGenerator.nextInt(cards.length);
            int randomNext = randomGenerator.nextInt(cards.length);
            
            Card temp = cards[random];
            cards[random] = cards[randomNext];
            cards[randomNext] = temp;
      
        }
        
    }
    
    public Card[] getCards() {
        return cards;
    }
    
    
    
}
