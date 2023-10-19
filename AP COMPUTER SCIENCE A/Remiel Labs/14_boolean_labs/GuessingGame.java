//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
    private int upperBound;

    public GuessingGame(int stop)
    {
        upperBound = stop;
        
    }

    public void playGame()
    {
        Scanner kb = new Scanner(System.in);
        double num = Math.floor(Math.random()*upperBound+1);
        boolean go = true;
        int losscount = 0;
        double percent;
        
        while(go){
            System.out.println("gimmie a num:");
            int beans = kb.nextInt();
            if(num == beans){
                System.out.println("It took " + losscount + " guesses to guess " + num);
                //System.out.println("You guessed wrong" 40 percent of the time."
                break;
            }
            losscount++;
        }
        
    }

    public String toString()
    {
        String output="";
        return output;
    }
}