//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;import static java.lang.System.*;

public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        char response;
        
        //add in a do while loop after you get the basics up and running
        
            String player = "";
        
            out.print("type in your prompt [R,P,S] :: ");
            
            player = kb.next();
            
            
            
            
            //read in the player value
        
            RockPaperScissors game = new RockPaperScissors(player);  
            System.out.println(game);
            System.out.println(game.determineWinner() + "wins!");
    }
}



