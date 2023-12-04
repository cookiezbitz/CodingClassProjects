// Class: Blackjack
// Purpose: Main class used to play the card game Blackjack
// @author TAS
// @version November 2023

import java.util.Scanner;

public class Blackjack
{
    // deck of cards used for this game
    private Deck deck;
    
    // arrays to hold the dealer's and player's hands
    private Card[] dealer;
    private Card[] player;
    
    // indexes to keep track of cards in players hands
    private int dealerIndex;
    private int playerIndex;
    
    
    // keep track of win points for player
    private int winPoints;
    
    
    // number of rounds that have been played
    private int numRounds;
    
    
    // scanner used for keyboard input
    private Scanner kb;

    // constructor
    public Blackjack()
    {
        deck = new Deck();
        dealer = new Card[12];
        player = new Card[12];
        dealerIndex = 0;
        playerIndex = 0;
        winPoints = 0;
        numRounds = 0;
        kb = new Scanner(System.in);
    }

    // "main" method in the class, used to play one complete round of Blackjack
    public void playRound()
    {
        //use a dowhile loop, print the hand
    }

    // after a round, clear out the player/dealer hands
    public void resetHands()
    {
        //clear out the arrays
        for(int i = 0; i < dealer.length; i++){
            dealer[i] = null;
            player[i] = null;
        }
        
        playerIndex = 0;
        dealerIndex = 0;
        
        numRounds++;
        
        if(numRounds%4 ==0){
            deck.shuffle();
            System.out.println(" whoops im shuffling the deck lmao, gimmie a sec");
            //EDIT THIS TO THE RIGHHT TEXT LATER.
        }
    }
    
    // return a nicely formatted string of the cards in a hand
    public String printHand(Card[] cards)
    {
        String out = "";
        
        for( Card c : cards){
            if(c != null){
                out += c.toString() + ", ";
            }
        }
        //remov
        return out;
    }

    // look at the current hands and determine a winner, and print it out
    public void checkWinner()
    {
    }

    // calculate the value of a hand (be sure to handle aces correctly!)
    public int getHandValue(Card[] cards)
    {
        int sum = 0;

        return sum;
    }
    
}