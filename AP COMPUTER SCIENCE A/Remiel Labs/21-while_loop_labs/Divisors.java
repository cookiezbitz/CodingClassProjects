//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Divisors
{
    public static String getDivisors( int number )
    {
        String divisors= number + " has divisors "+ " ";
        for(int x = number-1; x> 0 ; x--){
            if(number%x == 0){
                divisors += x + " ";
            }
        }
        return divisors; 
    }
}