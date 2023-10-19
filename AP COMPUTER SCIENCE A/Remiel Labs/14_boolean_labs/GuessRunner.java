//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
    public static void main(String args[])
    {
        int num12;
        boolean gamin = true;
        
        while(gamin == true){
        Scanner kb = new Scanner(System.in);
        System.out.println("hi, how many nums do you want");
        num12 = kb.nextInt();
        GuessingGame game = new GuessingGame(num12);
        game.playGame();
        String response;
        System.out.println("hi, play again? Y/N");
        response = kb.next();
        if(response.equals("N") || response.equals("n")){
            gamin = false;
        }
        
    }
    }
}