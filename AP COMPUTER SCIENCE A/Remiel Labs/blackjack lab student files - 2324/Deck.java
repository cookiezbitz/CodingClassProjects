/**
 * This Class represents a Deck and is meant to
 * show how to write code for larger projects.
 * 
 * @author TAS
 * @version November 2023
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private ArrayList<Card> cards; // list of cards
    private int currentCard; // index of the current card

    // constructor
    public Deck()
    {
        cards = new ArrayList<Card>();
        initializeDeck();
        currentCard = 0;
    }

    // add all 52 cards to the deck and then shuffle it
    public void initializeDeck()
    {
        // create and add 52 cards
        for(String suit: Card.SUITS)
        {
            for(int i = 1; i<Card.FACES.length; i++)
            {
                cards.add(new Card(suit,i));
            }
        }
        shuffle(); // must shuffle them!
    }

    // get the deck's size
    public int size()
    {
        return cards.size();
    }

    // deal a card (return the top card)
    public Card dealCard()
    {
        // if we reached the end, go back to the beginning
        if (currentCard >= cards.size()) {
            currentCard = 0;
        }

        return cards.get(currentCard++);
    }

    // use Colletions.shuffle to randomly shuffle the cards
    // and then reset the top card 
    public void shuffle()
    {
        currentCard = 0;
        Collections.shuffle(cards);
    }

    public String toString()
    {
        return "currentCard="+ currentCard + ", cards:" + cards;
    }
}