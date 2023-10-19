//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
    private String password;

    public PasswordCheck()
    {
        password = "puppies!";
    }

    public void check()
    {
        Scanner kb = new Scanner(System.in);
        boolean correct = false;
        String guess;
        while(!correct){
            System.out.println("Enter password por favor");
            guess = kb.next();
            if(guess.equals(password)){
                System.out.println("VALID");
                correct = true;
            }
            else{
                out.println("INVALID");
            }
        }
    }
}