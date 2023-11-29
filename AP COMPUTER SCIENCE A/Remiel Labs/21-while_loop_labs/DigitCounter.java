//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class DigitCounter
{
   public static int go( int number )
    {
        String num = Integer.toString(number);
        int numby = 0;
        for(int x = 0; x<num.length(); x++){
            numby++;
        }
        return numby;
    }
}