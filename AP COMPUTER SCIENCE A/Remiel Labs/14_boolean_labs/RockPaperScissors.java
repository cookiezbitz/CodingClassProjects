//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;

    public RockPaperScissors(String player)
    {
        double random123;
        random123 = Math.floor(Math.random()*3 + 1);
        playChoice = player;

        if(random123 == 1)
            compChoice = "R";
        else if(random123 == 2)
            compChoice = "P";
        else if(random123 == 3)
            compChoice = "S";

    }

    public String determineWinner()
    {
        String winner="";
        if(compChoice.equals(playChoice)){
            winner = "tie";
        }
        else if(compChoice.equals("R") && playChoice.equals("P")){
            winner = "player";
        }
        else if(compChoice.equals("P") && playChoice.equals("R")){
            winner = "comp";
        }

        else if(compChoice.equals("R") && playChoice.equals("S")){
            winner = "comp";
        }
        else if(compChoice.equals("S") && playChoice.equals("R")){
            winner = "PLAYER";
        }
        else if(compChoice.equals("P") && playChoice.equals("R")){
            winner = "comp";
        }
        else if(compChoice.equals("R") && playChoice.equals("P")){
            winner = "PLAYER";
        }

        else if(compChoice.equals("S") && playChoice.equals("P")){
            winner = "comp";
        }
        else if(compChoice.equals("P") && playChoice.equals("S")){
            winner = "player";
        }
        else{
            System.out.println("uh oh make sure it's in caps");
            return winner;
        }
        return winner;
    }

    public String toString()
    {
        String output="player had " + playChoice + "\n comp had " + compChoice ;
        
        return output;
    }
}