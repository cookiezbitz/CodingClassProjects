//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StarsAndStripes
{
    public StarsAndStripes()
    {
        out.println("StarsAndStripes");
        printTwoBlankLines();
    }

    public void printTwentyStars()
    {
        
        for(int i = 0; i<20; i++){
            System.out.print("*");
            
        }
        System.out.println();
    }

    public void printTwentyDashes()
    {
        for(int y = 0; y<20; y++){
            System.out.print("-");
        }
        System.out.println();
    }

    public void printTwoBlankLines()
    {
        System.out.println();
        System.out.println();

    }

    public void printASmallBox()
    {    
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }

    public void printABigBox()
    {     
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }   
    
    

    
}