//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class CountEvens
{
   public static int go( int number )
    {
        int nummers = 0;
        String num = Integer.toString(number);
        int x = num.length();
        while(number > 0){
            int pp = number%10;
            if(pp%2 == 0)
            nummers++;
            
            number/=10;
            
            
        }
        return nummers;
    }
}