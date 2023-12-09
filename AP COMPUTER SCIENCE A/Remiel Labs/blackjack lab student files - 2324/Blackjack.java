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
    private int cardposd;
    private int cardposp;

    // keep track of win points for player
    private int winPoints;

    // number of rounds that have been played
    private int numRounds;

    // scanner used for keyboard input
    private Scanner kb;

    // constructor
    public Blackjack()
    {
        //Constructor provides values to all class instance variables.
        deck = new Deck();
        dealer = new Card[12];
        player = new Card[12];
        cardposd = 0;
        cardposp = 0;
        winPoints = 0;
        numRounds = 0;
        kb = new Scanner(System.in);
    }

    // "main" method in the class, used to play one complete round of Blackjack
    public void playRound()
    {

        //Declares all variables used in class
        boolean playagain = true;
        boolean over = false;
        boolean insurance = false;
        boolean ended = false;
        //boolans assist with loop logic (while loops)
        int points  = 0;
        //points count the amount of wins the player has - the amount of losses
        String response = "";
        //records the player response via kb.nextLine

        //initializes the deck with null in each array sect

        dealer[cardposd] = deck.dealCard();
        cardposd++;
        player[cardposp] = deck.dealCard();
        cardposp++;
        player[cardposp] = deck.dealCard();
        cardposp++; 
        //deals a card to the dealer and player, incraments the index accordingly

        System.out.println("Welcome to Blackjack! (this is only for fun, no betting!!)");
        System.out.println();
        //wlcomes the player to the blackjack game
        do{

            System.out.println("Dealer:  " + printHand(dealer) );
            System.out.println("Player:  [" + printHand(player) + "" + "] : "+getHandValue(player)+"");
            //prints the dealer and player's hand

            if(getHandValue(dealer) == 11 && cardposd == 1 && cardposp == 2){
                //checks if the dealer's first card is an ace
                //if so, prompts insurance

                while(true){
                    //keeps code in loop until a valid response is recieved
                    System.out.println("Player, would you like insurance? (y/n)");
                    response = kb.nextLine();
                    if(response.equals("Y") || response.equals("y")){
                        //yes! I want insurance
                        insurance = true;
                        dealer[cardposd] = deck.dealCard();
                        cardposd++;
                        //deals dealer a card and checks if it's one of the royal cards (worth 10)

                        if(getHandValue(dealer) == 21){
                            //insurance worked!
                            System.out.println(":( Dealer gets a blackjack, tough break!  :( \n Good think you had insurance!");
                            over = true;
                            //setting over to true skips the gaming segment

                            //if it is then the insurance works
                            break;
                        }else{
                            System.out.println("Dealer does NOT have a blackjack, player loses insurance!");
                            points--;
                            //deducts one point
                            break;
                        }
                    }else if(response.equals("N") || response.equals("n")){
                        //no!!! i think insurance is a SCAM!
                        insurance = false;
                        //player rejects insurance, continue as normal
                        break;
                    }
                    else{
                        System.out.println("whoops your response is invalid. please enter \"y\" or \"n\"");
                        //stop trying to trick me mr stckler >:((((((((((

                    }
                }

            }
            insurance = false;
            //resets the insurance variable;

            if(over == false){
                //goes thru game formula
                System.out.println("Player! What would you like to do? (H)it or (S)tand?");
                response = kb.nextLine();
                //takes in a response

                if(response.equals("H") || response.equals("S") || response.equals ("s") || response.equals("h")){
                    //checks if response is valid

                    if(response.equals("H") || response.equals("h")){
                        //checks if hit
                        player[cardposp] = deck.dealCard();
                        //deals player caard
                        
                        System.out.println();
                        System.out.println("*** " + player[cardposp] + " ***");
                        System.out.println();

                        cardposp++;
                        //increases card index
                        if(getHandValue(player) == 21){
                            points++;
                            points++;
                            System.out.println("!!! Player gets a blackjack and 2 points, nice! !!!");
                            //gives player double points because this situation player hits blackjack
                            over =true;

                        }else if( getHandValue(player) > 21){
                            //if player goes over 21
                            System.out.println("### Player busted! Dealer wins! ###");
                            points--;
                            //minus point
                            over = true;

                        }
                    } else if(response.equals("S") || response.equals("s")){
                        //this situation runs if the player chooses to stand
                        while(getHandValue(dealer) < 17 && getHandValue(dealer) !=21){
                            //the dealer increases in cards until it's hand is more than the player's
                            dealer[cardposd] = deck.dealCard();

                            System.out.println("*** " + dealer[cardposd] + " ***");
                            cardposd++;
                        }
                        System.out.println("Dealer:  [" + printHand(dealer) + "] " + ": "+getHandValue(dealer)+"");
                        //prints th deealer's new hand
                        if(getHandValue(dealer)==getHandValue(player)){
                            //checks for winner

                            System.out.println("### Push! Round is tied ###");
                            over = true;

                        }else if(getHandValue(dealer) > getHandValue(player) && getHandValue(dealer)<22){
                            //dealer wins
                            System.out.println(" ### Dealer Wins! ###");
                            points--;
                            over = true;
                        }else{
                            //player wins
                            System.out.println("$$$ Player wins! $$$");
                            points++;
                            over = true;
                            //remove one point;
                        }

                    }
                } 
                else{
                    System.out.println("whoops your response is invalid. please enter \"h\" or \"s\"");
                    //response = kb.nextLine();
                }

            }
            while(over){
                //ask if play again  if game is over  
                System.out.println("Score is: " + points);
                System.out.println("Wow, that was fun! You want to play again? (y/n)");
                response = kb.nextLine();
                if(response.equals("Y") || response.equals("y")){
                    //yes! I want to play again
                    over = false;
                    resetHands();
                }else if(response.equals("N") || response.equals("n")){
                    //no!!! im evil!
                    System.out.println("That was fun, come back if you want more practice!");
                    over = true;
                    ended = true;
                    break;
                    //resetHands();
                    //ended = true;

                }
                else{
                    System.out.println("whoops your response is invalid. please enter \"y\" or \"n\"");
                    //response = kb.nextLine();
                }
                if(over ==true){
                    break;
                }
            }

        }while(!ended);

    }
    // after a round, clear out the player/dealer hands
    public void resetHands()
    {
        //clear out the arrays
        for(int i = 0; i < dealer.length; i++){
            dealer[i] = null;
            player[i] = null;
            //sets all array index values to null
        }

        cardposd = 0;
        cardposp = 0;
        //resets indexes

        numRounds++;
        //+1 round passed

        if(numRounds%4 ==0){
            deck.shuffle();
            System.out.println(" @@@@@@ Wait a sec, shuffling deck @@@@@@");
            //calls shuffle method
        }
        dealer[cardposd] = deck.dealCard();
        cardposd++;
        player[cardposp] = deck.dealCard();
        cardposp++;
        //prepares game for next match.
    }

    // return a nicely formatted string of the cards in a hand
    public String printHand(Card[] cards)
    {
        String out = "";

        for( Card c : cards){
            if(c != null){
                out += c.toString() + ", ";
                //gets and prints all cards in the hand
            }
        }
        
        out = out.substring(0,out.length()-2);
        //gets rid of the comma at the end

        return out;
    }

    /*
    // look at the current hands and determine a winner, and print it out
    public void checkWinner()
    {
    if(getHandValue(player) > getHandValue(dealer)){
    System.out.println("lol player won");
    }
    else if(getHandValue(player) < getHandValue(dealer)){
    System.out.println("lol dealer won");
    }
    else{
    System.out.println("lmao no one won, you ar all losers");
    }

    }
     */
    // calculate the value of a hand (be sure to handle aces correctly!)
    public int getHandValue(Card[] cards)
    {
        int sum = 0;
        for( Card c : cards){
            if(c != null){
                if(c.getFace() ==1 && sum < 10 || sum == 10){
                    sum+= c.getValue();
                } else if(c.getFace() != 1){
                    sum+= c.getValue();
                }
                else{
                    sum++;
                }

            }
        }
        //gets the sum of all card valuees in a given hand

        return sum;
    }

}